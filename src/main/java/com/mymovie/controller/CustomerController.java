package com.mymovie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymovie.customer.service.CustomerService;
import com.mymovie.customer.service.CustomerServiceImpl;


@WebServlet("*.customer")
public class CustomerController extends HttpServlet {
	
	CustomerService service = new CustomerServiceImpl();
       
  
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			request.setCharacterEncoding("utf-8");
			
			String uri = request.getRequestURI();
			
			String path = uri.substring(request.getContextPath().length());
			
			System.out.println(path);
			
			
			
			if(path.equals("/customer/reservation.customer")) {
				response.sendRedirect("customer_reservation.jsp");
			}else if(path.equals("/customer/login.customer")) {
				response.sendRedirect("customer_login.jsp");
			}else if(path.equals("/customer/join.customer")) {
				response.sendRedirect("customer_join.jsp");
			}else if(path.equals("/customer/joinForm.customer")) {

				int result = service.join(request, response);
				
				System.out.println(1);
			}
			
	
	}

}
