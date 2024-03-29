package com.movie.model.vo;

import java.sql.Date;

public class Rental {
	private int rentid;
	private Date rentdate;
	private String returnYN;
	private String userid;
	private int movieid;
	
	public Rental() {
	}
	
	public Rental(int rentid, Date rentdate, String returnYN, String userid, int movieid) {
		super();
		this.rentid = rentid;
		this.rentdate = rentdate;
		this.returnYN = returnYN;
		this.userid = userid;
		this.movieid = movieid;
	}

	
	
	@Override
	public String toString() {
		return "Rental [rentid=" + rentid + ", rentdate=" + rentdate + ", returnYN=" + returnYN + ", userid=" + userid
				+ ", movieid=" + movieid + "]";
	}


	public int getRentid() {
		return rentid;
	}

	public void setRentid(int rentid) {
		this.rentid = rentid;
	}

	public Date getRentdate() {
		return rentdate;
	}

	public void setRentdate(Date rentdate) {
		this.rentdate = rentdate;
	}

	public String getReturnYN() {
		return returnYN;
	}

	public void setReturnYN(String returnYN) {
		this.returnYN = returnYN;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	
	
	
}
