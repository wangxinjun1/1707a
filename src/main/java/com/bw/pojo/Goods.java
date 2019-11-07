package com.bw.pojo;

public class Goods {
	private Integer gid;// int PRIMARY key auto_increment,
	private String gname;// VARCHAR(32),
	private String gname2;// VARCHAR(32),
	private Integer gsize;// int,
	private Integer priject;// int,
	private Integer gnum;// int,
	private String gimg;// VARCHAR(255),
	private Integer bid;// int,
	private Integer gsid;// int
	
	private String bname;
	private String gsname;
	
	
	
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getGsname() {
		return gsname;
	}
	public void setGsname(String gsname) {
		this.gsname = gsname;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGname2() {
		return gname2;
	}
	public void setGname2(String gname2) {
		this.gname2 = gname2;
	}
	public Integer getGsize() {
		return gsize;
	}
	public void setGsize(Integer gsize) {
		this.gsize = gsize;
	}
	public Integer getPriject() {
		return priject;
	}
	public void setPriject(Integer priject) {
		this.priject = priject;
	}
	public Integer getGnum() {
		return gnum;
	}
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getGsid() {
		return gsid;
	}
	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}
	public Goods(Integer gid, String gname, String gname2, Integer gsize, Integer priject, Integer gnum, String gimg,
			Integer bid, Integer gsid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gname2 = gname2;
		this.gsize = gsize;
		this.priject = priject;
		this.gnum = gnum;
		this.gimg = gimg;
		this.bid = bid;
		this.gsid = gsid;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gname2=" + gname2 + ", gsize=" + gsize + ", priject="
				+ priject + ", gnum=" + gnum + ", gimg=" + gimg + ", bid=" + bid + ", gsid=" + gsid + "]";
	}
	
	
	
	
	
	
	
	
	
}
