package com.BankCustomer.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class BankModal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Please Enter Your Name : ")
	@Size(min = 10,max =50,message = "Enter your Full Name.")
	private String name;
	
	@NotBlank(message = "Enter Valid Address OR Native Address.")
	private String address;
	
	@NotBlank(message = "Enter Your Mobile Number ")
	@Size(min = 1,max = 10,message = "Enter Your Valid Phone Number.")
	private Long pNumber;
	
	@Email(message = "Enter Valid Email Id.")
	private String email;
	
	@NotBlank(message = "Enter Your Account")
	@Size(min = 1,max = 10,message = "Enter Valid Account Number.")
	private Long accountNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getpNumber() {
		return pNumber;
	}
	public void setpNumber(Long pNumber) {
		this.pNumber = pNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public BankModal() {
		// TODO Auto-generated constructor stub
	}
	public BankModal(Long id, String name, String address, Long pNumber, String email, Long accountNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pNumber = pNumber;
		this.email = email;
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return String.format("BankModal [id=%s, name=%s, address=%s, pNumber=%s, email=%s, accountNo=%s]", id, name,
				address, pNumber, email, accountNo);
	}
	
	
	
	
	
}
