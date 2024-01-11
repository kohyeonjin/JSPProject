package com.mymovie.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServiceImpl implements BoardService {

	@Override
	public void regist(HttpServletRequest request, HttpServletResponse response) {
		
		String boardid = request.getParameter("boardid");
		String boardtitle = request.getParameter("boardtitle");
		String boardtext = request.getParameter("boardtext");
		
		System.out.println(boardtitle);
		
	}

}
