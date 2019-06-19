package com.ssi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	private int bcode;
	private String bname;
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
}
