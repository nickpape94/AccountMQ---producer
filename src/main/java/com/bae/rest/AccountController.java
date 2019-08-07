package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Account;
import com.bae.service.AccountService;

@RestController
@RequestMapping("/Account")
public class AccountController {

	private AccountService service;

	public AccountController() {

	}

	@Autowired
	public AccountController(AccountService service) {
		this.service = service;
	}

	@PostMapping("/postAccount")
	public ResponseEntity<Object> createAccount(@RequestBody Account account) {
		service.sendToQueue(account);
		return new ResponseEntity<>("Account Created", HttpStatus.OK);
	}
}