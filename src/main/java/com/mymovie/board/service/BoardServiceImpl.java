package com.mymovie.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymovie.board.model.BoardDAO;
import com.mymovie.board.model.BoardVO;

public class BoardServiceImpl implements BoardService {
	private BoardDAO dao=BoardDAO.getInstance();
	@Override
	public void regist(HttpServletRequest request, HttpServletResponse response) {
		
		String boardid = request.getParameter("boardid");
		String boardtitle = request.getParameter("boardtitle");
		String boardtext = request.getParameter("boardtext");
	
		
		System.out.println(boardtitle);
		
	}
	@Override
	public ArrayList<BoardVO> getList() {
		
		ArrayList<BoardVO> list  = dao.getList();
		
		return list;
	}

	
	@Override
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("boardid");
		dao.delete(id); //오버라이딩된 delete
		
	}
	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		
		String bno = request.getParameter("boardid");
		BoardVO vo = dao.getContent(bno);
		
		return vo;
	}
	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {
		
		String boardid = request.getParameter("boardid");
		String title = request.getParameter("title");
		String boardtext = request.getParameter("text");
		
		int result = dao.update(boardid, title, boardtext);
		
		return result;
	}

	


}