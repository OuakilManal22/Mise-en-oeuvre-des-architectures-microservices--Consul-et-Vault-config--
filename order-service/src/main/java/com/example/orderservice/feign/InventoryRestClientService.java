package com.example.orderservice.feign;

import com.example.orderservice.model.Customer;
import com.example.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="inventory-serv")
public interface InventoryRestClientService
{
    @GetMapping("/products")
    PagedModel<Product> allProducts();
    @GetMapping("/products/{id}")
    Product productById(@PathVariable Long id);



}
