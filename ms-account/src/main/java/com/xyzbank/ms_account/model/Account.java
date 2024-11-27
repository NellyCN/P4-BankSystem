package com.xyzbank.ms_account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(unique = true)
    private String account_number;
    private double balance=0.0;
//    private AccountType account_type;
    private String customer_id;

    public enum AccountType {       // Se crea el tipo de dato enum
        AHORROS, CORRIENTE
    }
}