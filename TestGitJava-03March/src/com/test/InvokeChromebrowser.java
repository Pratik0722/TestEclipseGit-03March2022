package com.demo.Openingbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromebrowser {
	public static WebDriver driver;
	public static String baseurl="";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseurl="http://demo.automationtesting.in/Index.html";
		driver.get(baseurl);
		if(driver.getTitle().equalsIgnoreCase("Index")) {
			System.out.println("PASS");
		}else {
			System.out.println("fail");
		}
	driver.quit();
	}

}
