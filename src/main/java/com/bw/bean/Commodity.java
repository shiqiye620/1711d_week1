package com.bw.bean;

public class Commodity {
	private Integer s_id;
	private String s_name1;
	private String s_name2;
	private Integer s_size;
	private Double s_price;
	private Integer s_num;
	private String s_label;
	private String s_photo;
	
	private Integer b_id;
	private Integer t_id;
	
	private String b_name;
	
	private String t_name;
	
	
	public Integer getB_id() {
		return b_id;
	}

	public void setB_id(Integer b_id) {
		this.b_id = b_id;
	}

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getS_name1() {
		return s_name1;
	}

	public void setS_name1(String s_name1) {
		this.s_name1 = s_name1;
	}

	public String getS_name2() {
		return s_name2;
	}

	public void setS_name2(String s_name2) {
		this.s_name2 = s_name2;
	}

	public Integer getS_size() {
		return s_size;
	}

	public void setS_size(Integer s_size) {
		this.s_size = s_size;
	}

	public Double getS_price() {
		return s_price;
	}

	public void setS_price(Double s_price) {
		this.s_price = s_price;
	}

	public Integer getS_num() {
		return s_num;
	}

	public void setS_num(Integer s_num) {
		this.s_num = s_num;
	}

	public String getS_label() {
		return s_label;
	}

	public void setS_label(String s_label) {
		this.s_label = s_label;
	}

	public String getS_photo() {
		return s_photo;
	}

	public void setS_photo(String s_photo) {
		this.s_photo = s_photo;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Commodity(Integer s_id, String s_name1, String s_name2, Integer s_size, Double s_price, Integer s_num,
			String s_label, String s_photo, Integer b_id, Integer t_id, String b_name, String t_name) {
		super();
		this.s_id = s_id;
		this.s_name1 = s_name1;
		this.s_name2 = s_name2;
		this.s_size = s_size;
		this.s_price = s_price;
		this.s_num = s_num;
		this.s_label = s_label;
		this.s_photo = s_photo;
		this.b_id = b_id;
		this.t_id = t_id;
		this.b_name = b_name;
		this.t_name = t_name;
	}

	public Commodity() {
		super();
	}

	@Override
	public String toString() {
		return "Commodity [s_id=" + s_id + ", s_name1=" + s_name1 + ", s_name2=" + s_name2 + ", s_size=" + s_size
				+ ", s_price=" + s_price + ", s_num=" + s_num + ", s_label=" + s_label + ", s_photo=" + s_photo
				+ ", b_id=" + b_id + ", t_id=" + t_id + ", b_name=" + b_name + ", t_name=" + t_name + "]";
	}

	
	
	
	
	
}
