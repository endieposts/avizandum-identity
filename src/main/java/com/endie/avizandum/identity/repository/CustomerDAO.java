package com.endie.avizandum.identity.repository;

import com.endie.avizandum.identity.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
