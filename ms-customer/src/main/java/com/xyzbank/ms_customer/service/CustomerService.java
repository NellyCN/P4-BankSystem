package com.xyzbank.ms_customer.service;

import com.xyzbank.ms_customer.model.Customer;
import com.xyzbank.ms_customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();  // Obtiene todos los clientes de la base de datos
    }
}
