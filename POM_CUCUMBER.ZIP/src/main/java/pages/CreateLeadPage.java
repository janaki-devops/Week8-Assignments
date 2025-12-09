package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {


@When ("enter the companyname as (.*)$")
public CreateLeadPage EnterCname(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
return this;	
}

@When("Enter the first name as(.*)$")
public CreateLeadPage EnterFname(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;
}
@And("enter the last name as(.*)$")	
public CreateLeadPage EnterLname(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
return this;
}
@When("Click on create lead button")
	public ViewLeadsPage ClickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	
	
	}

}
