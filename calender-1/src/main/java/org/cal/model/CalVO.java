package org.cal.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Table(name="tbl_cal")
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "qno")
public class CalVO {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long qno;
	
	private String type;
	private String title;
	private String content;
	private String startdate;
	private String enddate;
	private String startTime;
	private String endTime;
	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	private boolean repeattime;
	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	private boolean allday;
	private String inviteaccept;
	
	

	
	
	
}
