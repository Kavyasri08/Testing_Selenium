package demoapp.sample3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;


public class Day7_2 
{
	public class Day7_Task2 {
	 
	  @Test
	  public void add() {
		  int a =10 ;int b=70;
		  
		  int c= a+b;
		  Assert.assertEquals(c, 80);
		  
	  }
	  @Test
	  public void subtract() {
		  int a =30 ;int b=10;
		  
		  int c= a-b;
		  Assert.assertEquals(c, 20);
		  
	  }
	  @Test
	  public void multiply() {
		  int a =20 ;int b=50;
		  
		  int c= a*b;
		  Assert.assertEquals(c, 1000);
		  }
	  @Test
	  public void divide() {
		  int a =50;int b=10;
		  int c=a/b;
		  Assert.assertEquals(c, 5);
	  }
	}
}
