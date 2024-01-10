package com.mymovie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mymovie.customer.service.CustomerService;
import com.mymovie.customer.service.CustomerServiceImpl;
import com.myproject.model.CustomerVO;


@WebServlet("*.customer")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
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
			
			CustomerService service = new CustomerServiceImpl();
			
			if(path.equals("/customer/reservation.customer")) {
				response.sendRedirect("customer_reservation.jsp");
			}else if(path.equals("/customer/login.customer")) {
				response.sendRedirect("customer_login.jsp");
			}else if(path.equals("/customer/join.customer")) {
				response.sendRedirect("customer_join.jsp");
			}else if(path.equals("/customer/login.customer")) {
				request.getRequestDispatcher("customer_login.jsp").forward(request, response);
			}else if(path.equals("/customer/joinForm.customer")) {
					
				int result = service.join(request, response);
				
				
				if(result == 1) {
					request.setAttribute("msg", "아이디가 중복되었습니다");
					request.getRequestDispatcher(path);
				}else {
					response.sendRedirect("login.customer");
					
					
				}
				
			}else if(path.equals("/customer/loginForm.customer")) {
					
				CustomerVO vo = service.login(request, response);
				
				if(vo != null) {
					HttpSession session = request.getSession();
					session.setAttribute("CustomerId", vo.getCustomerId() );
					session.setAttribute("name", vo.getName() );
					
					request.getRequestDispatcher("../index.jsp").forward(request, response);
				}else {
					
					request.setAttribute("msg","아이디/비밀번호를 확인하세요" );
					request.getRequestDispatcher("customer_login.jsp").forward(request, response);
					
				}
			}
	}
	}
