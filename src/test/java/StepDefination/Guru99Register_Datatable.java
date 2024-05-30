package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99Register_Datatable {
	WebDriver driver;
	
	@Given("User enters details")
	public void user_enters_details(DataTable dataTable) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 List<List<String>> data= dataTable.cells();
		 driver.findElement(By.name("firstName")).sendKeys(data.get(0).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("lastName")).sendKeys(data.get(1).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("phone")).sendKeys(data.get(2).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("userName")).sendKeys(data.get(3).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("address1")).sendKeys(data.get(4).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("city")).sendKeys(data.get(5).get(1));
			Thread.sleep(2000);
			 driver.findElement(By.name("state")).sendKeys(data.get(6).get(1));
			Thread.sleep(2000);
			driver.findElement(By.name("postalCode")).sendKeys(data.get(7).get(1));
			Thread.sleep(2000);
			
			Select country = new Select(driver.findElement(By.name("country")));
			country.selectByIndex(7);
			Thread.sleep(2000);
			
			
			driver.findElement(By.name("email")).sendKeys(data.get(8).get(1));
			Thread.sleep(2000);
			 driver.findElement(By.name("password")).sendKeys(data.get(9).get(1));
			 Thread.sleep(2000);
			 WebElement Text_Cofirm_Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
			   Text_Cofirm_Password.sendKeys(data.get(10).get(1));
			 Thread.sleep(2000);
			  driver.findElement(By.name("submit")).click();
			  
			  driver.quit();
	}
	
	
	
	    
	}


