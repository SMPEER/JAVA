package StepDefn;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
public class StepDD {
WebDriver driver;
	
	@Given("^Open Browser$")
	public void open_browser() {
	     driver = new ChromeDriver();
	}

	@And("^Enter URL$")
	public void enter_url() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	}
	   
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
		//attach img file report(data, media type, attachment name)
		scenario.attach(screenshot, "image/png", scenario.getName());
	}
	}
	   /*@Then("^Enter Username$")
		public void enter_username() {
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AS");
		   //driver.manage().window().maximize();
	   /Thread.sleep(2000);
	}*/

