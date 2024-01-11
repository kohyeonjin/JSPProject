package com.mymovie.board.model;

import com.myproject.model.CustomerDAO;
import com.myproject.util.MovieUtil;

public class BoardDAO {
	
	
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			}
	}
	public static BoardDAO getInstance() {
		
		return instance;
	}
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
}
