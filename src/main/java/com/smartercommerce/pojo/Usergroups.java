package com.smartercommerce.pojo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.smartercommerce.view.Phone;

public class Usergroups {
	
	@Size(min=2, max=30)
	private String name;
	

	@NotEmpty @Email
	private String DL;
	
	@Phone @NotEmpty
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDL() {
		return DL;
	}
	public void setDL(String dL) {
		DL = dL;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
