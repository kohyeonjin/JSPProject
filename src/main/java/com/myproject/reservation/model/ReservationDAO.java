package com.myproject.reservation.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.myproject.util.MovieUtil;

public class ReservationDAO {
	
	
	private static ReservationDAO rvdao = new ReservationDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	private int i = 1;
	
	
	private ReservationDAO() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static ReservationDAO getInstance() {
		return rvdao;
	}
	public int insert(String seat,String customerid,String time,String movie) {
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO RESERVATION VALUES(RESERVATION_SEQ.NEXTVAL,?,SYSDATE,?,?,?)";
		
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, seat);
			pstmt.setString(2, customerid);
			pstmt.setString(3, time);
			pstmt.setString(4, movie);
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
		
		
		return result;
	}
}
