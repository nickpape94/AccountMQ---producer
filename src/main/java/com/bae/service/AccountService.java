package com.bae.service;

import org.springframework.stereotype.Service;

import com.bae.entity.Account;

@Service
public interface AccountService {

	void sendToQueue(Account account);

}