package com.springboot.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.springboot.user.dto.User;
import com.springboot.user.dto.User.EducationType;

@Service
public class UserService {

	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();
		User user1 = new User("Varun", "Raj", "27", "1234567894", "varunraj.e@abc.com", "Chennai Padur", "Anantapur",
				EducationType.BTECH);
		userList.add(user1);

		User user2 = new User("Vishnu", "Pavan", "24", "9123456789", "vishnu.pavan@abc.com", "Hyderabad", "Anantapur",
				EducationType.INTER);
		userList.add(user2);

		User user3 = new User("Ganesh", "Krishna", "24", "9012345672", "ganesh.krishna@abc.com", "Hyderabad",
				"Anantapur", EducationType.SSC);
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

	public boolean validateAge(String age) throws IllegalArgumentException {
		if (StringUtils.isNotBlank(age) && StringUtils.isNumeric(age) && StringUtils.length(age) > 2) {
			throw new IllegalArgumentException("Age is Invalid");
		}
		return true;
	}

	public boolean validateFname(String fname) throws IllegalArgumentException {
		if (StringUtils.isNotBlank(fname) && StringUtils.isNumeric(fname)) {
			throw new IllegalArgumentException("Fname is not valid");
		}
		return true;
	}
}
