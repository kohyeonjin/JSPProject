package com.mymovie.customer.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.model.CustomerDAO;
import com.myproject.model.CustomerVO;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDAO dao = CustomerDAO.getInstance();
	
	@Override
	public int join(HttpServletRequest request, HttpServletResponse response) {
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		
		System.out.println(id);
		
		
		int result = dao.idCheck(id);
		
		
		
		if(result==1) {
			return result;
			
		}else {
			CustomerVO vo = new CustomerVO(id,name,Integer.parseInt(age),pw,email,address,phone);
			dao.insertCustomer(vo);
			return 0;
		}
	
	}

}
