package com.myproject.board.util.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebFilter({"/Board/modify.board", "/Board/update.board", "/Board/delete.board"})
public class BoardAuthFilter implements Filter {
   


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		request.setCharacterEncoding("utf-8");
		
		//세션얻음
		System.out.println("필터동작함");
		HttpSession session = req.getSession();
		String boardid=(String)session.getAttribute("customerId");
		String writer= req.getParameter("boardcustomerid");
		System.out.println(boardid+writer);
		if(writer ==null) {
			res.sendRedirect(req.getContextPath() +"/customer/login.customer");
			return;
		}
		if(boardid ==null) {
			res.sendRedirect(req.getContextPath() + "/customer/login.customer");
			return;
		}
		if( ! boardid.equals(writer)) {
			//로그인이 안된상탵
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('권한이 없습니다.');");
			out.println("location.href='list.board'; ");
			out.println("</script>");
			System.out.println("1");
			return;
		}
		
		
		
		chain.doFilter(request,response);
	}

	
	

}
