package com.myproject.reservationseat.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.myproject.reservation.model.ReservationDAO;
import com.myproject.util.MovieUtil;

public class ReservationSeatDAO {
	
	
	private static ReservationSeatDAO instance = new ReservationSeatDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	

	private ReservationSeatDAO() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static ReservationSeatDAO getInstance() {
		return instance;
	}
	
	public int insertSeat(String id , String seat) {
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO RESERVATIONSEAT VALUES(?,?)";
		
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2,seat);
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