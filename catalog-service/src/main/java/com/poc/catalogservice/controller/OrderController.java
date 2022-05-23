package com.poc.catalogservice.controller;

import com.poc.catalogservice.entity.Order;
import com.poc.catalogservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{category}")
    public List<Order> getOrdersByCategory(@PathVariable("category") String category){
        return orderRepository.findByCategory(category);
    }

    @PostConstruct
    public void initOrders() {
        orderRepository.saveAll(Stream.of(new Order(1,"Puma Shoes", "Shoes"),
                new Order(2,"T-Shirt", "clothes"),
                new Order(3,"Jeans", "clothes"),
                new Order(4,"Laptop", "electronics"),
                new Order(5,"digital watch", "electronics"),
                new Order(6,"Fan", "electronics")).collect(Collectors.toList()));
    }
}
