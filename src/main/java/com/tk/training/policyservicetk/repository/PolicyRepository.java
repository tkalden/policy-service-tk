package com.tk.training.policyservicetk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tk.training.policyservicetk.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String>{
	
}
