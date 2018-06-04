package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinations {
	WebDriver d;
	@Given("^user already in login page$")
	public void user_already_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\new eclipse pgm\\cucumber\\driv\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("localhost:8086/login.do");
	   	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
	    d.findElement(By.id("username")).sendKeys("admin");
	    d.findElement(By.name("pwd")).sendKeys("manager");
	   }

	@Then("^Login successfully$")
	public void login_successfully() {
d.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
	   }
}