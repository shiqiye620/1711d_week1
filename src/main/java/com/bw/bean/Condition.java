package com.bw.bean;

public class Condition {
	private Integer pageNum;
	private String t_name;
	private String b_name;
	private Double p1;
	private Double p2;
	private String s_name1;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public String getS_name1() {
		return s_name1;
	}
	public void setS_name1(String s_name1) {
		this.s_name1 = s_name1;
	}
	public Condition(Integer pageNum, String t_name, String b_name, Double p1, Double p2, String s_name1) {
		super();
		this.pageNum = pageNum;
		this.t_name = t_name;
		this.b_name = b_name;
		this.p1 = p1;
		this.p2 = p2;
		this.s_name1 = s_name1;
	}
	public Condition() {
		super();
	}
	@Override
	public String toString() {
		return "Condition [pageNum=" + pageNum + ", t_name=" + t_name + ", b_name=" + b_name + ", p1=" + p1 + ", p2="
				+ p2 + ", s_name1=" + s_name1 + "]";
	}
	
	
}
