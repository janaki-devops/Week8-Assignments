package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass;
import io.cucumber.java.en.And;

public class HomePage  extends BaseClass{
	@And("click on leads button")
	public MyLeads clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}

	
	

}
