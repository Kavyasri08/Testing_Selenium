package demoapp.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_2 
{

		public static void main(String[] args) throws InterruptedException{
			WebDriverManager.chromedriver().setup();

			

			WebDriver driver=new ChromeDriver();

		

			driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

			

			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("kavya18@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kavss");
			driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
			driver.quit();

		}

	}

