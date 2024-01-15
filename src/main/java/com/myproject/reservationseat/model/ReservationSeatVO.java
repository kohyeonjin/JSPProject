package com.myproject.reservationseat.model;

import java.util.List;

public class ReservationSeatVO {

	private String reservationid;
	private List<String> seat;
	

	public ReservationSeatVO() {
		// TODO Auto-generated constructor stub
	}


	public ReservationSeatVO(String reservationid, List<String> seat) {
		super();
		this.reservationid = reservationid;
		this.seat = seat;
	}


	public String getReservationid() {
		return reservationid;
	}


	public void setReservationid(String reservationid) {
		this.reservationid = reservationid;
	}


	public List<String> getSeat() {
		return seat;
	}


	public void setSeat(List<String> seat) {
		this.seat = seat;
	}
	
	
}
