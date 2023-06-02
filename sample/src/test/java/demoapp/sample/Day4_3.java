package demoapp.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_3 
{

	public static void main(String[] args) throws InterruptedException {

	       

	WebDriverManager.chromedriver().setup();

	

	WebDriver driver=new ChromeDriver();

	//URL

	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");


	driver.manage().window().maximize();

	

	Thread.sleep(5000);



	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");


	

	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Fahiem");
	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Mohammed");
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("fahiemmohammed@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("fahiem");
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();


	
	Thread.sleep(5000);

	   Thread.sleep(8000);
	   
	   driver.quit();
	   

	}

	}

