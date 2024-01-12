package com.myproject.board.util.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter({"/Board/write.board","/Board/registForm.board"})
public class BoardFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res= (HttpServletResponse)response;
		
		System.out.println("필터작동함");
		HttpSession session = req.getSession();
		String boardid=(String)session.getAttribute("customerId");
		System.out.println(boardid);
		if(boardid == null) {
			//아이디가 존재하지 않음
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('권한이 없습니다.');");
			out.println("location.href='list.board';");
			out.println("</script>");
			return;
		}
		
		
		chain.doFilter(request, response);
		
	}
	
}
