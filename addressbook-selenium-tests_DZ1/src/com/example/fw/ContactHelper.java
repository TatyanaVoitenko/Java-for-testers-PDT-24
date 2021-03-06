package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		}
	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"),contact.firstName);
		 type(By.name("lastname"),contact.lastName);
		type(By.name("address"),contact.firstAddress);
		type(By.name("home"),contact.homePhone);
		type(By.name("mobile"),contact.mobilePhone);
	    type(By.name("work"),contact.workPhone);
		type(By.name("email"),contact.email);
		type(By.name("email2"),contact.email2);
		selectByText(By.name("bday"), contact.dateOfBirthday);
		selectByText(By.name("bmonth"), contact.monthOfBirthday);
		type(By.name("byear"),contact.yearOfBirthday);
		selectByText(By.name("new_group"), contact.groupName);
		type(By.name("address2"),contact.secondaryAddress);
		type(By.name("phone2"),contact.secondaryPhone);
	
	}
	

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void returnToHomePage() {
		click(By.linkText("home"));
	}
	
	private void selectContactByIndex(int index) {
		index++;
		click(By.xpath("//tr["+index+"]/td[7]/a/img"));
	}
	
	public void deleteContact(int index) {
		selectContactByIndex(index);
		click(By.xpath("//input[@value='Delete']"));
		
	}
	
	public void initContactModification(int index) {
		index++;
		selectContactByIndex(index);
		
	}
	public void submitContactModification() {
		click(By.name("update"));
		
	}
	
}


