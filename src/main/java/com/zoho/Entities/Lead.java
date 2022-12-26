package com.zoho.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead extends Abstract {
	
	@Column(name="first_Name" , nullable=false, length=10)
	private String firstName;
	@Column(name="last_Name", nullable=false, length=10)
	private String lastName;
	@Column(name="email", nullable=false, length=35, unique=true)
	private String email;
	@Column(name="mobile", nullable=false, length=12, unique = true )
	private long mobile;
	@Column(name="source", nullable=false, length=25 )
	private String source;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
