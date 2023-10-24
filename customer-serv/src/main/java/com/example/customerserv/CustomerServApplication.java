package com.example.customerserv;

import com.example.customerserv.entities.Customer;
import com.example.customerserv.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository)
    {
        return args -> {
            customerRepository.saveAll(List.of(
                    Customer.builder()
                            .name("Manal")
                            .email("manalouakil16@gmail.com")
                            .build(),
                    Customer.builder()
                            .name("Leen")
                            .email("Leen@gmail.com")
                            .build()
            ));

            customerRepository.findAll().forEach(System.out::println);

        };
    }

}
