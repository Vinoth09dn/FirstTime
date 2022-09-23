package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public WebDriver driver;

	@Given(": User launch Adactin web application")
	public void user_launch_Adactin_web_application() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
	}

	@When(": User Enters Valid User Name and Valid Password")
	public void user_Enters_Valid_User_Name_and_Valid_Password() {
		driver.findElement(By.id("username")).sendKeys("vinothND");
		driver.findElement(By.id("password")).sendKeys("Y0WBMW");

	}

	@When(": User Clicks Login Button")
	public void user_Clicks_Login_Button() {
		driver.findElement(By.id("login")).click();

	}

	@Then(": User verify HomePage is displayed")
	public void user_verify_HomePage_is_displayed() {
		String text = driver.findElement(By.xpath("//td[text()='Search Hotel ']")).getText();
		System.out.println(text);
		boolean search = text.contains("Search Hotel");
		System.out.println(search);

	}

	}

	