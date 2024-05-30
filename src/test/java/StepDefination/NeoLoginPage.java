package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NeoLoginPage {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://console-dev.neoleaf.in/login");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
	}

	@Given("User enters valid Login ID")
	public void user_enters_valid_login_id() {
		driver.findElement(By.name("email")).sendKeys("crm@gmail.com");
		
	}

	@Given("User enters Valid Password")
	public void user_enters_valid_password() {
		driver.findElement(By.name("password")).sendKeys("Leaf@123");

	}

	@Given("User Click on submit button.")
	public void user_click_on_submit_button() {
		driver.findElement(By.id("login_btn")).click();
	    
	}

}
