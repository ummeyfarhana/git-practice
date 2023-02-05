package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenationExpress {
WebDriver dr;

@Given("^open browser$")
    public void open_browser() throws Throwable {
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\u_far\\Downloads\\chromedriver_win32\\Chrome.exe");
	   dr=new ChromeDriver();
}

@Given("^go to express\\.com$")
public void go_to_express_com() throws Throwable {
	dr.get("https://www.express.com/");
}

	@When("^user input valid userName$")
	public void user_input_valid_userName() throws Throwable {
	   dr.findElement(By.id("email")).sendKeys("u_farhana@yahoo.com");
	}

	@When("^user use valid passWord$")
	public void user_use_valid_passWord() throws Throwable {
	   dr.findElement(By.id("password")).sendKeys("795907Mt");
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	   dr.findElement(By.id("/html/body/div[12]/div/div/section[1]/div/div[2]/form/button")).click();
	}

	@Then("^user should see profilePage$")
	public void user_should_see_profilePage() throws Throwable {
		if (dr.findElement(By.id("profileLogo")).isDisplayed()) {
			   System.out.println("profilePage is varified succesfully");
		   }
	}
}
