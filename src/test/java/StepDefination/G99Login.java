package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class G99Login {
	WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/login.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}
	@After
	public void after() {
		
		System.out.println("Tearing down the session");
		driver.quit();
	}
	@AfterStep 
	public void afterstep() {
		System.out.println("AfterStep");
	}
	@BeforeStep
	public void beforestep() {
		System.out.println("BeforeStep");
	}
	
	@When("user on login Page")
	public void user_on_login_page(){
		System.out.println("user on login Page");
	}

	@Then("user enters ValidUname")
	public void user_enters_valid_uname() throws InterruptedException {
		
		driver.findElement(By.name("userName")).sendKeys("Sandip");
		Thread.sleep(4000);
	    
	}

	@Then("user enters ValidPword")
	public void user_enters_valid_pword() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Sandip@123");
		Thread.sleep(4000);
	}

	@Then("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Teardown the Page")
	public void teardown_the_page() {
	   System.out.println("");
	}

	@When("user on login Page again")
	public void user_on_login_page_again() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("user on login Page");
	}

	@Then("user enters InValidUname")
	public void user_enters_in_valid_uname() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("Sopoandip");
		Thread.sleep(4000);
	    
	}

	@Then("user enters InValidPword")
	public void user_enters_in_valid_pword() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Sandip@123");
		Thread.sleep(4000);
	}

	@Then("click on submit button again")
	public void click_on_submit_button_again() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	@Then("Close the Page")
	public void close_the_page() {
	    driver.close();
	}


}
