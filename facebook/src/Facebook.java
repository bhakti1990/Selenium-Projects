import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//package facebook;

public class Facebook {


	public static void main(String[] args) throws Exception {
		//launching the browser
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver(); //create an object
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//set wait time
		
		/* HANDLING CHROME ALERTS*/
		HashMap<String, Object> prefs = new HashMap<String, Object>(); // Create object of HashMap Class
		prefs.put("profile.default_content_setting_values.notifications", 2);// Set the notification setting it will override the default setting
		ChromeOptions options = new ChromeOptions(); // Create object of ChromeOption class
		options.setExperimentalOption("prefs", prefs);// Set the experimental option
		WebDriver driver = new ChromeDriver(options); // pass the options object in Chrome driver
		
		driver.manage().window().maximize();//change window size
		driver.get("https://www.facebook.com/");//open the given url
		
	//	driver.findElement(By.id("u_0_l")).sendKeys("chintan"); // find the web elements
	//	driver.findElement(By.id("u_0_n")).sendKeys("Mhatre");
	//	driver.findElement(By.id("u_0_q")).sendKeys("9920848580");
	//	driver.findElement(By.id("day")).sendKeys("24");
	//	driver.findElement(By.id("month")).sendKeys("01");
	//	driver.findElement(By.id("year")).sendKeys("1990");
	//	driver.findElement(By.id("u_0_9")).click();
	//	driver.findElement(By.id("u_0_15")).click();
		driver.findElement(By.id("email")).sendKeys("9930411127");
		driver.findElement(By.id("pass")).sendKeys("obama@012");
		driver.findElement(By.id("loginbutton")).click();
	//	driver.close();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);//set wait time
		
		
		//giving the xpath for the file
		// 2 types - absolute and relative xpath
		//formula for creating xpath - "//<tagname>[@ attribute = 'value']
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/?ref=logo']")).click();
		//driver.findElement(By.xpath("//a[@aria-label='Searc000000000000000000000000000000h']")).sendKeys("rahul goma phulore");
		driver.findElement(By.className("_1frb")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("_1frb")).click();
		driver.findElement(By.className("_1frb")).sendKeys("bhakti");
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/search/top/?']"));
		
	//	Select drpCountry = new Select(driver.findElement(By.className("_1frb")));
	//	drpCountry.selectByVisibleText("bhakti khanwalkar");
	//	drpCountry.selectByVisibleText("bhakti khanwalkar");
		
//		driver.findElement(By.className("_4w97")).click();
//		driver.findElement(By.className("_4w97"));
	//	driver.switchTo().alert().sendKeys(Keys.ESCAPE);
	//	driver.switchTo().alert().getText();
	//	driver.switchTo().alert().accept();
		
	//	driver.findElement(By.xpath("//a[@href='https://www.facebook.com/profile.php?id=100000011310654']")).click();
				
		
/* 
void dismiss() // To click on the 'Cancel' button of the alert.

driver.switchTo().alert().dismiss();
2) void accept() // To click on the 'OK' button of the alert.

driver.switchTo().alert().accept();
3) String getText() // To capture the alert message.

driver.switchTo().alert().getText();			
4) void sendKeys(String stringToSend) // To send some data to alert box.

driver.switchTo().alert().sendKeys("Text"); */
		
	}

}
