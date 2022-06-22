package com.qts.tracker.demo_filling_tracker.model;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="statutory")
public class Statutory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer statutoryId;
	private String statutoryName;
	private String frequency;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date lastDate;
	
	
	public Statutory(Integer statutoryId, String statutoryName, String frequency, Date lastDate) {
		super();
		this.statutoryId = statutoryId;
		this.statutoryName = statutoryName;
		this.frequency = frequency;
		this.lastDate = lastDate;
	}
	
	public Statutory() {
		super();
	}
	
	public Integer getStatutoryId() {
		return statutoryId;
	}
	public void setStatutoryId(Integer statutoryId) {
		this.statutoryId = statutoryId;
	}
	public String getStatutoryName() {
		return statutoryName;
	}
	public void setStatutoryName(String statutoryName) {
		this.statutoryName = statutoryName;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	

}
