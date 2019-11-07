package com.bw.pojo;

public class Brand {
	private Integer bid;// int PRIMARY key auto_increment,
	private String bname;// VARCHAR(32)
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Brand(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
}
