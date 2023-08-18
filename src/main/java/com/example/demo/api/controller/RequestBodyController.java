package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.dto.ApiDTO;

@RestController
public class RequestBodyController {

	@GetMapping("/getbody")
	public String getbody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		return strResult;
	}
}
