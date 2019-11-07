package com.bw.pojo;

public class GoodsKind {
	private Integer gsid;// int PRIMARY key auto_increment,
	private String gsname;// VARCHAR(32)
	public Integer getGsid() {
		return gsid;
	}
	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}
	public String getGsname() {
		return gsname;
	}
	public void setGsname(String gsname) {
		this.gsname = gsname;
	}
	public GoodsKind(Integer gsid, String gsname) {
		super();
		this.gsid = gsid;
		this.gsname = gsname;
	}
	public GoodsKind() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GoodsKind [gsid=" + gsid + ", gsname=" + gsname + "]";
	}
	
	
}
