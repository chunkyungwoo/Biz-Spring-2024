package com.callor.hello.models;

public class UserDto {

	private String username;
	private String name;
	private String password;
	private String email;
	private String tel;
	
	
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(String username, String name, String password, String email, String tel) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.email = email;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "UserDto [username=" + username + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", tel=" + tel + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
