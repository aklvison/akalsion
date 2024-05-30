package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99Login {
	WebDriver driver;
	@Given("user navigates on login page")
	public void user_navigates_on_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/login.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	    
	}



@Then("user enters {string} and {string}")
public void user_enters_and(String Username, String Password) throws Exception {
		driver.findElement(By.name("userName")).sendKeys(Username);
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(4000);
	}

	@Then("click on login button.")
	public void click_on_login_button() throws InterruptedException {
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.close();
	}


}
