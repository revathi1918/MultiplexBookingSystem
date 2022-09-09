package com.multiplex.beans;

import java.util.Date;

public class Booking {
	private int bookingId;
	private int showId;
	private int userId;
	private Date bookDate;
	private Date showDate;
	private boolean status;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Booking(int bookingId, int showId, int userId, Date bookDate, Date showDate, boolean status) {
		super();
		this.bookingId = bookingId;
		this.showId = showId;
		this.userId = userId;
		this.bookDate = bookDate;
		this.showDate = showDate;
		this.status = status;
	}
	public Booking() {
		super();
	}
	
	

}
