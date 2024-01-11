package com.mymovie.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.IIOException;
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
				session.setAttribute("customerId",vo.getCustomerId() );
				session.setAttribute("name", vo.getName() );

				request.getRequestDispatcher("../index.jsp").forward(request, response);
			}else {

				request.setAttribute("msg","아이디/비밀번호를 확인하세요" );
				request.getRequestDispatcher("customer_login.jsp").forward(request, response);

			}
			
		}else if (path.equals("/customer/logout.customer")) {
				HttpSession session = request.getSession();
				session.invalidate();
				response.sendRedirect(request.getContextPath());


			}else if (path.equals("/customer/page.customer")) {
				
				request.getRequestDispatcher("customer_page.jsp").forward(request, response);
				
			}else if (path.equals("/customer/update.customer")){
				
				CustomerVO vo = service.getinfo(request, response);
				
				request.setAttribute("vo", vo);
				request.getRequestDispatcher("customer_update.jsp").forward(request, response);
				
			}else if(path.equals("/customer/updateForm.customer")) {
				
				int result = service.update(request,response);
				
				if(result == 1) {
		
					
					//브라우저 화면에 직접 응답을 해주는 형태
					response.setContentType("text/html; charset=UTF-8");
					
					PrintWriter out = response.getWriter();				
					out.println("<script>");
					out.println("alert('업데이트에 성공했습니다.');");
					out.println("location.href ='../index.jsp';");
					out.println("</script>");
					
				}else {
					
					response.sendRedirect("page.customer");
				}
				
				
			}
			else if(path.equals("/customer/delete.customer")) {//탈퇴화면
				request.getRequestDispatcher("customer_delete.jsp").forward(request, response);
				
			}else if(path.equals("/customer/deleteForm.customer")) {
				int result = service.delete(request, response);
				
				if(result==1) {
					response.setContentType("text/html; charset=UTF-8");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('정상적으로 탈퇴되었습니다');");
					out.println("</script>");
				}else {
					request.setAttribute("msg","비밀번호를 확인하세요");
					request.getRequestDispatcher("customer_delete.jsp").forward(request, response);
				}
				
		
	
	


			}else if (path.equals("/customer/page.customer")) {
				
				request.getRequestDispatcher("customer_page.jsp").forward(request, response);
				
			}else if (path.equals("/customer/update.customer")){
				
				CustomerVO vo = service.getinfo(request, response);
				
				request.setAttribute("vo", vo);
				request.getRequestDispatcher("customer_update.jsp").forward(request, response);
				
			}else if(path.equals("/customer/updateForm.customer")) {
				
				int result = service.update(request,response);
				
				if(result == 1) {
		
					
					//브라우저 화면에 직접 응답을 해주는 형태
					response.setContentType("text/html; charset=UTF-8");
					
					PrintWriter out = response.getWriter();				
					out.println("<script>");
					out.println("alert('업데이트에 성공했습니다.');");
					out.println("location.href ='../index.jsp';");
					out.println("</script>");
					
				}else {
					
					response.sendRedirect("page.customer");
				}
			}
}
}
				
				
			
			
		
	
	

