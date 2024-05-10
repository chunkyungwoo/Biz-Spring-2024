package com.callor.hello.models;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Service
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageVO {
	
	private String i_id;		//	VARCHAR(125)
	private String i_gid;		//	VARCHAR(125)
	private String i_origin_image;//	VARCHAR(255)
	private String i_up_image;//	VARCHAR(255)

}
