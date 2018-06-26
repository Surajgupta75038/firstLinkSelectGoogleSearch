package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
public class autogmail {
	public static void main( String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surajgupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
WebElement element =  driver.findElement(By.id("identifierId"));
		element.sendKeys("surajsonugupta1996@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
		driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password");
		driver.findElement(By.cssSelector("#passwordNext > content")).click();
//		
//		driver.manage().window().maximize();
////		driver.findElement(By.id("Next")).click();
//		driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
//		// Enter Password
//		driver.findElement(By.id("Passwd")).sendKeys("YOUR PASSWORD");
//		// Wait For Page To Load
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		// Click on 'Sign In' button
//		
//		//Click on Compose Mail.
//		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
//		// Click on the image icon present in the top right navigational Bar
//		driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
//		//Click on 'Logout' Button
//		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//		//Close the browser.
//		driver.close();

  

}
}
