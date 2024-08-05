package guvSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the path to the ChromeDriver executable

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		// Initialize a new instance of the ChromeDriver

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.guvi.in/register");

			// Full Name

			WebElement Fullname = driver.findElement(By.id("name"));

			driver.findElement(By.className("form-control"));
			
			driver.findElement(By.xpath("//input[@class='form-control']"));
			
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[1]/input"));
			
			Fullname.click();
			
			// Email
			
			WebElement Email = driver.findElement(By.id("email"));
			
			driver.findElement(By.xpath("//input[@id='email']"));
			
			driver.findElement(By.cssSelector("#email"));
			
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[2]/input"));
			
			Email.click();
			
			// Password
			
			WebElement Password = driver.findElement(By.id("password"));
			
			driver.findElement(By.className("form-control password-err"));
			
			driver.findElement(By.cssSelector("#password"));
			
			driver.findElement(By.xpath("//input[@id='password']"));
			
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[3]/input"));
			
			Password.click();
			
			
			// Mobile Number
			
			WebElement MobileNumber = driver.findElement(By.id("mobileNumber"));
			
			driver.findElement(By.className("form-control countrycode-left"));
			
			driver.findElement(By.cssSelector("#mobileNumber"));
			
			driver.findElement(By.xpath("//input[@id='mobileNumber']"));
			
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[4]/div[1]/input"));
			
			WebElement drp = driver.findElement(By.id("iti-0__country-listbox"));
			
			Select select = new Select(drp);

			select.selectByVisibleText("India");
			
			// Sign up  Button
			
			WebElement Signup = driver.findElement(By.id("signup-btn"));
			
			driver.findElement(By.className("btn signup-btn"));
			
			driver.findElement(By.cssSelector("#signup-btn"));
			
			driver.findElement(By.xpath("//a[@id='signup-btn']"));
			
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/a"));
			
			Signup.click();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		finally {

			//driver.close();
		}

	}

}
