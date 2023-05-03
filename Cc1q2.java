package com.selenium.cse1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cc1q2 {

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
		WebElement sort=driver.findElement(By.className("product_sort_container"));
		sort.click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).isEnabled();
		System.out.println("A-Z:" + driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText());
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		System.out.println("Z-A:" + driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText());
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).isEnabled();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		System.out.println("LOW-HIGH:" + driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText());
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).isEnabled();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		System.out.println("HIGH-LOW:" + driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText());
		


	}

}
