package com.spring.account_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public interface AccountController   {
		public ModelAndView sendMoney(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
