package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("WeDriver.chrome.driver", "D:\\Drivers.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.opencart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		/* driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();*/
		 WebElement downloadButton = driver.findElement(By.xpath("//a[contains(text(), 'Free Download')]"));
         downloadButton.click();
	}

}
