package com.myproject.reservation.model;

public class ReservationVO {

	private String reservationId;
	private String seat;
	private String res_cus_id;
	private String res_show_id;
	private String movie_id;
	
	public ReservationVO() {
		// TODO Auto-generated constructor stub
	}

	public ReservationVO(String reservationId, String seat, String res_cus_id, String res_show_id, String movie_id) {
		super();
		this.reservationId = reservationId;
		this.seat = seat;
		this.res_cus_id = res_cus_id;
		this.res_show_id = res_show_id;
		this.movie_id = movie_id;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
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

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}


}
