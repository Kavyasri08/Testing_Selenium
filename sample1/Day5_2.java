package demoapp.sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_2 
{
   public static void main(String args[])
   {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   String url="https://j2store.net/free/";
	   driver.get(url);
	   driver.manage().window().maximize();
	   String curl=driver.getCurrentUrl();
	   if(curl.equals(url))
	   {
		   System.out.println("URL is valid");
	   }
	   else
	   {
		   System.out.println("URL is invalid");
	   }
	   String url1="https://j2store.net/free/index.php/shop?filter_catid=11";
	   driver.get(url1);
	   String curl1=driver.getCurrentUrl();
	   if(curl1.equals(url1))
	   {
		   System.out.println("URL2 is valid");
	   }
	   else
	   {
		   System.out.println("URL2 id invalid");
	   }
   }
}
