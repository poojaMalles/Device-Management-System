package com.excelr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="devices_list")
public class Devices {
	@Id
	@Column(name="id")
	private int d_id;
	@Column(name="name")
	private String d_name;
	@Column(name="image")
	private String d_image;
	@Column(name="cost")
	private double d_cost;
	@Column(name="warranty")
	private int d_warranty;
	@Column(name="ram")
	private int d_ram;
	@Column(name="ssd")
	private int d_ssd;
	@Column(name="manfyear")
	private int d_manfyear;
	
	public Devices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Devices(int d_id, String d_name, String d_image, double d_cost, int d_warranty, int d_ram, int d_ssd,
			int d_manfyear) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_image = d_image;
		this.d_cost = d_cost;
		this.d_warranty = d_warranty;
		this.d_ram = d_ram;
		this.d_ssd = d_ssd;
		this.d_manfyear = d_manfyear;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_image() {
		return d_image;
	}
	public void setD_image(String d_image) {
		this.d_image = d_image;
	}
	public double getD_cost() {
		return d_cost;
	}
	public void setD_cost(double d_cost) {
		this.d_cost = d_cost;
	}
	public int getD_warranty() {
		return d_warranty;
	}
	public void setD_warranty(int d_warranty) {
		this.d_warranty = d_warranty;
	}
	public int getD_ram() {
		return d_ram;
	}
	public void setD_ram(int d_ram) {
		this.d_ram = d_ram;
	}
	public int getD_ssd() {
		return d_ssd;
	}
	public void setD_ssd(int d_ssd) {
		this.d_ssd = d_ssd;
	}
	public int getD_manfyear() {
		return d_manfyear;
	}
	public void setD_manfyear(int d_manfyear) {
		this.d_manfyear = d_manfyear;
	}
	@Override
	public String toString() {
		return "Devices [d_id=" + d_id + ", d_name=" + d_name + ", d_image=" + d_image + ", d_cost=" + d_cost
				+ ", d_warranty=" + d_warranty + ", d_ram=" + d_ram + ", d_ssd=" + d_ssd + ", d_manfyear=" + d_manfyear
				+ "]";
	}
	
	
	
	

}
