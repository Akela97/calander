package pomclass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	   
	   @FindBy(xpath="//iframe[@class='demo-frame']")
		private WebElement iframe;
		
		@FindBy(xpath="//input[@id='datepicker']")
		private WebElement datepicker;
		
		
		@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
		private WebElement writechevron;
		
		//Constructor
		public Homepage (WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
		//Method
		public void switchtoifrmae() {
			
			driver.switchTo().frame(iframe);
			datepicker.click();
			
		}
		public void selectmonth() {
			
			for(int i=0;i<2;i++) {
				
				writechevron.click();			
			}
				
				}
		}
