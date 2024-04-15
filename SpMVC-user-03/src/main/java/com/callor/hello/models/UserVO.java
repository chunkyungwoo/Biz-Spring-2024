package com.callor.hello.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {
	
	private String u_id;
	private String u_password;
	private String u_name;
	private String u_tel;
	private String u_email;

}
