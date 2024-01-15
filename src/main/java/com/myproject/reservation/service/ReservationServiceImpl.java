package com.myproject.reservation.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myproject.reservation.model.ReservationDAO;
import com.myproject.reservation.model.ReservationVO;
import com.myproject.reservationseat.model.ReservationSeatDAO;
import com.myproject.reservationseat.model.ReservationSeatVO;

public class ReservationServiceImpl implements ReservationService {

	ReservationDAO dao = ReservationDAO.getInstance();
	ReservationSeatDAO seatdao = ReservationSeatDAO.getInstance();

	@Override
	public void reservation (HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String showid = (String)request.getAttribute("showid");
		int showid1 = Integer.parseInt(showid);
		String id = "guswlsdl729";
		dao.insert(id,showid1);
	}

	@Override
	public ReservationVO getReservation(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String id = "guswlsdl729";
		String showid = (String)request.getAttribute("showid");
		int showid1 = Integer.parseInt(showid);
		
		ReservationVO vo = dao.getReservation(id,showid1);
		
		System.out.println(vo.getReservationId());
		return vo;
	}

	@Override
	public int ReservationSeat(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		HttpSession session = request.getSession();
		ReservationVO vo = (ReservationVO)session.getAttribute("reservation");
		String[] arr = request.getParameterValues("seat");
	
		for(String s : arr ) {
			result = seatdao.insertSeat(vo.getReservationId(),s);
		}
		return result;
	}

	@Override
	public List<String> getSeat(HttpServletRequest request, HttpServletResponse response) {
			HttpSession session = request.getSession();
			ReservationVO vo = (ReservationVO)session.getAttribute("reservation");
			String id = vo.getReservationId();
			List<String> list = dao.getSeat(id);
			
		return list;
	}


}
