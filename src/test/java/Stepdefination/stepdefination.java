package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import configure.hooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {
	WebDriver driver= hooks.driver;

	
	  @Given("^user is on Elearning Application$")
	  public void user_is_on_Elearning_Application() {
	  try {
	 driver.get("http://elearningm1.upskills.in/index.php");
	 driver.manage().window().maximize(); }
	  catch(Exception e)
	   {
		   System.out.println("user not able to enter username and password"+e);
		   Assert.fail();
	   }
	  }
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String Username, String password) {
	   try {
		driver.findElement(By.id("login")).sendKeys(Username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
		  
		  
	
	
	   catch(Exception e)
	   {
		   System.out.println("user not able to enter username and password"+e);
		   Assert.fail();
	   }
	}
	@And("^user clicks on signup$")
	public void user_clicks_on_signup()  {
		try {
			Thread.sleep(2000);
		WebElement submit= driver.findElement(By.id("form-login_submitAuth"));
		submit.click();
		
		
		}
		catch(Exception e) {
	   System.out.print("user not able to click on submit button"+e);
	   Assert.fail();
	}
	}
	@Then("^user navigates to dashboard$")
	public void user_navigates_to_dashboard(){
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
	@Then("user clicks on edit profile on menu bar")
	public void user_clicks_on_edit_profile_on_menu_bar() {
	    try {
	    	
	    	driver.findElement(By.xpath("//*[contains(text(),'Edit profile')]")).click();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Could not find edit profile"+e);
	    	Assert.fail();
	    }
	}

	@Then("user gets directed to Edit profile page")
	public void user_gets_directed_to_Edit_profile_page() {
	    try {
	    	
	    	String expectedtitle="My Organization - My education - Profile";
	    	String actualtitle= driver.getTitle();
	    	 Assert.assertEquals(expectedtitle,actualtitle );
		}
		catch(Exception e)
		{
			System.out.println("invalid title"+e);
			Assert.fail();
		}
	    }

		
		  @Given("when user is on edit profile page")
		  public void when_user_is_on_edit_profile_page() {
		  System.out.println("user is on edit profile page");
		  
		  }
		 
		  @When("user clicks on choose image option") 
		  public void user_clicks_on_choose_image_option() 
		  {
			  try
			  {
		   
		  Thread.sleep(2000); WebElement
		  chooseFile= driver.findElement(By.name("picture")); 
		  chooseFile.click();
		  Thread.sleep(10000);
		  
		  System.out.println("user clicks on choose file button"); 
		  } 
		  catch(Exception
		  ex) {
		  System.out.println("user is not able to click on choose file option"+ex);
		  Assert.fail();
		  } }
		 
	
	  @Then("user is able to select image from browser") 
	  public void user_is_able_to_select_image_from_browser() { try{
	  driver.findElement(By.xpath("//img[@id='picture_preview_image']")).
	  isDisplayed();
	  
	} catch(Exception e)
	  {
		System.out.println("could not upload image"+e);
	Assert.fail();
	} 
	  }
	 
	
	  @Given("user is on edit profile page") public void
	  user_is_on_edit_profile_page() 
	  {
	  System.out.println("user is on edit profile page"); 
	  }
	 
	  @When("user clicks on language") 
	  public void user_clicks_on_language() 
	  {
		  try
	  { 
			  driver.findElement(By.xpath("//div[@class='filter-option']")).click();;
	  driver.findElement(By.xpath("//span[text()='Deutsch']")).click();
	  
	  } catch(Exception e)
		  {
	  System.out.println("user is not able to select language"+e);
	  Assert.fail(); 
	  } 
		  }
	  
	  @Then("user is able to select language")
	  public void user_is_able_to_select_language() 
	  {  
		  try
	  {
	 driver.findElement(By.xpath("//*[text()='Deutsch']")).isDisplayed();
	 Thread.sleep(5000);
	 driver.findElement(By.id("profile_apply_change")).click();
	 }
	 catch(Exception e)
		  {
		 System.out.println("language is not displayed"+e);
		 Assert.fail();
		 }
		  }
	 
	
	  @Given("user is on edit profile") 
	  public void user_is_on_edit_profile()
	  {
	  System.out.println("user is on edit profile page");
	  }
	  
	  @When("user enters {string} ,{string},{string}")
	  public void user_enters(String oldpassword, String newpassword, String confirmpassword) {
	 
	  try 
	  {
		  driver.findElement( By.id("profile_password0")).sendKeys("tanuja");
	  Thread.sleep(2000); driver.findElement(By.id("password1")).sendKeys("hfhe");
	  Thread.sleep(2000);
	  driver.findElement(By.id("profile_password2")).sendKeys("hfhe");
	  Thread.sleep(2000); } catch(Exception a) {
	  System.out.println("user is not able to change password");
	  Assert.fail();
	  }
	  
	  }
	  
	  @Then("user is able to click on save settings field") 
	  public void user_is_able_to_click_on_save_settings_field() 
	  {
		  try
		  {
	  driver.findElement(By.id("profile_apply_change")).click();
	  Thread.sleep(2000); 
	  if(driver.findElement(By.xpath("//div[contains(text(),'The current password is incorrect')]")).isDisplayed()) 
	  {
	  System.out.println("true"); 
	  }
	  else System.out.println("not displayed");
	  }
	  catch(Exception s) 
		  {
	System.out.println("user is able to click on save settings button"+s);
	Assert.fail();
	} 
		  }
	 
	
	  @Given("user is on edit_profile") 
	  public void user_is_on_edit_profile1() {
	  System.out.println("user is on edit profile page"); }
	  
	  @When("user enter {string} ,{string},{string}")
	  public void user_enter(String oldpassword, String newpassword, String confirmpassword) 
	  {
		  try
		  {
			  driver.findElement( By.id("profile_password0")).sendKeys("g");
			  Thread.sleep(2000);
			  driver.findElement(By.id("password1")).sendKeys("hghe");
			  Thread.sleep(2000);
			  driver.findElement(By.id("profile_password2")).sendKeys("hfhe");
			  Thread.sleep(2000); } catch(Exception a) {
			System.out.println("user is not able to change password");
				  Assert.fail();
	  }
		  }
	  
	  @Then("user gets a message after clicking on save setting") 
	  public void user_gets_a_message_after_clicking_on_save_setting()
	  {
		  try
		  {
	  driver.findElement(By.id("profile_apply_change")).click();
	  Thread.sleep(2000);
	  if(driver.findElement(By.xpath("//div[text()='You have typed two different passwords']")).isDisplayed()) 
	  { 
		  System.out.println("true");
		  }
	  else System.out.println("not displayed");
	  } 
		  catch(Exception s) {
	  System.out.println("user is able to click on save settings button"+s);
	  Assert.fail();
	  }
		  }
	 
	
	  @Given("user is on edit.profile") 
	  public void user_is_on_edit_profile11() {
	  System.out.println("user is on edit profile page");
	  }
	  
	  @When("user enters Skype url") 
	  public void user_enters_Skype_url() 
	  {
		  try
		  {
	  Thread.sleep(2000); driver.findElement(By.id("extra_skype")).sendKeys("dhjhcyfe2fiycivc@skype.com"); 
	  }
		  catch(Exception ex) 
		  {
	  System.out.println("user is not able to enter skype url"+ex); 
	  Assert.fail();
	  }
		  }
	  
	  @When("user enter LinkedIn url") 
	  public void user_enter_LinkedIn_url()
	  {
		  try
	  { 
			  Thread.sleep(2000);
	  driver.findElement(By.id("extra_linkedin_url")).sendKeys("dhjhcyfe2fiycivc@skype.com"); 
	  }
		  catch(Exception ex) {
	  System.out.println("user is not able to enter skype url"+ex);
	  Assert.fail(); 
	  }
	  
	  }
	  
	  @Then("user is able to click on save settings again") 
	  public void user_is_able_to_click_on_save_settings_again() 
	  { 
		  try
		  { 
			  Thread.sleep(2000);
	  driver.findElement(By.id("profile_apply_change")).click(); 
	  } 
		  catch(Exception u) 
		  {
			  System.out.println("user is able to save setting"+u);
			  Assert.fail();}
	  
	  }
	
	@When("user clicks on profile image")
	public void user_clicks_on_profile_image() {
	    try
	    {   
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//img[@class='img-responsive img-circle']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//div[@class='modal fade in']")).click();
	    }
	    catch(Exception g)
	    {
	    	System.out.println("user is not able to click on profile photo"+g);
	 Assert.fail();
	    }
	}

	@When("user is able to click on remove image checkbox")
	public void user_is_able_to_click_on_remove_image_checkbox() {
		 try
		    {   
		    	Thread.sleep(3000);
		    	driver.findElement(By.name("remove_picture")).click();
		    	
		    }
		    catch(Exception g)
		    {
		    	System.out.println("user is not able to click on checkbox"+g);
	  Assert.fail();
		    }
	}

	@Then("user clicks on save changes")
	public void user_clicks_on_save_changes() {
		{ 
			try 
			{ 
				Thread.sleep(2000);
	            driver.findElement(By.id("profile_apply_change")).click(); 
			}
		catch(Exception u) 
		  { 
			System.out.println("user is able to save setting"+u); Assert.fail();
			}
	}
	}
	 
	  

	@When("user enters skype url")
	public void user_enters_skype_url() {
	    
		try {
			  Thread.sleep(2000); 
			  driver.findElement(By.id("extra_skype")).clear();
			  driver.findElement(By.id("extra_skype")).sendKeys("Tanujapatil@skype.com");
		}
			  catch(Exception e)
				{
					System.out.println("skype text box not found"+e);
					Assert.fail();
				}
			  
	}

	@Then("linkedIn url")
	public void linkedin_url() {
	    try {
	    	 Thread.sleep(2000);
			  driver.findElement(By.id("extra_linkedin_url")).clear();
			  driver.findElement(By.id("extra_linkedin_url")).sendKeys("Tanujapatil@skype.com");
	    }
	    catch(Exception e)
		{
			System.out.println("LinkedIn text box not found"+e);
			Assert.fail();
		}
	}

	@And("clicks on save setting")
	public void clicks_on_save_setting() {
		 try { Thread.sleep(2000);
		 driver.findElement(By.id("profile_apply_change")).click(); 
		 } 
		 catch(Exception u)
		 { 
			 System.out.println("user is able to save setting"+u); }
		 Assert.fail();
	}

	@Then("user should get validation message")
	public void user_should_get_validation_message() {
		 try {
		     WebElement strValue=driver.findElement(By.xpath("//div[@class='alert alert-info']"));	
			String strExpected="Skype and LinkedIn profile URL should not be same" ;
			
		    	System.out.println(strValue.getText());
			if(strExpected.equals(strValue))
			{
				System.out.println("correct validation message");
			}
			else
				System.out.println("INcorrect validation message");
			     Assert.fail();
		    }
		 
		    catch(Exception c) {
				  System.out.println("No validation message "+c);
				  Assert.fail();
	}


	}
}







	

