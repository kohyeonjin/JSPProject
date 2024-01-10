package com.myproject.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.myproject.util.MovieUtil;

public class CustomerDAO {

	private static CustomerDAO instance = new CustomerDAO();
	
	private String url = MovieUtil.url;
	private String uid = MovieUtil.uid;
	private String upw = MovieUtil.upw;
	
	
	private CustomerDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			}
	}
	public static CustomerDAO getInstance() {
		
		return instance;
	}
	
	public int idCheck(String id) {
		
		
		
		int result=0;
		Connection conn= null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		
		String sql="SELECT * FROM Customer WHERE CUSTOMERid=?";
				
		try { 
			conn =DriverManager.getConnection(url,uid,upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=1;
			}else {
				result=0;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			MovieUtil.close(conn, pstmt, rs);
		}
		return result;
	}
	
	
	public void insertCustomer(CustomerVO vo) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		String sql="insert into CUSTOMER values(?,?,?,?,?,?,sysdate,?)";
		
					
		
		try {
			conn=DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,vo.getCustomerId());
			pstmt.setString(2,vo.getName());
			pstmt.setInt(3,vo.getAge());
			pstmt.setString(4,vo.getPw());
			pstmt.setString(5,vo.getEmail());
			pstmt.setString(6,vo.getAddress());
			pstmt.setString(7,vo.getPhoneNumber());
			
			pstmt.executeUpdate();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, null);
		}
	}
	
	public CustomerVO login(String id, String pw) {
		
		CustomerVO vo = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		String sql ="select * from customer where customerId = ? and pw = ?";
		
		try {
			
			conn = DriverManager.getConnection(url,uid,upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String id1 = rs.getString("customerid");
				String name = rs.getString("name");
				
				
				vo = new CustomerVO();
				vo.setCustomerId(id1);
				vo.setName(rs.getString("name"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	
	public CustomerVO getInfo(String id) {
		
		CustomerVO vo =null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		String sql = "select * from customer where customerId = ?";
		
		try {
			
			conn = DriverManager.getConnection(url,uid,upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
	
				vo = new CustomerVO();
				
				String id1= rs.getString("customerId");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String pw = rs.getString("pw");
				String email = rs.getString("email");
				String phonenumber = rs.getString("phonenumber");
				String address = rs.getString("address");
				
				
				
				vo.setCustomerId(id1);
				vo.setName(name);
				vo.setAge(Integer.parseInt(age));
				vo.setPw(pw);
				vo.setEmail(email);
				vo.setPhoneNumber(phonenumber);
				vo.setAddress(address);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			MovieUtil.close(conn, pstmt, rs);
			
		}
		
		return vo;
	}
	
	public int update(String id,String name , String email , String address) {
		
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE CUSTOMER SET NAME = ? , EMAIL= ?, ADDRESS = ? WHERE CUSTOMERID = ?";
		
		
		try {
			
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, address);
			pstmt.setString(4, id);
			
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