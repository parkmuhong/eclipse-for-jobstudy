package com.spring.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.account.dao.AccountDAO;
import com.spring.account.dao.AccountDAOimpl;

@Service("accountService")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceimpl implements AccountService{
	@Autowired
	private AccountDAO accDAO;

	@Override
	public void sendMoney() throws Exception {
		accDAO.updateBalance1();
		accDAO.updateBalance2();
	}
}


