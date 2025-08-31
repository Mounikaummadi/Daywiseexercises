package com.wipro.spring.beans;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Mobile {
	private Display display;
	@Autowired
	public Mobile(Display display) {
		super();
		this.display = display;
	}
	@Override
	public String toString() {
		return "Mobile [size=" + display + "]";
	}
	

}
