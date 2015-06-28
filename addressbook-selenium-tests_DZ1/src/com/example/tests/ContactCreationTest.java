package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
	@Test
	public void testNonEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().initContactCreation();
	  ContactData contact = new ContactData();
	  contact.firstName="Anna";
	  contact.lastName="German";
	  contact.firstAddress="Moscow";
	  contact.homePhone="+6589986523";
	  contact.mobilePhone="+44-85-96-58";
	  contact.workPhone="+44(123)56-8760-876";
	  contact.email="anna@gmail.com";
	  contact.email2="anna@yahoo.com";
	  contact.dateOfBirthday="10";
	  contact.monthOfBirthday="February";
	  contact.yearOfBirthday="1982";
	  contact.groupName="Rob";
	  contact.secondaryAddress="Kharkov";
	  contact.secondaryPhone="+859657585123";
	  app.getContactHelper().fillContactForm(contact);
	  app.getContactHelper().submitContactCreation();
	  app.getContactHelper().returnToHomePage();
	}

	@Test
	public void testEmptyContactCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().initContactCreation();
	  ContactData contact = new ContactData("", "", "","", "", "","", "", "-","-", "", "","","");
	  app.getContactHelper().fillContactForm(contact);
	  app.getContactHelper().submitContactCreation();
	  app.getContactHelper().returnToHomePage();
	}


}
