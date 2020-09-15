package com.avizandum.identity.repository;

import com.avizandum.identity.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
