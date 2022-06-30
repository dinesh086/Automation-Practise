package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeactureFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http:gmail.com");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		WebElement username = driver.findElement(By.id("identifierId"));
		Thread.sleep(3000);
		username.sendKeys("trainer@way2automation.com");		

	}

}
