package com.springboot.user.dto;

public class User {

	private String firstName;
	private String lastname;
	private String age;
	private String mobileNumber;
	private String email;
	private String tempAddress;
	private String permanentAddress;
	private User.EducationType education;

	public User.EducationType getEducation() {
		return education;
	}

	public void setEducation(User.EducationType education) {
		this.education = education;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTempAddress() {
		return tempAddress;
	}

	public void setTempAddress(String tempAddress) {
		this.tempAddress = tempAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public User(String firstName, String lastname, String age, String mobileNumber, String email, String tempAddress,
			String permanentAddress, EducationType education) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.tempAddress = tempAddress;
		this.permanentAddress = permanentAddress;
		this.education = education;
	}

	public enum EducationType {
		SSC("SSC"),
		INTER("INTER"),
		BTECH("B_TECH");

		private String education;

		private EducationType(String education) {
			this.education = education;
		}

		public String toString() {
			return education;
		}
	}
}
