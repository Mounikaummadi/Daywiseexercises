package com.wipro.mockitodemo1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class OrderServiceTest {

	@Test
    public void testPlaceOrderMocked() {
        // Create mock of OrderService
        OrderService mockOrderService = Mockito.mock(OrderService.class);

        // Define behavior: when "ORD-01" is passed, return "successful"
        when(mockOrderService.placeOrder("ORD-01")).thenReturn("successful");

        // Call the method
        String result = mockOrderService.placeOrder("ORD-01");

        // Assert the result
        assertEquals("successful", result);

        // Verify that the method was called with "ORD-01"
        verify(mockOrderService).placeOrder("ORD-01");
    }


}
