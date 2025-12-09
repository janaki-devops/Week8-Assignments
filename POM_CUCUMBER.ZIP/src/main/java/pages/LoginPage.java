package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;



public class LoginPage extends BaseClass {
	
	@When ("Enter the username as {string}")
	public LoginPage enterUname(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@And ("Enter the password as {string}")
	public LoginPage enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	@And ("click on Login")
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
