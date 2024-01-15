
package com.myproject.reservation.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myproject.util.MovieUtil;

public class ReservationDAO {
	
	
	private static ReservationDAO rvdao = new ReservationDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	
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
	
	public int insert(String res_cus_id , int showId) {
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO RESERVATION VALUES(RESERVATION_SEQ.NEXTVAL,SYSDATE,?,?)";
		
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, res_cus_id);
			pstmt.setInt(2, showId);
						
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
		
		return result;
			
	}
	public ReservationVO getReservation(String id , int movieid) {
		
		ReservationVO vo = new ReservationVO();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM RESERVATION WHERE CUSTOMERID = ? AND SHOWID = ?";
		
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setInt(2, movieid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String reservationid = rs.getString("RESERVATIONID");
				String reservationdate = rs.getString("RESERVATIONDATE");
				int showid = rs.getInt("SHOWID");
				
				vo.setReservationId(reservationid);
				vo.setReservationdate(reservationdate);
				vo.setRes_cus_id(id);
				vo.setRes_show_id(showid);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
		
		return vo;
	}
	
	public List<String> getSeat(String id){
		List<String> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM RESERVATIONSEAT WHERE RESERVATIONID = ?";
		
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String seat = rs.getString("SEAT");
				list.add(seat);
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