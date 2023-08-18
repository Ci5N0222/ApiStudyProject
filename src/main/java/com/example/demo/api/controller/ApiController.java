package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.api.dto.ApiDTO;


@RestController
public class ApiController {

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("/index.html");
		return mav;
	}
	
	public void name(String param) {
		System.out.println("param ===== " + param);
	}
	
	public void nameAge(String name, int age) {
		System.out.println("name ===== " + name);
		System.out.println("age ===== " + age);
	}
	
	/**
	 * Get RequestParam
	 * @param param
	 * @return
	 */
	
	@GetMapping("/getname")
	public String getname(
		@RequestParam(value = "param")String param){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(param);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		
		return strResult;
	}
	
	/**
	 * Post Requestparam
	 * @param param
	 * @return
	 */
	@PostMapping("/postname")
	public String postname(
		@RequestParam(value = "param")String param) {
	
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(param);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		
		return strResult;
	}
	
	/**
	 * Patch Requestparam
	 * @param param
	 * @return
	 */
	@PatchMapping("/patchname")
	public String patchname(
		@RequestParam(value="param")String param){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(param);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		
		return strResult;
	}
	
	/**
	 * Delete Requestparam
	 * @param param
	 * @return
	 */
	@DeleteMapping("/deletename")
	public String deletename(
			@RequestParam(value="param")String param) {
		String strResult = "{ \"resul;t\":\"FAIL\" }";
		
		try {
			name(param);
			strResult = "{ \"result\":\"OK\" }";
		} catch(Exception e) {
			
		}
		
		return strResult;
	}
	
	@GetMapping("/getnamebody")
	public String getnamebody(
			@RequestBody ApiDTO apiDTO) {
		
		String strResult = "{ \"result\":\"OK\" }";
		
		try {
			int age = apiDTO.getAge();
			String name = apiDTO.getName();
			nameAge(name, age);
			strResult = "{ \"result\":\"FAIL\" }";
		} catch(Exception e) {
			
		}
		
		return strResult;
	}
	
	
	
}
