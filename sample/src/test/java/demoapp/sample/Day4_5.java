package demoapp.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_5 
{
	
	

	public class Day4_Task3_4 {

		public void main(String args[]) throws InterruptedException 
		{
			WebDriverManager.chromedriver().setup();

			

			WebDriver driver=new ChromeDriver();

			//URL

			driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");

			//MAXIMIZING THE WINDOW SIZE

			driver.manage().window().maximize();
			
			
		    Thread.sleep(5000);
			
			//SCROLLING TO THE BOTTOM

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)","");
			driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();
			Thread.sleep(1000);
			driver.navigate().to("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[1]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[2]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[3]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[4]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[5]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[6]/label")).getText());
			
			System.out.println( driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[7]/label")).getText());
			
		

		}

	}
}
