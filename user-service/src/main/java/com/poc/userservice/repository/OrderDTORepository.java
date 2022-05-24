package com.poc.userservice.repository;

import com.poc.userservice.dto.OrderDTO;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface OrderDTORepository extends CouchbaseRepository<OrderDTO, Integer> {
}
