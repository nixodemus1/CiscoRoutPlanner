package com.example.demo.users;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Users {

	@Id
	private Long id;
	private String firstname;
	private String lastname;
	private String emailaddress;
	private String password;
	private String username;
	private String phoneNumb;
	
	public Users() {
		
	}
	
	public Users(Long id, String fn, String ln, String email, String pw, String un, String pn) {
		this.id = id;
		this.firstname = fn;
		this.lastname = ln;
		this.emailaddress = email;
		this.password = pw;
		this.username = un;
		this.phoneNumb = pn;
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Users(String fn, String ln, String email, String pw, String un, String pn) {
		this.firstname = fn;
		this.lastname = ln;
		this.emailaddress = email;
		this.password = pw;
		this.username = un;
		this.phoneNumb = pn;
	}

	@Override
	public String toString() {
		return "Users {id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailaddress="
				+ emailaddress + ", password=" + password + ", username=" + username + ", phone-number=" + phoneNumb + "}";
	}
	
	
	
	
	
}
