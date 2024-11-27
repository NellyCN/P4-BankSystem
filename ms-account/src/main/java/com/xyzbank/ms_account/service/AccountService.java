package com.xyzbank.ms_account.service;

import com.xyzbank.ms_account.model.Account;
import com.xyzbank.ms_account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

//    public Account createAccount(Account account) {
//        return accountRepository.save(account);
//    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
