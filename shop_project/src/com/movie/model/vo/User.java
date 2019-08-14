package com.movie.model.vo;

public class User {
	private String id;
	private String pass;
	private String email;
	private String address;
	
	
	public User() {
	}
	
	public User(String id, String pass, String email, String address) {
		super();
		this.id = id;
		this.pass = pass;
		this.email = email;
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", pass=" + pass + ", email=" + email + ", address=" + address + "]";
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
