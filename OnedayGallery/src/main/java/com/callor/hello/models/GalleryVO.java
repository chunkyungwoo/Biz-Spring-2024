package com.callor.hello.models;

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
public class GalleryVO {
	
	private String g_id;	//VARCHAR(125)	PRIAMRY KEY
	private String g_date;	//VARCHAR(10)	NOT NULL
	private String g_time;	//VARCHAR(10)	NOT NULL
	private String g_author;	//VARCHAR(20)	NOT NULL
	private String g_subject;	//VARCHAR(20)	NOT NULL
	private String g_content;	//VARCHAR(100)	NOT NULL
	private String g_image;	//LONGTEXT	NOT NULL
	private String g_origin_image;
	private String g_up_image;


}
