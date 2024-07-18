package NimapAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJourney {


	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testffc.nimapinfotech.com/");
	//driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input#mat-input-0")).sendKeys("gwagh2708@gmail.com");
	driver.findElement(By.cssSelector("input#mat-input-1")).sendKeys("GauriWagh@12345");

	
	
	
	
	
	
	
	
	driver.findElement(By.id("kt_login_signin_submit")).click();
	

	
	
	
	}
		
	}

}
