package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.dto.ApiDTO;

@RestController
public class RequestBodyController {
	
	public void name(String name) {
		System.out.println("name === " + name);
	}

	@GetMapping("/getbody")
	public String getbody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			String name = apiDTO.getName();
			name(name);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		return strResult;
	}
	
	@PostMapping("/postbody")
	public String postbody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			
			String name = apiDTO.getName();
			name(name);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		return strResult;
	}
	
	@PutMapping("/putbody")
	public String putbody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			
			String name = apiDTO.getName();
			name(name);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		return strResult;
	}
	
	@DeleteMapping("/deletebody")
	public String deletebody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			
			String name = apiDTO.getName();
			name(name);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		return strResult;
	}
}
