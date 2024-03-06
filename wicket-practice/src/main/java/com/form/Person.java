package com.form;

import java.util.List;

public class Person{
	private String firstName;
	private String lastName;
	private String password;
	private String country;
	private String state;
	private String gender;
	private List<String> languages;
	private boolean isIndian;
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", country="
				+ country + ", state=" + state + ", gender=" + gender + ", languages=" + languages + ", isIndian="
				+ isIndian + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public boolean isIndian() {
		return isIndian;
	}
	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}
	
	
	
	
	
	
	

	
	
}