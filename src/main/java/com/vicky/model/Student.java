package com.vicky.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private Double sfee;
	
	@Temporal(TemporalType.DATE)
	private Date dteA;
	
	@Temporal(TemporalType.TIME)
	private Date dteB;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dteC;
	
}
