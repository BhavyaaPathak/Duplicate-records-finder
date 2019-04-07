package com.validity.duplicates.takeHome.bean;

import com.validity.duplicates.takeHome.utility.Utility;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class CsvBean implements Comparable<CsvBean> {

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
		if (firstName == null)
			firstName = "";
		if (lastName == null)
			lastName = "";
		if (company == null)
			company = "";
		if (email == null)
			email = "";
		if (address1 == null)
			address1 = "";
		if (address2 == null)
			address2 = "";
		if (zip == null)
			zip = "";
		if (city == null)
			city = "";
		if (stateLong == null)
			stateLong = "";
		if (state == null)
			state = "";
		if (phone == null)
			phone = "";
		
		return id + ", " + firstName + ", " + lastName + ", " + company + ", " + email + ", " + address1 + ", " + address2
				 + ", " + zip + ", " + city + ", " + stateLong + ", " + state + ", " + phone;
	}

	// compareTo overrides the compareTo method of comparable class
	// compares the records using levenshtein distance and metaphone algorithm
	@Override
	public int compareTo(CsvBean o) {
		int count = 0;
		if (this.firstName != null && o.firstName != null) {
			if (Utility.isLevenshteinEqual(this.firstName, o.firstName,
					this.firstName.length() - (Integer.valueOf(this.firstName.length() / 3)))
					&& Utility.isMetaphoneEqual(firstName, o.firstName)) {
				count++;
			}
		}
		if (this.lastName != null && o.lastName != null) {
			if (Utility.isLevenshteinEqual(this.lastName, o.lastName,
					this.lastName.length() - (Integer.valueOf(this.lastName.length() / 3)))
					&& Utility.isMetaphoneEqual(lastName, o.lastName)) {
				count++;
			}
		}
		if (this.company != null && o.company != null) {
			if (Utility.isLevenshteinEqual(this.company, o.company,
					this.company.length() - (Integer.valueOf(this.company.length() / 3)))
					&& Utility.isMetaphoneEqual(company, o.company)) {
				count++;
			}
		}
		if (this.email != null && o.email != null) {
			if (Utility.isLevenshteinEqual(this.email, o.email,
					this.email.length() - (Integer.valueOf(this.email.length() / 3)))
					&& Utility.isMetaphoneEqual(email, o.email)) {
				count++;
			}
		}
		if (this.address1 != null && o.address1 != null) {
			if (Utility.isLevenshteinEqual(this.address1, o.address1,
					this.address1.length() - (Integer.valueOf(this.address1.length() / 3)))
					&& Utility.isMetaphoneEqual(address1, o.address1)) {
				count++;
			}
		}
		if (this.address2 != null && o.address2 != null) {
			if (Utility.isLevenshteinEqual(this.address2, o.address2,
					this.address2.length() - (Integer.valueOf(this.address2.length() / 3)))
					&& Utility.isMetaphoneEqual(address2, o.address2)) {
				count++;
			}

		}
		if (this.zip != null && o.zip != null) {
			if (Utility.isLevenshteinEqual(this.zip, o.zip,
					this.zip.length() - (Integer.valueOf(this.zip.length() / 3)))
					&& Utility.isMetaphoneEqual(zip, o.zip)) {
				count++;
			}
		}
		if (this.city != null && o.city != null) {
			if (Utility.isLevenshteinEqual(this.city, o.city,
					this.city.length() - (Integer.valueOf(this.city.length() / 3)))
					&& Utility.isMetaphoneEqual(city, o.city)) {
				count++;
			}
		}
		if (this.stateLong != null && o.stateLong != null) {
			if (Utility.isLevenshteinEqual(this.stateLong, o.stateLong,
					this.stateLong.length() - (Integer.valueOf(this.stateLong.length() / 3)))
					&& Utility.isMetaphoneEqual(stateLong, o.stateLong)) {
				count++;
			}
		}
		if (this.state != null && o.state != null) {
			if (Utility.isLevenshteinEqual(this.state, o.state,
					this.state.length() - (Integer.valueOf(this.state.length() / 3)))
					&& Utility.isMetaphoneEqual(state, o.state)) {
				count++;
			}
		}
		if (this.phone != null && o.phone != null) {
			if (Utility.isLevenshteinEqual(this.phone, o.phone,
					this.phone.length() - (Integer.valueOf(this.phone.length() / 3)))
					&& Utility.isMetaphoneEqual(phone, o.phone)) {
				count++;
			}
		}
		if (count >= 6) {
			return 1;
		} else {
			return 0;
		}
	}

}
