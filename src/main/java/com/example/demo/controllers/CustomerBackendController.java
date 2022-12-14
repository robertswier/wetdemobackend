package com.example.demo.controllers;

import com.example.demo.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/api/hola

@RestController
@RequestMapping("/backend")
public class CustomerBackendController {

    @RequestMapping(method = RequestMethod.GET, value = "/customer",
            produces = "text/plain")
    public String getCustomerString() {
        return " String Tim from BACKEND";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/customer/object")
    public Customer getCustomer() {
        return new Customer("customer object from backend");
    }

}
