package com.example.tests;


import org.testng.annotations.Test;

public class EntityCreationTests extends TestBase {
  @Test
 
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name="group name 1";
    group.header="header 1";
    group.footer="footer 1";
	fillGroupForm(group);
	submitGroupCreation();
    returnToGroupsPage();
  }
  @Test
  public void testEmptyEmptyGroupCreation() throws Exception {
		openMainPage();
	    gotoGroupsPage();
	    initGroupCreation();
	    GroupData group = new GroupData("", "", "");
		fillGroupForm(group);
	    submitGroupCreation();
	    returnToGroupsPage();
	  }


@Test
public void testNonEmptyContactCreation() throws Exception {
  openMainPage();
  initContactCreation();
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
  fillContactForm(contact);
  submitContactCreation();
  returnToHomePage();
}

@Test
public void testEmptyContactCreation() throws Exception {
  openMainPage();
  initContactCreation();
  ContactData contact = new ContactData("", "", "","", "", "","", "", "-","-", "", "","","");
  fillContactForm (contact);
  submitContactCreation();
  returnToHomePage();
}


}