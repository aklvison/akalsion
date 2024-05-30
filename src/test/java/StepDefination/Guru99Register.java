package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99Register {
	WebDriver driver;
	
	
	@Given("User navigates on Registration Page")
	public void user_navigates_on_registration_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	}

	@Given("User enters First Name")
	public void user_enters_first_name() throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys("Sandip");
		Thread.sleep(2000);
	}

	@Given("User enters Last Name")
	public void user_enters_last_name() throws InterruptedException {
		driver.findElement(By.name("lastName")).sendKeys("Rane");
		Thread.sleep(2000);
	}

	@Given("User enters Phone")
	public void user_enters_phone() throws InterruptedException {
		driver.findElement(By.name("phone")).sendKeys("7745085642");
		Thread.sleep(2000);
	}

	@Given("User enters Email")
	public void user_enters_email() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("sandy@gmail.com");
		Thread.sleep(2000);
	}

	@Given("User enters Address")
	public void user_enters_address() throws InterruptedException {
		driver.findElement(By.name("address1")).sendKeys("At.Post Jakekur Tq Omerga ");
		Thread.sleep(2000);
	}

	@Given("User enters City")
	public void user_enters_city() throws InterruptedException {
		driver.findElement(By.name("city")).sendKeys("Osmanabad ");
		Thread.sleep(2000);
	}

	@Given("User enters State")
	public void user_enters_state() throws InterruptedException {
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    Thread.sleep(2000);
	}

	@Given("User enters Post Code")
	public void user_enters_post_code() throws InterruptedException {
		driver.findElement(By.name("postalCode")).sendKeys("411036");
		Thread.sleep(2000);
	}

	@Given("User enters Country")
	public void user_enters_country() throws InterruptedException {
		WebElement drp_down= driver.findElement(By.name("country"));
		Select country=new Select(drp_down);
		List<WebElement> list=country.getOptions();
		System.out.println(country.getFirstSelectedOption().getText()); //First selected option of dropdown
		
    System.out.println(list.size());		
		
		for (int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("INDIA")) {
				list.get(i).click();
			}
		}
		
		
		Thread.sleep(2000);
	}
	  
	@Given("User enters Username")
	public void user_enters_username() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("sandy@gmail.com");
		Thread.sleep(2000);
		
	}
    
	@Given("User enters Password")
    public void User_enters_Password() throws InterruptedException {
	 driver.findElement(By.name("password")).sendKeys("Sandip123");
	 Thread.sleep(2000);
	 
}
	
	@Given("User enters Confirm Password")
	public void user_enters_confirm_password() throws InterruptedException {
	   WebElement Text_Cofirm_Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	   Text_Cofirm_Password.sendKeys("Sandip@123");
	   Thread.sleep(2000);
	}

	@Given("User Clicks on Submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	    driver.quit();
	}
	
   
}
