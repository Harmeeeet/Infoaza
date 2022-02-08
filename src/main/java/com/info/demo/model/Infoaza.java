package com.info.demo.model;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Infoaza {

	@Id
	private String user_name;
	private String user_pass;
	@Override
	public String toString() {
		return "Infoaza [user_name=" + user_name + ", user_pass=" + user_pass + "]";
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	
	
	

}
