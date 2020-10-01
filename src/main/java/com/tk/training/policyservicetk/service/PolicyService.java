package com.tk.training.policyservicetk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.training.policyservicetk.model.Customer;
import com.tk.training.policyservicetk.model.Policy;
import com.tk.training.policyservicetk.repository.PolicyRepository;

@Service
public class PolicyService {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	PolicyRepository policyRepository;
	
	public Policy createPolicy (Policy policy) {
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		policyRepository.save(policy);
		return null;
	}

	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		return policyRepository.findAll();
	}

}
