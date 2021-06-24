package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonaction;

public class AddCustomerPage extends Commonaction{
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomerButton;
	
	@FindBy(xpath="(//label[@for='done'])[1]")
	private WebElement doneButton;
	
	@FindBy(id="fname")
	private WebElement fname;
	
	@FindBys({
			@FindBy(id="fname"),
			@FindBy(name="fname")
	})
	private WebElement andOperator;
	
	@FindAll({
		@FindBy(id="fname"),
		@FindBy(name="fname")
	})
	private WebElement orOperator;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(name="addr")
	private WebElement addr;
	
	@FindBy(id="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement submitButton;

	public WebElement getAddCustomerButton() {
		return addCustomerButton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getDoneButton() {
		return doneButton;
	}
	
	
	
}
