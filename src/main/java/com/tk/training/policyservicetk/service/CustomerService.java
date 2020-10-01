package com.tk.training.policyservicetk.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tk.training.policyservicetk.model.Customer;

@Service
public class CustomerService {

	public Customer getCustomerDetails(String customerId) {
		
		RestTemplate restTemplate = new RestTemplate();
		Customer response = restTemplate.getForObject("http://localhost:8081/mongoCustomers/"+customerId, Customer.class);
		return response;
	}
	;
	
}
