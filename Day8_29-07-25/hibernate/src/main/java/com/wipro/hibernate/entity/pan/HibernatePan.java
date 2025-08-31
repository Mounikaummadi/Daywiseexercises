package com.wipro.hibernate.entity.pan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="hibernatepan")
public class HibernatePan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;	
	@Column(name="panHolderName")
	String panHolderName;	
	@Column(name="panNumber")
	String panNumber;
	
	public HibernatePan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HibernatePan(int id, String panHolderName, String panNumber) {
		super();
		this.id = id;
		this.panHolderName = panHolderName;
		this.panNumber = panNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanHolderName() {
		return panHolderName;
	}
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "HibernatePan [id=" + id + ", panHolderName=" + panHolderName + ", panNumber=" + panNumber + "]";
	}


}
