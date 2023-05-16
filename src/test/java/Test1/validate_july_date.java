package Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.Launch_driver;
import pomclass.Homepage;




public class validate_july_date {
	
	
	 WebDriver driver;
	 Homepage hp;
	 
		
		@BeforeClass
		public void beforeclass(){
			driver=Launch_driver.chromebrowser();
			
		}
		@BeforeMethod
		public void beforemethod(){
			hp=new Homepage(driver);
		
			
		}	
	  @Test
	  public void Verifyuserenterjuly() {
		 hp.switchtoifrmae();
		 hp.selectmonth();
	
		
		  
		  
		  
	  }
		@AfterClass
		public void afterclass(){
			
		}
		@AfterMethod
		public void aftermethod(){
	       }


}
