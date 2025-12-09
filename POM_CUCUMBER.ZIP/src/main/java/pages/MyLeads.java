package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeads extends BaseClass{

@And("click on Create leadLink")
public CreateLeadPage ClickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
return new CreateLeadPage();	
}
	
}
