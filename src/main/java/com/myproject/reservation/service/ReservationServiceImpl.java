package com.myproject.reservation.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.reservation.model.ReservationDAO;
import com.myproject.reservation.model.ReservationVO;

public class ReservationServiceImpl implements ReservationService {

	ReservationDAO dao = ReservationDAO.getInstance();

	@Override
	public int seatreservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int result = 0;
	
		
		String movie = request.getParameter("movie");
		String time = request.getParameter("time");
		String customerid = "guswlsdl729";
		
		String [] arr = request.getParameterValues("seat");
		
		ReservationVO vo = new ReservationVO();
		
		for(int i = 0 ; i<arr.length; i++) {
			result = dao.insert(arr[i],customerid,time,movie);
		}
	
		return result;
	}
}
