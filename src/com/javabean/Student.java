package com.javabean;

import java.io.Serializable;

public class Student implements Serializable{

	private String ssno;
	private String ssname;
	private String sssex;
	private int ssage;
	private String ssmajor;
	private String ssfav;
	private String ssaddress;
	public String getSsno() {
		return ssno;
	}
	public void setSsno(String ssno) {
		this.ssno = ssno;
	}
	public String getSsname() {
		return ssname;
	}
	public void setSsname(String ssname) {
		this.ssname = ssname;
	}
	public String getSssex() {
		return sssex;
	}
	public void setSssex(String sssex) {
		this.sssex = sssex;
	}
	public int getSsage() {
		return ssage;
	}
	public void setSsage(int ssage) {
		this.ssage = ssage;
	}
	public String getSsmajor() {
		return ssmajor;
	}
	public void setSsmajor(String ssmajor) {
		this.ssmajor = ssmajor;
	}
	public String getSsfav() {
		return ssfav;
	}
	public void setSsfav(String ssfav) {
		this.ssfav = ssfav;
	}
	public String getSsaddress() {
		return ssaddress;
	}
	public void setSsaddress(String ssaddress) {
		this.ssaddress = ssaddress;
	}
	
	
}
