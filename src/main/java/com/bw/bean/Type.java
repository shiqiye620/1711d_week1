package com.bw.bean;

public class Type {
	private Integer t_id;
	private String t_name;
	
	public Integer getT_id() {
		return t_id;
	}
	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public Type(Integer t_id, String t_name) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
	}
	public Type() {
		super();
	}
	@Override
	public String toString() {
		return "Type [t_id=" + t_id + ", t_name=" + t_name + "]";
	}
	
	
}
