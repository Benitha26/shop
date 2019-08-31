package com.quinnox.basics.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Customer {
	
	private long id;
	private String name,password,email,country;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		/*String decodedString=this.password;
		Base64.Decoder decoder=Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(decodedString);
		this.password=decodedByteArray.toString();*/
		
		return password;
	}
	public void setPassword(String password) {
		Base64.Encoder encoder=Base64.getEncoder();
		String normalString=password;
		String encodedString=encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
