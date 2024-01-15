package com.myproject.reservation.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myproject.reservation.model.ReservationVO;
import com.myproject.reservationseat.model.ReservationSeatVO;

public interface ReservationService {

	public void reservation(HttpServletRequest request,HttpServletResponse response);

	public ReservationVO getReservation(HttpServletRequest request,HttpServletResponse response);
	
	public int ReservationSeat(HttpServletRequest request,HttpServletResponse response);
	
	public List<String> getSeat(HttpServletRequest request,HttpServletResponse response);
 }
