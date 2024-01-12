package com.mymovie.customer.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.CustomerVO;

public interface CustomerService {
	
	public CustomerVO login(HttpServletRequest request, HttpServletResponse response);

	public int join(HttpServletRequest request, HttpServletResponse response);
	
	public CustomerVO getinfo(HttpServletRequest request, HttpServletResponse response);
	
	public int update(HttpServletRequest request, HttpServletResponse response);
	
	public int delete(HttpServletRequest request, HttpServletResponse response);
	
	
}