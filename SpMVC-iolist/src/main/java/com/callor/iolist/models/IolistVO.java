package com.callor.iolist.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IolistVO {
	
	private String seq;	// BIGINT	PRIMARY KEY AUTO_INCREMENT,
	private String io_date;	//VARCHAR(10)	NOT NULL,
	private String io_time;	//VARCHAR(10)	NOT NULL	,
	private String io_input;	//VARCHAR(2)	NOT NULL	,
	private String io_pname;	//VARCHAR(30)	NOT NULL	,
	private int io_price;	//INT	,
	private int io_quan;	//INT	,
	private int io_total; //INT

}
