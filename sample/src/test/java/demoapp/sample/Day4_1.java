package demoapp.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_1 
{
public static void main(String args[]) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)","");
	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Kavyasri");
	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ayyappan");
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("kavya18@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kavss");
	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	
	Thread.sleep(4000);
	driver.quit();


	
}
}

