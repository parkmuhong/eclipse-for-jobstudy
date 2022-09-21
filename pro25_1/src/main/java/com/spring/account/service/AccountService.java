package com.spring.account.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public interface AccountService {
	
	public void sendMoney() throws Exception;


}