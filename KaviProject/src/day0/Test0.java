package day0;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
System.setProperty("WeDriver.chrome.driver", "D:\\Drivers.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
 driver.get("https://www.google.com/");
 
	}
}
