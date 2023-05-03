package com.selenium.cse1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cc1q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("standard_user");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		WebElement item=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		item.click();
		
		WebElement cart=driver.findElement(By.className("shopping_cart_link"));
		cart.click();
		WebElement check=driver.findElement(By.id("checkout"));
		check.click();
		WebElement fn=driver.findElement(By.id("first-name"));
		fn.sendKeys("Prathi");
		WebElement ln=driver.findElement(By.id("last-name"));
		ln.sendKeys("S");
		WebElement pc=driver.findElement(By.id("postal-code"));
		pc.sendKeys("623100");
		
		WebElement cont=driver.findElement(By.id("continue"));
		cont.submit();
		
		WebElement itemName=driver.findElement(By.className("inventory_item_name"));
		String name=itemName.getText();
		System.out.println("Name of the product : "+name);
		WebElement itemPrice=driver.findElement(By.className("inventory_item_price"));
		String price=itemPrice.getText();
		System.out.println("Price of the product : "+price);
		
		String actualTitle="Swag Labs";
		String extractedTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, extractedTitle);
		String actualURL="https://www.saucedemo.com/checkout-step-two.html";
		String extractedURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, extractedURL);
//		

	}

}
