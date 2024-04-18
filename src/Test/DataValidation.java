package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataValidation {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@AfterMethod
	public void testNavigateBack() {

		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='reset']")).click();
	

	}

	@Test(priority = 1)
	public void FirstNameLengthValidation1() {
		String firstName = "t";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name less then min length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("t");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name less than min length: " + responseMessage);
		String successText = "Invalid First Name";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 2)
	public void FirstNameLengthValidation2() {
		String firstName = "te";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name equals to min length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("te");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message : " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name equal to min length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 3)
	public void FirstNameLengthValidation3() {
		String firstName = "tes";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name greater than min length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("tes");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name greater than min length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 4)
	public void FirstNameLengthValidation4() {
		String firstName = "testtesttesttesttesttest";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name less than max length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("testtesttesttesttesttest");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name less than max length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 5)
	public void FirstNameLengthValidation5() {
		String firstName = "testtesttesttesttestteste";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name equal than max length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("testtesttesttesttestteste");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name equal than max length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 6)
	public void FirstNameLengthValidation6() {
		String firstName = "testtesttesttesttesttestes";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name greater than max length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("testtesttesttesttesttestes");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering first name greater than max length: " + responseMessage);
		String successText = "Invalid First Name";
		Assert.assertEquals(responseMessage, successText);

	}

	@Test(priority = 7)
	public void FirstNameLengthValidation7() {
		String firstName = "    ";
		String lastName = "test";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entering first name greater than max length: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("      ");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entered eemail address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering space only as first name: " + responseMessage);
		String successText = "Invalid First Name";
		Assert.assertEquals(responseMessage, successText);

	}

	@Test(priority = 8)
	public void LastNameLengthValidation1() {
		String firstName = "test";
		String lastName = "t";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("t");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name less than min length: " + responseMessage);
		String successText = "Enter correct last name";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 9)
	public void lastNameLengthValidation2() {
		String firstName = "test";
		String lastName = "te";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("te");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name less than min length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 10)
	public void lastNameLengthValidation3() {
		String firstName = "test";
		String lastName = "tes";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("tes");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name less than min length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 11)
	public void lastNameLengthValidation4() {
		String firstName = "test";
		String lastName = "testtesttesttesttesttest";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("testtesttesttesttesttest");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name less than max length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 12)
	public void lastNameLengthValidation5() {
		String firstName = "test";
		String lastName = "testtesttesttesttestteste";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("testtesttesttesttestteste");
		System.out.println("Entered valid email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name equal than max length: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 13)
	public void lastNameLengthValidation6() {
		String firstName = "test";
		String lastName = "testtesttesttesttesttestes";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered First name : " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("testtesttesttesttesttestes");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered  message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering last name greater than max length: " + responseMessage);
		String successText = "Enter correct last name";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 14)
	public void lastNameLengthValidation7() {
		String firstName = "test";
		String lastName = "     ";
		String email = "john@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entering last name greater than min length: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("  ");
		System.out.println("Entered email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering space only as last name: " + responseMessage);
		String successText = "Enter correct last name";
		Assert.assertEquals(responseMessage, successText);

	}

	@Test(priority = 15)
	public void emailAddressValidation1() {
		String firstName = "test";
		String lastName = "test";
		String email = "test@example.com";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@example.com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.xpath("//*[@id='contact_reply']/h1"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering email address: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);

	}

	@Test(priority = 16)
	public void emailAddressValidation2() {
		String firstName = "test";
		String lastName = "test";
		String email = "user_name@example.org";
		String message = "Testing1";
		System.out.println("Entered First Name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user_name@example.org");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering email address: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 17)
	public void emailAddressValidation3() {
		String firstName = "test";
		String lastName = "test";
		String email = "jane_doe123@example.net";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jane_doe123@example.net");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering email address: " + responseMessage);
		String successText = "Thank You for your Message!";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 18)
	public void emailAddressValidation4() {
		String firstName = "test";
		String lastName = "test";
		String email = "john.doe@example,com";
		String message = "Testing1";
		System.out.println("Entered First Name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john.doe@example,com");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 19)
	public void emailAddressValidation5() {
		String firstName = "test";
		String lastName = "test";
		String email = "jane@doe@example.net";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jane@doe@example.net");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 20)
	public void emailAddressValidation6() {
		String firstName = "test";
		String lastName = "test";
		String email = "user@example";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user@example");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 21)
	public void emailAddressValidation7() {
		String firstName = "test";
		String lastName = "test";
		String email = ".user@example";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(".user@example");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 22)
	public void emailAddressValidation8() {
		String firstName = "test";
		String lastName = "test";
		String email = "user@example.";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user@example.");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 23)
	public void emailAddressValidation9() {
		String firstName = "test";
		String lastName = "test";
		String email = "123@example.";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@example.");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering invalid email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}

	@Test(priority = 24)
	public void emailAddressValidation10() {
		String firstName = "test";
		String lastName = "test";
		String email = "       ";
		String message = "Testing1";
		System.out.println("Entered first name: " + firstName);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("test");
		System.out.println("Entered last name: " + lastName);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("test");
		System.out.println("Entering email address: " + email);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("             ");
		System.out.println("Entered message field: " + message);
		driver.findElement(By.cssSelector("textarea[name='message'].feedback-input")).sendKeys("Testing1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement bodyElement = driver.findElement(By.tagName("body"));
		String responseMessage = bodyElement.getText();
		System.out.println("Error message after entering space only as email address: " + responseMessage);
		String successText = "Error: Invalid email address";
		Assert.assertEquals(responseMessage, successText);
	}
	@AfterTest()
	public void closeBrowser() {
		driver.close();
	}
}