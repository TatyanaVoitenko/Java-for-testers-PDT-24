package com.example.tests;

public class ContactData {
	public String firstName;
	public String lastName;
	public String firstAddress;
	public String homePhone;
	public String mobilePhone;
	public String workPhone;
	public String email;
	public String email2;
	public String dateOfBirthday;
	public String monthOfBirthday;
	public String yearOfBirthday;
	public String groupName;
	public String secondaryAddress;
	public String secondaryPhone;

	public ContactData() {

	}

	public ContactData(String firstName, String lastName, String firstAddress,
			String homePhone, String mobilePhone, String workPhone,
			String email, String email2, String dateOfBirthday,
			String monthOfBirthday, String yearOfBirthday, String groupName,
			String secondaryAddress, String secondaryPhone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.firstAddress = firstAddress;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.workPhone = workPhone;
		this.email = email;
		this.email2 = email2;
		this.dateOfBirthday = dateOfBirthday;
		this.monthOfBirthday = monthOfBirthday;
		this.yearOfBirthday = yearOfBirthday;
		this.groupName = groupName;
		this.secondaryAddress = secondaryAddress;
		this.secondaryPhone = secondaryPhone;
	}
}