package day0;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("WeDriver.chrome.driver", "D:\\Drivers.exe");
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		 driver.get("https://saucedemo.com/");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		 WebElement  web = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		 web.click();
		Select s1=new Select(web);
		int sz= s1.getOptions().size();
		System.out.println("dropdown count   :"+  sz);
		s1.selectByIndex(3);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("continue-shopping")).click();
		
	}
		
	}


