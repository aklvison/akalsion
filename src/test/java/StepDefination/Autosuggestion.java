package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {
	
WebDriver driver;
@When("lounch the browser")
public void lounch_the_browser() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
}

@Then("click on search bar and send values as whatsapp")
public void click_on_search_bar_and_send_values_as_whatsapp() throws InterruptedException {
   driver.findElement(By.name("q")).sendKeys("Whatsapp");
   Thread.sleep(3000);
}


@Then("Identify autosuggestion webelement and Click on Whatsappweb")
public void identify_autosuggestion_webelement_and_click_on_whatsappweb() {
 List<WebElement> AllOptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
System.out.println(AllOptions.size());
for(int i=0;i<AllOptions.size();i++) {
	
	System.out.println(AllOptions.get(i).getText());
	if(AllOptions.get(i).getText().equalsIgnoreCase("whatsapp web")) {
		AllOptions.get(i).click();
		break; 
	}
}


}


}
