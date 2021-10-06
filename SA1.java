package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup(); 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setups\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 System.out.println("page title is " + driver.getTitle());
		 driver.manage().window().maximize();
		 List<String> a = new ArrayList<String>();
		 a.add("User Management");
		 a.add("Organization");
		 a.add("Qualifications");
		 a.add("Job");
		 
		 int i = 1;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			
			System.out.println("Element "+ i + " text is " + webElement.getText());
			System.out.println("Element "+ i + " href is " +webElement.getAttribute("href"));
			i++;
		}
		
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 Homepage hp = new Homepage(driver);
			driver.findElement(hp.Admintab).click();
			List <WebElement> we = driver.findElements(hp.Admintable);
			 
			for (WebElement webElement : we) {
				
			if(a.contains(webElement.getText()))
			{
				System.out.println(webElement.getText() + " is available in the input");
			}
			}
			
			
		 
		
		 
	}

}
