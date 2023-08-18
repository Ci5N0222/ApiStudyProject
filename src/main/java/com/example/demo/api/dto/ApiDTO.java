package com.example.demo.api.dto;

import org.springframework.stereotype.Component;

@Component("ApiDTO")

public class ApiDTO {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ApiDTO [name=" + name + ", age=" + age + "]";
	}
	
	public ApiDTO() {
	
	}
	
	
}
