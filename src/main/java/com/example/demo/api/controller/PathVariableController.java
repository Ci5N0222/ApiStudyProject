package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
	
	public void name(String name){
		System.out.println("name === " + name);
	}
	
	@GetMapping("/getpath/{getpath}")
	public String getpath(
			@PathVariable(name = "getpath") String getpath){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(getpath);
			strResult = "{ \"result\":\"OK\" }";
		}catch(Exception e) {
			
		}
		return "";
	}
	
	@PostMapping("/postpath/{postpath}")
	public String postpath(
			@PathVariable(name = "postpath") String postpath){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(postpath);
			strResult = "{ \"result\":\"OK\" }";
		}catch(Exception e) {
			
		}
		return "";
	}
	
	@PatchMapping("/patchpath/{patchpath}")
	public String patchpath(
			@PathVariable(name = "patchpath") String patchpath){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(patchpath);
			strResult = "{ \"result\":\"OK\" }";
		}catch(Exception e) {
			
		}
		return "";
	}
	
	@DeleteMapping("/deletepath/{deletepath}")
	public String deletepath(
			@PathVariable(name = "deletepath") String deletepath){
		
		String strResult = "{ \"result\":\"FAIL\" }";
		
		try {
			name(deletepath);
			strResult = "{ \"result\":\"OK\" }";
		}catch(Exception e) {
			
		}
		return "";
	}
	
}
