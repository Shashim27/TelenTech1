package upsdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upsdriver {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty(" webdriver.chrome.driver","C:\\Users/hpoll\\java\\java selinium project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ups.com/lasso/login");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		WebElement userId=driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		
				
		WebElement submitButton= driver.findElement(By.xpath("password"));
		
		userId.sendKeys("telentech");
		password.sendKeys(" 1234556");
		submitButton.click();
		WebElement errorMsg=driver.findElement(By.id("errorMessages"));
		String error =errorMsg.getText();
		if(error.contains("Something seems to have gone wrong")){
			System.out.println("PASSED");
		}else{
			System.out.println("FAILED");
		}
		
		Thread.sleep(20000);
		
		
		driver.close();
		
	}

}

