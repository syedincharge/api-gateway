package com.rizvi.spring.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ServiceFallBackController {

    @GetMapping("/customerService")
    public Mono<String> customerServiceFallBack(){
        return Mono.just("Customer Service is taking too long to respond or is down. Please Try again later");
    }


    @GetMapping("/bookService")
    public Mono<String>  bookServiceFallBack(){
        return Mono.just("Book Service is taking too long to respond or is down. Please Try again later");
    }


}
