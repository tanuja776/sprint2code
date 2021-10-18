package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import configure.hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination1 {
	WebDriver driver= hooks.driver;

	
	@Given("user is on elearning website")
	public void user_is_on_elearning_website() 
{
	    try
	    {
	    	driver.get("http://elearningm1.upskills.in/index.php");
	   	    driver.manage().window().maximize(); 
	    }
	catch(Exception e)
	{
		System.out.println("unable to open website"+e);
		Assert.fail();
	}
}

	@When("user enters the credentails {string} and {string}")
	public void user_enters_the_credentails_and(String userName, String passWord) {
		 try {
				driver.findElement(By.id("login")).sendKeys(userName);
				Thread.sleep(1000);
			    driver.findElement(By.id("password")).sendKeys(passWord);
			}
		 catch(Exception ex)
		 {
			 System.out.println("user is not able to enter credentails"+ex);
			 Assert.fail();
		 }
	}

	@And("user clicks on login button for loging into the website")
	public void user_clicks_on_login_button_for_loging_into_the_website() {
		try {
			Thread.sleep(2000);
		WebElement button= driver.findElement(By.id("form-login_submitAuth"));
		button.click();
		
		
		}
		catch(Exception e) {
	   System.out.print("user not able to click on submit button"+e);
	   Assert.fail();
	}
	}

	@Then("user naviagtes to the dashboard page")
	public void user_naviagtes_to_the_dashboard_page() {
		try{
			Thread.sleep(1000);
			String expectedtitle="My Organization - My education - My courses";
			String actualtitle=driver.getTitle();
	        Assert.assertEquals(expectedtitle,actualtitle );
		}
		catch(Exception e)
		{
			System.out.println("user not able to navigate to dashboard"+e);
			Assert.fail();
		}
	}

	@And("clicks on compose message")
	public void clicks_on_compose_message() {
try {
	    	
	    	driver.findElement(By.xpath("//*[contains(text(),'Compose')]")).click();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Could not find Compose "+e);
	    	Assert.fail();
	    }
	}
	

	@Given("user is on Elearning website")
	public void user_is_on_Elearning_website() {
	    System.out.println("Elearning application");
	}

	
	  @When("user enters charaters in {string}field")
	  public void user_enters_charaters_in_field(String sendto) 
	  {
		  try 
		  {
	  driver.findElement(By.xpath("//input[@class='select2-search__field']")).
	  sendKeys(sendto); 
	  } 
		  catch(Exception e)
	  
	  {
			  System.out.println("user is unable to enter characters");
			  Assert.fail();
			  }
		  }
	
	@Given("user is on compose message page")
	public void user_is_on_compose_message_page() {
	   System.out.println("user is on compose message page");
	}

	@When("user gives multiple {string} in send to field drop down opens")
	public void user_gives_multiple_in_send_to_field_drop_down_opens(String string) {
		 try {
				driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("pur");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[contains(text(),'Purni Anand (purnianand)')]")).click();
				Thread.sleep(5000);
		        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("vic");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//li[contains(text(),'victor sam (VS)')]")).click();
		       Thread.sleep(2000);
			}
			   catch(Exception v)
			   {
				   System.out.println("user is not able to enter input"+v);
				   Assert.fail();
			   }
	}

	@When("user enters {string} for the message")
	public void user_enters_for_the_message(String subject) {
	    try {
	    	driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("hiiihelloooo");
	    }
	    catch(Exception c)
	    {
	    	System.out.println("user is not able to type subject"+c);	
	    	Assert.fail();
	    }
	}

	@Then("user enters {string} in message box")
	public void user_enters_in_message_box(String message) {
		  try {
			  Thread.sleep(3000);
		    	WebElement iframe=driver.findElement(By.tagName("iframe"));
		    	driver.switchTo().frame(iframe);
		    	WebElement editable=driver.switchTo().activeElement();
		    	editable.sendKeys("hdicjbr hiowfh kfwihf");
		    	driver.switchTo().defaultContent();
		    	Assert.fail();
		    }
		    catch(Exception c)
		    {
		    	System.out.println("user is not able to type message"+c);	
		    	Assert.fail();
		    }
	}

	@Then("user add discription")
	public void user_add_discription() {
	    try {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//input[@id='file-descrtiption']")).sendKeys("these are the attached file");
	    }
	    catch(Exception c)
	    {
	    	System.out.println("user is not able to type discription"+c);	
	    	Assert.fail();
	    }
	}

	@Then("user clicks on ADD MORE FILE")
	public void user_clicks_on_ADD_MORE_FILE() {
	    try
	    {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	    }
	    catch(Exception c)
	    {
	    	System.out.println("user is not able to click on add more files box"+c);	
	    	Assert.fail();
	    }
	    
	}

	
	  @Then("user clicks on SEND MESSAGE") public void
	  user_clicks_on_SEND_MESSAGE() { try { Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class=' btn btn-primary ']")).click();
	  } catch(Exception c) {
	  System.out.println("user is not able to click on send message"+c);
	  Assert.fail();
	  
	  } }
	@Given("user is on compose page")
	public void user_is_on_compose_page() {
		System.out.println("user is on compose message page");
	}

	@When("user enters the send to field")
	public void user_enters_the_send_to_field() {
	   try {
		    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("vic");
            Thread.sleep(2000);
	        driver.findElement(By.xpath("//li[contains(text(),'victor sam (VS)')]")).click();
	   }
	   catch(Exception c) {
			  System.out.println("user is not able send to the person"+c);
			  Assert.fail();
	}
	}

	@But("user does not given subject")
	public void user_does_not_given_subject() {
	    System.out.println("subject is blank");
	}

	@And("clicks on send message")
	public void clicks_on_send_message() {
		try { Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class=' btn btn-primary ']")).click();
		  } catch(Exception c) {
		  System.out.println("user is not able to click on send message"+c);
		  Assert.fail();
	}
	}
	@Then("validation message is displayed")
	public void validation_message_is_displayed() {
	    try {
	    	driver.findElement(By.xpath("//div[@class='alert alert-warning']")).isDisplayed();
	    }
	    catch(Exception c) {
			  System.out.println("validation message is not displayed"+c);
			  Assert.fail();
	}
	}
	@Given("the user is on compose")
	public void the_user_is_on_compose() {
		System.out.println("user is on compose message page");
	}

	@When("user clicks on back button")
	public void user_clicks_on_back_button() {
	    try {
	    	driver.findElement(By.xpath("//img[@title='Back']")).click();
	    }
	    catch(Exception c) {
			  System.out.println("back button not clicked"+c);
			  Assert.fail();
	}
	    
	}

	@Then("user is directed to My Organization - My education")
	public void user_is_directed_to_My_Organization_My_education() {
	   try {
		String expected="My Organization - My education";
	   String actual=driver.getTitle();
	   Assert.assertEquals(expected,actual);
	}
	   catch(Exception c) {
			  System.out.println("Title not equal"+c);
			  Assert.fail();
	}
	}

	@Then("user clicks on outbox")
	public void user_clicks_on_outbox() {
	    try {
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/outbox.png']")).click();
	    	
	    }
	    catch(Exception c) {
			  System.out.println("outbox not clicked"+c);
			  Assert.fail();
	}
	}

	@Then("user is able to search the subject line in search text box")
	public void user_is_able_to_search_the_subject_line_in_search_text_box() {
	   try {
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id='search_keyword']")).sendKeys("hii");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@id='search_submit']")).click();
	   }
	   catch(Exception c) {
			  System.out.println("search not found and clicked"+c);
			  Assert.fail();
	}
	}
	   
	@Then("user clicks on SELECT ALL button")
	public void user_clicks_on_SELECT_ALL_button() {
	   try
	   {
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[contains(text(),'Select all')]")).click();
	   }
	   catch(Exception c) {
			  System.out.println("SELECT ALL not found and clicked"+c);
			  Assert.fail();
	}
	}

	@Then("user clicks on UNSELECT ALL")
	public void user_clicks_on_UNSELECT_ALL() {
		try
		   {
			   
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//a[contains(text(),'Unselect all')]")).click();
		   }
		   catch(Exception c) {
				  System.out.println("UNSELECT ALL not found and clicked"+c);
				  Assert.fail();
		}
	}

	@When("user clicks on checkbox and DELETES the message from DETAILS button")
	public void user_clicks_on_checkbox_and_DELETES_the_message_from_DETAILS_button() {
		try
		   {
			   
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//input[@value='4070']")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//a[contains(text(),'Delete selected messages')]")).click();
			   
		   }
		   catch(Exception c) {
				  System.out.println("checkbox not checked and could find details button "+c);
				  Assert.fail();
		}
	}

	@Then("user gets alert box!")
	public void user_gets_alert_box() {
		
	    System.out.println("user sees alert box and reads message !!");
	}

	@Then("user accepts from alert box")
	public void user_accepts_from_alert_box() {
	    try {
	    	Thread.sleep(5000);
	    	driver.switchTo().alert().accept();
	    }
	    catch(Exception c) {
			  System.out.println("alert box not accepted:( "+c);
			  Assert.fail();
	}
	    
	}

	@Then("user gets validation message")
	public void user_gets_validation_message() {
	    try {
	    	driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed();
	    	System.out.println("The selected messages have been deleted Back to outbox");
	    }
	    catch(Exception c) {
			  System.out.println("No validation message "+c);
			  Assert.fail();
	}
	    
	}

	@Then("user goes back to outbox page")
	public void user_goes_back_to_outbox_page() {
		try {
	    	driver.findElement(By.linkText("Back to outbox")).click();
	    }
	    catch(Exception c) {
			  System.out.println("no link found"+c);
			  Assert.fail();
	}
	}
	@Given("user is on compose message p")
	public void user_is_on_compose_message_p() {
	    System.out.println("user is checking message");
	}
	@When("user clicks on subject of the message")
	public void user_clicks_on_subject_of_the_message() {
	    try {
	    	driver.findElement(By.xpath("//img[@title='Back']")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//img[@src='http://elearningm1.upskills.in/main/img/icons/32/outbox.png']")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//a[contains(text(),'jihcihjc')]")).click();
	    }
	    catch(Exception c) {
			  System.out.println("no link found"+c);
			  Assert.fail();
	}
	}

	@Then("user is directed to the next page-My Organization - My education - View")
	public void user_is_directed_to_the_next_page_My_Organization_My_education_View() {
		try{
			Thread.sleep(1000);
			String etitle="My Organization - My education - View";
			String atitle=driver.getTitle();
	        Assert.assertEquals(etitle,atitle );
	        
	       String message1="cjndc  uiuvb9nc unvncv i834795";
	        WebElement message=driver.findElement(By.xpath("//td[@class='view-message-content']"));
	       
	        System.out.println("Message-"+message.getText());
	        if(message1.equals(message))
	        {
	        	System.out.println("same message");
	        }
	        else
	        {
	        	System.out.println("messages did not match");
	        	Assert.fail();
	        }
	        	
	        	
		}
		catch(Exception e)
		{
			System.out.println("user not able to navigate to next page and could not fetch message"+e);
			Assert.fail();
		}
	    	}

	@Then("clicks on back button")
	public void clicks_on_back_button() {
		 try {
		    	driver.findElement(By.xpath("//img[@title='Return to outbox']")).click();
		    }
		    catch(Exception c) {
				  System.out.println("back button not found"+c);
				  Assert.fail();
		}
	    
	}


}

