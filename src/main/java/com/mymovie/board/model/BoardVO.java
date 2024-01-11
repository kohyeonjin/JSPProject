package com.mymovie.board.model;

import java.sql.Timestamp;

public class BoardVO {
	
	private int boardid;
	private String boardtitle;
	private String boardtext;
	private Timestamp boarddate;
	private String boardcustomerid;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int boardid, String boardtitle, String boardtext, Timestamp boarddate, String boardcustomerid) {
		super();
		this.boardid = boardid;
		this.boardtitle = boardtitle;
		this.boardtext = boardtext;
		this.boarddate = boarddate;
		this.boardcustomerid = boardcustomerid;
	}

	public int getBoardid() {
		return boardid;
	}

	public void setBoardid(int boardid) {
		this.boardid = boardid;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardtext() {
		return boardtext;
	}

	public void setBoardtext(String boardtext) {
		this.boardtext = boardtext;
	}

	public Timestamp getBoarddate() {
		return boarddate;
	}

	public void setBoarddate(Timestamp boarddate) {
		this.boarddate = boarddate;
	}

	public String getBoardcustomerid() {
		return boardcustomerid;
	}

	public void setBoardcustomerid(String boardcustomerid) {
		this.boardcustomerid = boardcustomerid;
	}

	@Override
	public String toString() {
		return "BoardVO [boardid=" + boardid + ", boardtitle=" + boardtitle + ", boardtext=" + boardtext
				+ ", boarddate=" + boarddate + ", boardcustomerid=" + boardcustomerid + "]";
	}
	
	
	
	
	
}
