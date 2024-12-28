package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	 driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	//driver.windows().max
	
	//By Name
	//driver.findElement(By.name("q")).sendKeys("R");
	
	//By CSSSelector(tag#id or #ID) Tag & ID
	//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("RAS");
	//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("AS");
	
	//By CSSSelector(tag.classname or #class name) Tag & class name
	//driver.findElement(By.cssSelector("#gLFyf")).sendKeys("RAS");
	//driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("AS");
	
	//Tag and attribute
	//driver.findElement(By.cssSelector("[aria-owns=Alh6id]")).sendKeys("AS");
	//driver.findElement(By.cssSelector("textarea[aria-owns=Alh6id]")).sendKeys("AS");
	
	//X-path
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("AupS");
	
	Thread.sleep(2000);
	String t = driver.getTitle();
	System.out.println(t);
	driver.close();
	}

}
