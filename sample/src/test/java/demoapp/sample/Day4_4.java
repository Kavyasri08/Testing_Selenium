package demoapp.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_4 
{
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();

		

			WebDriver driver=new ChromeDriver();

			
			driver.get("https://demo.opencart.com/");

			

			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"search\"]/input")).isDisplayed();
			

		    Thread.sleep(5000);
			
		

			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)","");
			
			System.out.println(driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).getText());
			
			System.out.println( driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).getText());

			
			//Task3
			System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h3")).getText());
			
		}

	}

