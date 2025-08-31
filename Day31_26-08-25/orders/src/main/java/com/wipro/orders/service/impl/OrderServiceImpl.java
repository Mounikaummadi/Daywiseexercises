package com.wipro.orders.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.web.header.Header;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.orders.dto.Movie;
import com.wipro.order.dto.Payment;
import com.wipro.order.entity.OrderEntity;
import com.wipro.order.entity.OrderMaster;
import com.wipro.order.repo.OrderMasterRepo;
import com.wipro.order.repo.OrderRepo;
import com.wipro.order.service.OrderService;
import com.wipro.order.util.AppConstant;
 

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	OrderMasterRepo orderMasterRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
 
	public List<OrderEntity> findAll() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

 
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		Optional<OrderEntity> orderOpt= orderRepo.findById(id);
		if(orderOpt.isPresent())
		{
			return orderOpt.get();
		}
		return null;
	}

	public OrderEntity save(OrderEntity order,String token) {
	  
		//1. Generate Order Id:
		List<OrderMaster> orderMaster=orderMasterRepo.findAll();
		System.out.println(orderMaster);
		String orderId=null;
		if(orderMaster!=null)
		{	
			OrderMaster orderMasterData =orderMaster.get(orderMaster.size()-1);
			int value=orderMasterData.getValue()+1;
			String strValue=String.format("%04d", value);
		    orderId="ORD-"+strValue;
			System.out.println(orderId);
			orderMasterData.setValue(value);
			orderMasterRepo.save(orderMasterData);
		}
		//2.Create an order object 
//		OrderEntity orderData= new OrderEntity();
		order.setOrderId(orderId);
		order.setOrderStatus(0);
		
		//3 make a call to the Movie service
		String url="http://MOVIE-MS/movie/"+order.getMovieId();
		System.out.println("url="+url);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", token);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.GET, entity, Movie.class);
		Movie m=response.getBody();
		System.out.println("ticket Price="+m.getTicketPrice()); 
		order.setTotalOrderPrice(order.getNumberOfTicket()*m.getTicketPrice());
		orderRepo.save(order);
		return order;
	}

 
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		orderRepo.deleteById(id);
	}


	@Override
	public void pay(Payment payment) {
		// TODO Auto-generated method stub
		kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME,payment)	;
	}


}