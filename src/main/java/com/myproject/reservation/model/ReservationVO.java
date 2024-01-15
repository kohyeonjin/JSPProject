package com.myproject.reservation.model;

public class ReservationVO {

	private String reservationId;
	private String reservationdate;
	private String res_cus_id;
	private int res_show_id;
	
	public ReservationVO() {
		// TODO Auto-generated constructor stub
	}

	public ReservationVO(String reservationId, String reservationdate, String res_cus_id, int res_show_id) {
		super();
		this.reservationId = reservationId;
		this.reservationdate = reservationdate;
		this.res_cus_id = res_cus_id;
		this.res_show_id = res_show_id;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationdate() {
		return reservationdate;
	}

	public void setReservationdate(String reservationdate) {
		this.reservationdate = reservationdate;
	}

	public String getRes_cus_id() {
		return res_cus_id;
	}

	public void setRes_cus_id(String res_cus_id) {
		this.res_cus_id = res_cus_id;
	}

	public int getRes_show_id() {
		return res_show_id;
	}

	public void setRes_show_id(int res_show_id) {
		this.res_show_id = res_show_id;
	}

	

}