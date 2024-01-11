package com.myproject.reservation.model;

public class ReservationVO {

	private String reservationId;
	private String res_cus_id;
	private String res_show_id;
	
	public ReservationVO() {
		// TODO Auto-generated constructor stub
	}

	public ReservationVO(String reservationId, String res_cus_id, String res_show_id) {
		super();
		this.reservationId = reservationId;
		this.res_cus_id = res_cus_id;
		this.res_show_id = res_show_id;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getRes_cus_id() {
		return res_cus_id;
	}

	public void setRes_cus_id(String res_cus_id) {
		this.res_cus_id = res_cus_id;
	}

	public String getRes_show_id() {
		return res_show_id;
	}

	public void setRes_show_id(String res_show_id) {
		this.res_show_id = res_show_id;
	}


}
