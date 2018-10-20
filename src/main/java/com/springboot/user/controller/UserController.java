package com.springboot.user.controller;

import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.dto.Response;
import com.springboot.user.dto.User;
import com.springboot.user.service.UserService;

@RequestMapping(value = "/user")

@RestController

public class UserController {

	@Autowired

	UserService service;

	@RequestMapping(value = "/getByFname/{fname}")

	public ResponseEntity<Response> getByFname(@PathVariable("fname") String fname) {

		Response response = new Response();

		List<User> userList = new ArrayList<User>();

		userList = service.getByFname(fname);

		if (userList.size() > 0) {

			response.setUserList(userList);

			return new ResponseEntity<Response>(response, HttpStatus.OK);

		} else {

			List<com.springboot.user.dto.Error> errorList = new ArrayList<>();

			com.springboot.user.dto.Error error = new com.springboot.user.dto.Error();

			error.setStatus("404");

			error.setDescription("No Data Found");

			errorList.add(error);

			response.setErrors(errorList);

			return new ResponseEntity<Response>(response, HttpStatus.NOT_FOUND);

		}

	}

	@RequestMapping(value = "/getByage/{age}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)

	public ResponseEntity<Response> getByAge(@PathVariable("age") String age) {

		Response response = new Response();

		List<User> userList = new ArrayList<User>();

		System.out.println(age);

		userList = service.getByAge(age);

		System.out.println("User list size" + userList.size());

		if (userList.size() > 0) {

			response.setUserList(userList);

			return new ResponseEntity<Response>(response, HttpStatus.OK);

		} else {

			List<com.springboot.user.dto.Error> errorList = new ArrayList<>();

			com.springboot.user.dto.Error error = new com.springboot.user.dto.Error();

			error.setStatus("404");

			error.setDescription("No Data Found");

			errorList.add(error);

			response.setErrors(errorList);

			return new ResponseEntity<Response>(response, HttpStatus.NOT_FOUND);

		}

	}

}
