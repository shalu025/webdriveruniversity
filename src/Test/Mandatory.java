package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mandatory {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@Test(priority = 1)
	public void toCheckFistFieldIsMandatory() {
		driver.findElement(By.name("first_name")).sendKeys("test");
		driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("test");
		// driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		// driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("message")).sendKeys("test");
		// driver.findElement(By.name("message")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after clearing first name field: " + responseMessage);
		String successText = "Error: all fields are required";
		Assert.assertEquals(responseMessage, successText);
		driver.close();
	}

	@Test(priority = 2)
	public void toCheckLastFieldIsMendatory() {
		driver.findElement(By.name("first_name")).sendKeys("test");
		// driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("test");
		driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		// driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("message")).sendKeys("test");
		// driver.findElement(By.name("message")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after clearing last name field: " + responseMessage);
		String successText = "Error: all fields are required";
		Assert.assertEquals(responseMessage, successText);
		driver.close();

	}

	@Test(priority = 3)
	public void toCheckEmailFieldIsMandatory() {
		driver.findElement(By.name("first_name")).sendKeys("test");
		// driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("test");
		// driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("message")).sendKeys("test");
		// driver.findElement(By.name("message")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String responseMessage = driver.findElement(By.tagName("body")).getText();
		System.out.println("Error message after clearing email field: " + responseMessage);
		String successText = "Error: Invalid email address";
		boolean condition = responseMessage.contains(successText);
		Assert.assertTrue(condition);
		driver.close();

	}

	@Test(priority = 4)
	public void toCheckMessageFieldIsMandatory() {
		driver.findElement(By.name("first_name")).sendKeys("test");
		// driver.findElement(By.name("first_name")).clear();
		driver.findElement(By.name("last_name")).sendKeys("test");
		// driver.findElement(By.name("last_name")).clear();
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		// driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("message")).sendKeys("test");
		driver.findElement(By.name("message")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after clearing message field: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
		driver.close();

	}
	@AfterTest()
	public void closeBrowser() {
		driver.close();
}}
