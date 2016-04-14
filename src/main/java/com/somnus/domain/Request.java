package com.somnus.domain;

import java.io.Serializable;

public class Request implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	public Request() {
		super();
	}
	public Request(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getUsername(){
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	
}
