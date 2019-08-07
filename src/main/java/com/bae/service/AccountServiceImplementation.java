package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.bae.entity.Account;
import com.bae.entity.AccountDTO;

@Service
public class AccountServiceImplementation implements AccountService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	public AccountServiceImplementation(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Override
	public void sendToQueue(Account account) {
		AccountDTO accountToStore = new AccountDTO(account);
		jmsTemplate.convertAndSend("AccountQueue", accountToStore);
	}
}