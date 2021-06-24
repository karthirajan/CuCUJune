package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends Commonaction{
	
	Commonaction ca = new Commonaction();
	AddCustomerPage ac = new AddCustomerPage();


	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	    System.out.println("Background");
		
	    ca.button(ac.getAddCustomerButton());
		
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
	    
		ca.button(ac.getDoneButton());
		ca.insertText(ac.getFname(), "karthi");
		ca.insertText(ac.getLname(), "rajan");
		ca.insertText(ac.getMail(), "karthi@gmail.com");
		ca.insertText(ac.getAddr(), "thnj");
		ca.insertText(ac.getPhno(), "67564533");
		
	}
	
	@When("user need to fill up the fields by oneDim list")
	public void user_need_to_fill_up_the_fields_by_oneDim_list(DataTable dataTable) {
		
		List<String> data = dataTable.asList(String.class);
		
		ca.button(ac.getDoneButton());
		ca.insertText(ac.getFname(), data.get(0));
		ca.insertText(ac.getLname(), data.get(1));
		ca.insertText(ac.getMail(), data.get(2));
		ca.insertText(ac.getAddr(), data.get(3));
		ca.insertText(ac.getPhno(), data.get(4));
		
	    
	}

	
	@When("user need to fill up the fields by oneDim map")
	public void user_need_to_fill_up_the_fields_by_oneDim_map(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(data.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));
		
	    
	}
	
	@When("user need to fill up the fields by twoDim list")
	public void user_need_to_fill_up_the_fields_by_twoDim_list(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists(String.class);
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
		driver.findElement(By.name("addr")).sendKeys(data.get(0).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));
		
	    
	}
	
	@When("user need to fill up the fields by twoDim map")
	public void user_need_to_fill_up_the_fields_by_twoDim_map(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(data.get(1).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(data.get(1).get("Lname"));
		driver.findElement(By.id("email")).sendKeys(data.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(data.get(0).get("Addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get("phno"));
		
	    
	}


	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("scenario");
		ca.button(ac.getSubmitButton());
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	  //  driver.quit();
	}


}
