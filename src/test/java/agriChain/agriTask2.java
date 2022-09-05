package agriChain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class agriTask2 {
	
	WebDriver driver;
	@BeforeClass
	public void browser() {	
		WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();  
		    driver.get("https://agrichain.com");
		    driver.manage().window().maximize();	    
	}
	
	@BeforeMethod
	public void sendString() {
		
		WebElement text = driver.findElement(By.xpath("//span[@class='agrichain']"));
		text.sendKeys("AgriChain");
	}
	
	@Test(priority=-1)
	public void submitButton() {
		
		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();
	}
	
	@Test(priority=0)
	public void backTohome() {
		WebElement home = driver.findElement(By.name("backtohome"));
		home.click();

	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
