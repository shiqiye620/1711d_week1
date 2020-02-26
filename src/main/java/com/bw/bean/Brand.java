package com.bw.bean;

public class Brand {
	private Integer b_id;
	private String b_name;
	public Integer getB_id() {
		return b_id;
	}
	public void setB_id(Integer b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public Brand(Integer b_id, String b_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
	}
	@Override
	public String toString() {
		return "Brand [b_id=" + b_id + ", b_name=" + b_name + "]";
	}
	public Brand() {
		super();
	}
	
}
