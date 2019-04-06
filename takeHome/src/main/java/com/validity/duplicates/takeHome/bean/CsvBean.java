package com.validity.duplicates.takeHome.bean;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class CsvBean{

	@CsvBindByName(column = "id")
	@CsvBindByPosition(position = 0)
	private String id;

	@CsvBindByName(column = "first_name")
	@CsvBindByPosition(position = 1)
	private String firstName;

	@CsvBindByName(column = "last_name")
	@CsvBindByPosition(position = 2)
	private String lastName;

	@CsvBindByName(column = "company")
	@CsvBindByPosition(position = 3)
	private String company;

	@CsvBindByName(column = "email")
	@CsvBindByPosition(position = 4)
	private String email;

	@CsvBindByName(column = "address1")
	@CsvBindByPosition(position = 5)
	private String address1;

	@CsvBindByName(column = "address2")
	@CsvBindByPosition(position = 6)
	private String address2;

	@CsvBindByName(column = "zip")
	@CsvBindByPosition(position = 7)
	private String zip;

	@CsvBindByName(column = "city")
	@CsvBindByPosition(position = 8)
	private String city;

	@CsvBindByName(column = "state_long")
	@CsvBindByPosition(position = 9)
	private String stateLong;

	@CsvBindByName(column = "state")
	@CsvBindByPosition(position = 10)
	private String state;

	@CsvBindByName(column = "phone")
	@CsvBindByPosition(position = 11)
	private String phone;

	public CsvBean() {
	}

	public CsvBean(String id, String firstName, String lastName, String company, String email, String address1,
			String address2, String zip, String city, String stateLong, String state, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.zip = zip;
		this.city = city;
		this.stateLong = stateLong;
		this.state = state;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateLong() {
		return stateLong;
	}

	public void setStateLong(String stateLong) {
		this.stateLong = stateLong;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + ", " + firstName + ", " + lastName + ", " + company + ", " + email + ", " + address1 + ", " + address2
				 + ", " + zip + ", " + city + ", " + stateLong + ", " + state + ", " + phone;
	}

}
