package com.springboot.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.user.dto.User;

@Service

public class UserService {

	public List<User> getUserList() {

		List<User> userList = new ArrayList<User>();

		User user1 = new User("Varun","Raj","27","1234567894","varunraj.e@abc.com","Chennai Padur","Anantapur");

		userList.add(user1);

		User user2 = new User("Vishnu","Pavan","24","9123456789","vishnu.pavan@abc.com","Hyderabad","Anantapur");

		userList.add(user2);

		User user3 = new User("Ganesh","Krishna","24","9012345672","ganesh.krishna@abc.com","Hyderabad","Anantapur");

		userList.add(user3);

		return userList;

	}

	public List<User> getByAge(String age) {

		List<User> userList = getUserList();

		List<User> resList = userList.stream().filter(User -> User.getAge().equals(age)).collect(Collectors.toList());

		return resList;

	}

	public List<User> getByFname(String fname) {

		List<User> userList = getUserList();

		List<User> resList = userList.stream().filter(User -> User.getFirstName().equalsIgnoreCase(fname))
				.collect(Collectors.toList());

		return resList;

	}

}
