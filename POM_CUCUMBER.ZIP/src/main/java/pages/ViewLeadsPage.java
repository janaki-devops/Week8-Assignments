package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewLeadsPage extends BaseClass{
@Then("View leads page is displayed")
public ViewLeadsPage VerifyLeads() {
	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    if (text.contains("Janaki")) {
		System.out.println("name matched");
	} else {
		System.out.println("name not matched");
	}return this;
}
}
