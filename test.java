package Automation;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main( String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surajgupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement element =  driver.findElement(By.name("q"));
		element.sendKeys("London");
		element.submit();
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.linkText("London - Wikipedia"));
		element1.click();
		 String expectedTitle = "https://en.wikipeda.org/wiki/London";
		 String actualTitle = driver.getCurrentUrl();
		 if (expectedTitle.equals(actualTitle))
         {
                System.out.println("Verification Successful.");
         }
        else
         {
                System.out.println("Verification Failed");
         }

	//System.out.println(element1.getText());
//	System.out.println("Page title is: " + driver.getTitle());
	
	 //   driver.quit();

	
		
		
		
		
		//	driver.findElement(By.xpath("//*[@id=\"iur\"]/div/div/div/div/div/div[2]/div[2]")).click(); 
		
		
	/* 	driver.findElement(By.linkText("Basic Course")).click();
		//GRID GATE
		driver.findElement(By.className("greenbox")).click();
		
		//FRAME DUNGEON
		boolean found=false;
		driver.switchTo().frame("main");
		while(found==false)
		{	
			String box1Class = driver.findElement(By.id("answer")).getAttribute("className");
			
			driver.switchTo().frame("child");
			
			String box2Class = driver.findElement(By.id("answer")).getAttribute("className");
			
			if (box1Class.equalsIgnoreCase(box2Class)) {
				driver.switchTo().parentFrame();
				driver.findElement(By.linkText("Proceed")).click();
				found=true;
				break;
			} 
			
			else {
				driver.switchTo().parentFrame();
				driver.findElement(By.linkText("Repaint Box 2")).click();
			}
		}  */
	}
}
