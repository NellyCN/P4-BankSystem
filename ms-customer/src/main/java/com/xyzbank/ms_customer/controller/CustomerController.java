package com.xyzbank.ms_customer.controller;


import com.xyzbank.ms_customer.model.Customer;
import com.xyzbank.ms_customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();   // Llama al servicio para obtener todos los clientes
    }
}