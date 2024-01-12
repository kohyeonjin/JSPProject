package com.mymovie.controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymovie.board.model.BoardVO;
import com.mymovie.board.service.BoardService;
import com.mymovie.board.service.BoardServiceImpl;
import com.myproject.model.CustomerVO;

@WebServlet("*.board")
public class BoradController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BoradController() {
        super();
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
		
		BoardService service = new BoardServiceImpl();
		
		
		if(path.equals("/Board/list.board")) {
			
			ArrayList<BoardVO> list = service.getList();
			
			System.out.println(list.toString());
			request.setAttribute("list", list);
			request.getRequestDispatcher("board_list.jsp").forward(request, response);
			
			
		}else if(path.equals("/Board/write.board")) {//글쓰기화면
			
			request.getRequestDispatcher("board_write.jsp").forward(request, response);
			 
		}else if(path.equals("/Board/registForm.board")) {
			
			service.regist(request, response);
			
			request.getRequestDispatcher("/Board/list.board").forward(request, response);
			
		}
		else if(path.equals("/Board/delete.board")) {//삭제기능
			service.delete(request, response);
			
			response.sendRedirect("list.board");//목록이동
		}else if(path.equals("/Board/registForm.board")) {
			
			service.regist(request, response);
			
			request.getRequestDispatcher("/Board/list.board").forward(request, response);
			
		}else if(path.equals("/Board/content.board")) {
			
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			System.out.println(vo);
			request.getRequestDispatcher("board_content.jsp").forward(request, response);
			
		}else if (path.equals("/Board/modify.board")) {
			
				
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			request.getRequestDispatcher("board_modify.jsp").forward(request, response);
			
			
		}else if(path.equals("/Board/update.board")) {
			
		int result = service.update(request, response);
		
		if(result == 1) { //수정성공
			
			response.sendRedirect("content.board?boardid="+request.getParameter("boardid"));
		}else {
			response.sendRedirect("modify.board?boardid="+request.getParameter("boardid"));
		}
			
		}
		 
		
		
	}
}
