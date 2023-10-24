package com.example.orderservice.feign;

import com.example.orderservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-serv")
public interface CustomerRestClientService
{
    @GetMapping(path = "/customers")
     PagedModel<Customer> allCustomers();

    @GetMapping(path = "/customers/{id}")
     Customer customerById(@PathVariable Long id);



}
