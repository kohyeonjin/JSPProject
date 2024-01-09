package com.myproject.model;

import com.myproject.util.MovieUtil;

public class CustomerDAO {

	private static CustomerDAO instance = new CustomerDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	
	private CustomerDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			}
	}
	public static CustomerDAO getInstance() {
		
		return instance;
	}
	
}
