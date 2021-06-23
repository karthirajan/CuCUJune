package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps {
	
	


	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	    System.out.println("Background");
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
	    
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys("karthi");
		Hooks.driver.findElement(By.id("lname")).sendKeys("rajan");
		Hooks.driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		Hooks.driver.findElement(By.name("addr")).sendKeys("tanjore");
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys("6464635875");
		
	}
	
	@When("user need to fill up the fields by oneDim list")
	public void user_need_to_fill_up_the_fields_by_oneDim_list(DataTable dataTable) {
		
		List<String> data = dataTable.asList(String.class);
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(3));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
		
	    
	}

	
	@When("user need to fill up the fields by oneDim map")
	public void user_need_to_fill_up_the_fields_by_oneDim_map(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get("Fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get("Lname"));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get("mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get("addr"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get("phno"));
		
	    
	}
	
	@When("user need to fill up the fields by twoDim list")
	public void user_need_to_fill_up_the_fields_by_twoDim_list(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists(String.class);
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(2).get(0));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get(1));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get(3));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));
		
	    
	}
	
	@When("user need to fill up the fields by twoDim map")
	public void user_need_to_fill_up_the_fields_by_twoDim_map(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		
		Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(1).get("Fname"));
		Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get("Lname"));
		Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get("mail"));
		Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get("Addr"));
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get("phno"));
		
	    
	}


	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("scenario");
		Hooks.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	  //  Hooks.driver.quit();
	}


}
