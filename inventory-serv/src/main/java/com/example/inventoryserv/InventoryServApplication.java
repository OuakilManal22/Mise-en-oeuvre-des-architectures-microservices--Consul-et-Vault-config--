package com.example.inventoryserv;

import com.example.inventoryserv.entities.Product;
import com.example.inventoryserv.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository)
    {
        return args -> {
            productRepository.saveAll(List.of(
                    Product.builder().name("PC")
                            .price(1200)
                            .quantity(10)
                            .build(),
                    Product.builder().name("PHONE")
                            .price(1000)
                            .quantity(20)
                            .build()
            ));

        };
    }
}
