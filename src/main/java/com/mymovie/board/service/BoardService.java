package com.mymovie.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mymovie.board.model.BoardVO;

public interface BoardService  {
	
	public void regist(HttpServletRequest request, HttpServletResponse response);
	public void delete(HttpServletRequest request, HttpServletResponse response);
	public ArrayList<BoardVO> getList();
}
