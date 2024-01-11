package com.mymovie.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.myproject.model.CustomerDAO;
import com.myproject.util.MovieUtil;

public class BoardDAO {
	
	
	private static BoardDAO dao = new BoardDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	
	private BoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			} catch (Exception e) {
			}
	}
	public static BoardDAO getInstance() {
		
		return dao;
	}
	
	
	
	public void insert (String boardtitle,String boardtext,String board_customer_id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into board values(board_seq.nextval,?,SYSDATE,?,?)";
				
		try {
			
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardtext);
			pstmt.setString(2,board_customer_id);
			pstmt.setString(3, boardtitle);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
		
		
	}
	
	public ArrayList<BoardVO> getList(){
		
		ArrayList<BoardVO> list = new ArrayList<>();
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM BOARD";
		
		try {
			
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				BoardVO vo = new BoardVO();
				
				
				String id= rs.getString("BOARDID");
				String text = rs.getString("BOARDTEXT");
				Timestamp date = rs.getTimestamp("BOARDDATE");
				String cusid = rs.getString("BOARD_CUSTOMER_ID");
				String title = rs.getString("BOARDTITLE");
				
				vo.setBoardid(Integer.parseInt(id));
				vo.setBoarddate(date);
				vo.setBoardtext(text);
				vo.setBoardcustomerid(cusid);
				vo.setBoardtitle(title);
				
				list.add(vo);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			MovieUtil.close(conn, pstmt, rs);
		}
		
		
		
		return list;
	}
	
	
	
	
}
