package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "onboarding")
public class Usedtls {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	@Id
	@Column(unique = true)
	private int id; 
	
	
    private String fullname;
	
	private String email;
	
	private String pannumber;
	
	private String qulification;
	
	private int mobileNumber;
	
	private String password;
	
	private String cpassword;

	public Usedtls(int id, String fullname, String email, String pannumber, String qulification, int mobileNumber,
			String password, String cpassword) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.pannumber = pannumber;
		this.qulification = qulification;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.cpassword = cpassword;
	}

	public Usedtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	
}