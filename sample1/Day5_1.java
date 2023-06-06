package demoapp.sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_1 
{
     public static void main(String args[])
     {
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://j2store.net/free/");
    	 String title =driver.getTitle();
    	 System.out.println(title);
    	 if(title.equalsIgnoreCase("Home"))
    	 {
    		 System.out.println("Valid");
    	 }
    	 else
    	 {
    		 System.out.println("Invalid");
    	 }
    	 
    	 driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
    	 String title1=driver.getTitle();
    	 System.out.println(title1);
    	 if(title.equalsIgnoreCase("Shop"))
    	 {
    		 System.out.println("Valid");
    	 }
    	 else
    	 {
    		 System.out.println("Invalid");
    	 }
    		 
    	 
     }
}
