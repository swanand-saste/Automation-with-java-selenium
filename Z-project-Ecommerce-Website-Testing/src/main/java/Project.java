import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		
		String gender = "male";
		String firstName = "swanand";
		String lastName = "saste";
		String email = "swanand4@gmail.com";
		String password = "Password@123";
		String confirmPassword = "Password@123";
		
		registration( driver ,gender,firstName,lastName,email,password,confirmPassword);
		login(driver , email,password);
	}

	
	public static void registration (WebDriver driver ,String gender, String firstName, String lastName, String email, String password, String confirmPassword)
	{
       try {
			
		driver.manage().window().maximize();
		
		
		driver.findElement(By.className("ico-register"));
		WebElement e = driver.findElement(By.className("ico-register"));
		e.click();
		Thread.sleep(2000);
		
		if (gender.equalsIgnoreCase("male"))
		driver.findElement(By.id("gender-male")).click();
		
		if (gender.equalsIgnoreCase("female"))
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		
		driver.findElement(By.id("LastName")).sendKeys(lastName );
		Thread.sleep(2000);
		
	//	driver.findElement(By.className("DateOfBirthDay"));
	//	WebElement e4 = driver.findElement(By.className("DateOfBirthDay"));
	//	e4.sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("Email")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys(password + Keys.ENTER);
	
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword +Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.className("button-1 register-continue-button"));
		WebElement e8 = driver.findElement(By.className("button-1 register-continue-button"));
		Thread.sleep(2000);
		e8.click();
		}

		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
   	public static void login(WebDriver driver ,String email, String password) throws InterruptedException 
   	{
   		driver.findElement(By.className("ico-login"));
   		WebElement e = driver.findElement(By.className("ico-login"));
   		e.click();
   		
   		driver.findElement(By.name("Email")).sendKeys(email);
   		Thread.sleep(2000);
   		
   		driver.findElement(By.id("Password")).sendKeys(password + Keys.ENTER);
   			
   	 }
		
		 
	

}
