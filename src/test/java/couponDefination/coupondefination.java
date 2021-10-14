package couponDefination;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;

import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import couponMethod.couponmethod;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class coupondefination {

	
	WebDriver driver=couponmethod.driver;
	
	@Given("User is on the Retail application")
	public void user_is_on_the_Retail_application() {
		System.out.println("Welcome");
	    
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		try
		{
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@123");
			
		}
		catch(Exception e)
		{
			System.out.println("user unble to login"+e);
		}
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
		try
		  {
			  driver.findElement(By.tagName("button")).click();
			  Thread.sleep(2000);
			 
		  }
		  catch(Exception e)
		  {
			  System.out.println("User is unble to login"+e);
		  }
	    
	}

	@And("User navigate to the Dashboard")
	public void user_navigate_to_the_Dashboard() {
		try{
			String expectedtitle=driver.getTitle();
			String actualtitle="Dashboard";
			AssertJUnit.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User not able to navigate to dashboard"+e);
		}
	    
	}
	@And("click on button menu")
	public void click_on_button_menu() {
		try
	    {
	    	driver.findElement(By.id("button-menu")).click();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("User unble to click on button-menue" +e);
	    }
	}
	//*[@id=\"menu-marketing\"]/a/span
	@Then("User click on Marketing")
	public void user_click_on_Marketing() {
		try
		  {
			  driver.findElement(By.xpath("//span[contains(text(),'Marketing')]")).click();
			  Thread.sleep(3000);
			 
		  }
		  catch(Exception e)
		  {
			  System.out.println("User is unable to click on marketing button" +e);
		  }
		
		
		
	}



	@Given("User click on coupons")
	public void user_click_on_coupons() {
		try
		  {
			  driver.findElement(By.xpath("//*[@id=\"menu-marketing\"]/ul/li[3]/a")).click();
			  Thread.sleep(4000);
			 
		  }
		  catch(Exception e)
		  {
			  System.out.println("User is unble to click on Coupons link" +e);
		  }
	}
	//(By.xpath("//*[@id=\"menu-marketing\"]/ul/li[3]/a"))
	//(By.linkText("Coupons")).click();
	@And("User navigate to coupon Dashboard")
	public void user_navigate_to_coupon_Dashboard() {
		try{
			String expectedtitle=driver.getTitle();
			String actualtitle="Coupons";
			AssertJUnit.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User not able to navigate to dashboard"+e);
		}
	}

	@And("Click on Add button")
	public void click_on_Add_button() {
		try
		  {
			  driver.findElement(By.xpath("//a[@data-toggle='tooltip']")).click();
			  Thread.sleep(4000);
			 
		  }
		  catch(Exception e)
		  {
			  System.out.println("User is unble to click on add" +e);
		  }
	    
	}
	@And("Enter the {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
	public void enter_the(String Coupon_Name, String code, String discount, String total_amount, String product, String category, String date_start, String date_end, String uses_total, String uses_Customer) {
		 try
		   {
			   driver.findElement(By.name("name")).sendKeys(Coupon_Name);
			   driver.findElement(By.name("code")).sendKeys(code);
			  
			   driver.findElement(By.name("discount")).sendKeys(discount);
			   driver.findElement(By.name("total")).sendKeys(total_amount);
			   
			   
			   
				driver.findElement(By.xpath("//input[@id='input-product']")).sendKeys(product);
				   driver.findElement(By.xpath("//input[@id='input-category']")).sendKeys(category);
				   Thread.sleep(5000);
				
				 
				   driver.findElement(By.name("date_start")).sendKeys(date_start);
				   driver.findElement(By.name("date_end")).sendKeys(date_end);
				   
				   driver.findElement(By.name("uses_total")).sendKeys(uses_total);
				   driver.findElement(By.name("uses_customer")).sendKeys(uses_Customer);
				   
				   
				   
				   
	}
		 catch(Exception e)
		  {
			  System.out.println("User is unble to enter" +e);
		  }
	}
	@And("User Select Type,Customer_Login,Free_shipping,Status")
	public void user_Select_Type_Customer_Login_Free_shipping_Status() {
		try {
		Select sel=new Select(driver.findElement((By.xpath("//select[@name='type']"))));
		 sel.selectByVisibleText("Fixed Amount");
		 //sel.selectByIndex('1');
		
		 WebElement yes=driver.findElement(By.name("logged"));
			//WebElement no=driver.findElement(By.name("logged"));
			
			 //radio button1 selected
			yes.click();
			//no.click();
			
			WebElement yes1=driver.findElement(By.name("shipping"));
			//WebElement no1=driver.findElement(By.name("shipping"));
			yes1.click();
			
			 Select sel1=new Select(driver.findElement((By.xpath("//select[@name='status']"))));
			 sel1.selectByVisibleText("Disabled");
			 //sel.selectByIndex('1');
		}
		catch(Exception e)
		{
			System.out.println("User not able enter data"+e);
		}
	}

@And("User CLick the displayed message")
	public void user_CLick_the_dispalyed_message() {
		try {
			 if(isDisplayed11())
					  {
						   System.out.print("Valid Message"+" ");
						   System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Success')]")).getText());
					  }
			
			 else
			 {
				
					System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());
			 }
					   }
			 catch(Exception e) {
						System.out.println(e);
	
				    }
				}
public boolean isDisplayed11() {
    try {
    	WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Success')]"));
    	boolean flag = element.isDisplayed();
    	return flag;
    	
        
    } catch (Exception e) {
        return false;
    }
}

@And("User click on save button")
	public void user_click_on_save_button() {
		try{
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   Thread.sleep(4000);
		   }
		   catch(Exception e)
		   {
			   System.out.println("User unble to save"+e);
		   }
	}
	public boolean isDisplayed() {
					        try {
					        	WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Success')]"));
					        	boolean flag = element.isDisplayed();
					        	return flag;
					        	
					            
					        } catch (Exception e) {
					            return false;
					        }
	}
		
	
	@Then("user redirected to the coupons home page")
	public void user_redirected_to_the_coupons_home_page() {
		try{
			String expectedtitle=driver.getTitle();
			String actualtitle="Coupons";
			AssertJUnit.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User not able to navigate to dashboard"+e);
		}
	    
	}

	@And("user click on checkbox")
	public void user_click_on_checkbox() {
		try {
			
		
		 driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[1]/input")).click();
		 Thread.sleep(5000);
		}
		 catch(Exception e)
		  {
			  System.out.println("User is unble to click on checkbox" +e);
		  }
	}
	
	@And("User Click on Edit button")
	public void user_Click_on_Edit_button() {
		try
		  {
			  driver.findElement(By.xpath("//a[@data-toggle='tooltip']")).click();
			  Thread.sleep(4000);
			 Thread.sleep(6000);
		  }
		  catch(Exception e)
		  {
			  System.out.println("User is unble to click on returns" +e);
		  }
	}
	@And("User Edit the {string},{string},")
	public void user_Edit_the(String Coupon_Name, String code) {
		 try
		   {
			   driver.findElement(By.name("name")).sendKeys(Coupon_Name);
			   driver.findElement(By.name("code")).sendKeys(code);
			   Thread.sleep(6000);
		   }
		 catch(Exception e)
		  {
			  System.out.println("User is unble to edit" +e);
		  }
	}
	@And("User clicks on save button")
	public void user_clicks_on_save_button() {
		try{
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   Thread.sleep(4000);
		   }
		   catch(Exception e)
		   {
			   System.out.println("User unble to save"+e);
		   }
	}
	@And("User CLick the displayed message on coupon dashboard")
	public void user_CLick_the_displayed_message_on_coupon_dashboard1() {
			try {
				 if(isDisplayed())
						  {
							   System.out.println("Valid Message");
							 //  System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Success')]")).isDisplayed());
						  }
				
				 else
				 {
					
						System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());
				 }
						   }
				 catch(Exception e) {
							System.out.println(e);

					    }
					}
						   public boolean isDisplayed1() {
						        try {
						        	WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Success')]"));
						        	boolean flag = element.isDisplayed();
						        	return flag;
						        	
						            
						        } catch (Exception e) {
						            return false;
						        }
		}
						   @Then("User redirected to home page")
							public void user_redirected_to_home_page() {
								try{
									String expectedtitle=driver.getTitle();
									String actualtitle="Coupons";
									AssertJUnit.assertEquals(expectedtitle,actualtitle);
									Thread.sleep(2000);
								}
								catch(Exception e)
								{
									System.out.println("User not able to navigate to dashboard"+e);
								}
							}
						  /* @And("User click on the one of the checkbox on coupons page")
						   public void user_click_on_the_one_of_the_checkbox_on_coupons_page() {
							   try {
									
						    		
							   		 driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[2]/td[1]/input")).click();
							   		 Thread.sleep(5000);
							   		}
							   		 catch(Exception e)
							   		  {
							   			  System.out.println("User is unable to click on checkbox" +e);
							   		  }
						   }*/
						 
						   @And("User Click on Edit button on coupons page")
						   public void user_Click_on_Edit_button_on_coupons_page() {
							   try
								  {
									  driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[2]/td[8]/a")).click();
									  Thread.sleep(4000);
									 
								  }
								  catch(Exception e)
								  {
									  System.out.println("User is unble to click on returns" +e);
								  }
						   }
						 
						   @Then("User go to edit history")
						   public void user_go_to_edit_history() {
							   try {
									
						    		
							   		 driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/ul/li[2]/a")).click();
							   		
							   		 
							   		 Thread.sleep(5000);
							   		// Assert.fail();
							   		}
							   		 catch(Exception e)
							   		  {
							   			  System.out.println("User is unable to check the history" +e);
							   		  }
						   }

						    @Given("user click on checkbox on edit page")
						   public void user_click_on_checkbox_on_edit_page() {
						    	try {
									
						    		
						   		 driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[1]/input")).click();
						   		 Thread.sleep(5000);
						   		}
						   		 catch(Exception e)
						   		  {
						   			  System.out.println("User is unble to click on checkbox" +e);
						   		  }
						   }

						   @Given("User Click on Edit button on the coupon page")
						   public void user_Click_on_Edit_button_on_the_coupon_page() {
							   try
								  {
									  driver.findElement(By.xpath("//a[@data-toggle='tooltip']")).click();
									  Thread.sleep(4000);
									 Thread.sleep(6000);
								  }
								  catch(Exception e)
								  {
									  System.out.println("User is unble to click on returns" +e);
								  }
						   }

						   @Given("User Edit the values of {string},{string},")
						   public void user_Edit_the_values_of(String Coupon_Name, String code) {
							   try
							   {
								   driver.findElement(By.name("name")).sendKeys(Coupon_Name);
								   driver.findElement(By.name("code")).sendKeys(code);
								   Thread.sleep(6000);
							   }
							 catch(Exception e)
							  {
								  System.out.println("User is unble to edit" +e);
							  }
						       
						   }
						   @And("User click on cancel button in the coupon page")
							public void user_click_on_cancel_button_in_the_coupon_page() {
								try{
									   driver.findElement(By.xpath("//a[@data-toggle='tooltip']")).click();
									   Thread.sleep(4000);
								   }
								   catch(Exception e)
								   {
									   System.out.println("User unble to save"+e);
								   }
							}


						   @Then("User redirected to home page of coupon")
						   public void user_redirected_to_home_page_of_coupon() {
							   try{
									String expectedtitle=driver.getTitle();
									String actualtitle="Coupons";
									AssertJUnit.assertEquals(expectedtitle,actualtitle);
									Thread.sleep(2000);
								}
								catch(Exception e)
								{
									System.out.println("User not able to navigate to dashboard"+e);
								}
							    
						   }

@And("user click on one of the checkbox to delete the coupon")
	public void user_click_on_one_of_the_checkbox_to_delete_the_coupon() {
		try {
			driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div/table/tbody/tr[1]/td[1]/input")).click();
		}
		catch(Exception e)
		   {
			   System.out.println("User unble to click on delete message" +e);
		   }
	}

	@And("User click on delete button in the coupon page")
	public void user_click_on_delete_button_in_the_coupon_page() {
		try{
			   driver.findElement(By.xpath("//button[@type='button']")).click();
			   Thread.sleep(4000);
		   }
		   catch(Exception e)
		   {
			   System.out.println("User unble to click on delete message" +e);
		   }	
	}
	

	@And("User got alert pop-up message")
	public void user_got_alert_pop_up_message() {
		try{
			Alert alert=driver.switchTo().alert();
		    //Thread.sleep(3000);
			alert.accept();
			
			//alert.dismiss();
		   }
		   catch(Exception e)
		   {
			   System.out.println("User unble to get alert message"+e);
		   }
		
	}

	@Then("user get redirected to the homepage")
	public void user_get_redirected_to_the_homepage() {
		try{
			String expectedtitle=driver.getTitle();
			String actualtitle="Coupons";
			AssertJUnit.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User not able to navigate to dashboard"+e);
		}
	}
	@And("User want to sort the Coupon by {string}")
	public void user_want_to_sort_the_Coupon_by(String string) {
		try{
			
			 driver.findElement(By.xpath("//a[contains(text(),'Coupon Name')]")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User is able to sort the coupon in ascending or in descending order"+e);
		}
	   
	}

	@Then("User get redirected to the homepage")
	public void user_get_redirected_to_the_homepage1() {
		try{
			String expectedtitle=driver.getTitle();
			String actualtitle="Coupons";
			AssertJUnit.assertEquals(expectedtitle,actualtitle);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("User not able to navigate to dashboard"+e);
		}
	}
	




//mails
@Given("User click on Mails")
public void user_click_on_Mails() {
	try
	  {
		  driver.findElement(By.xpath("//*[@id=\"menu-marketing\"]/ul/li[4]/a")).click();
		  Thread.sleep(4000);
		 
	  }
	  catch(Exception e)
	  {
		  System.out.println("User is unable to click on Mail" +e);
	  }
}

@And("User navigate to mail Dashboard")
public void user_navigate_to_mail_Dashboard() {
	try{
		String expectedtitle=driver.getTitle();
		String actualtitle="Mail";
		AssertJUnit.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("User not able to navigate to dashboard"+e);
	}
    
}



@And("User Select From,To")
public void user_Select_From_To() {
	Select sel=new Select(driver.findElement((By.xpath("//select[@name='store_id']"))));
	 sel.selectByVisibleText("Default");
	 
	 Select sel1=new Select(driver.findElement((By.xpath("//select[@name='to']"))));
	 sel1.selectByValue("product");
   
}

@Then("Enter {string},{string}")
public void enter(String subject, String message) {
	
	driver.findElement(By.xpath("//input[@id='input-subject-1']")).sendKeys(subject);
	driver.findElement(By.xpath("//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")).sendKeys(message);
	
    
}

@And("Click on Send button")
public void click_on_Send_button() {
	try{
		   driver.findElement(By.xpath("//button[@id='button-send']")).click();
		   Thread.sleep(4000);
	   }
	   catch(Exception e)
	   {
		   System.out.println("User unble to send"+e);
	   }
}
@Then("user is able to click on displayed message on mail dashboard")
public void user_is_able_to_click_on_displayed_message_on_mail_dashboard() {
	try {
		 
				System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]")).getText());
		 }
				   
		 catch(Exception e) {
					System.out.println(e);

			    }
			}
				  
    

@Then("User navigtates to Home page")
public void user_navigtates_to_Home_page() {
	try{
		String expectedtitle=driver.getTitle();
		String actualtitle="Mail";
		AssertJUnit.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("User not able to navigate to dashboard"+e);
	}
}

@And("User click on cancel button")
public void user_click_on_cancel_button() {
	try{
		   driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")).click();
		   Thread.sleep(9000);
	   }
	   catch(Exception e)
	   {
		   System.out.println("User unble click on cancel button"+e);
	   }
}
@Then("User gets redirected to home page")
public void user_gets_redirected_to_home_page() {
	try{
		String expectedtitle=driver.getTitle();
		String actualtitle="Mail";
		AssertJUnit.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("User not able to navigate to dashboard"+e);
	}
    
}

    
@Given("User navigate to Home Page")
public void user_navigate_to_Home_Page() {
	try{
		String expectedtitle=driver.getTitle();
		String actualtitle="Mail";
		AssertJUnit.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("User not able to navigate to dashboard"+e);
	}
}

@Then("Enter {string},{string} in Mail page")
public void enter_in_Mail_page(String subject1, String message1) {
	try {
	driver.findElement(By.xpath("//input[@id='input-subject-1']")).sendKeys(subject1);
	driver.findElement(By.xpath("//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")).sendKeys(message1);
	
	}
	catch(Exception e)
	{
		System.out.println("User is able to send the mail"+e);
	}
}

@Then("Click on Send button on the Mail page")
public void click_on_Send_button_on_the_Mail_page() {
	try{
		   driver.findElement(By.xpath("//button[@id='button-send']")).click();
		   Thread.sleep(4000);
		   
	   }
	   catch(Exception e)
	   {
		   System.out.println("User unable to send"+e);
	   }
}

@Then("user is click on displayed message on mail dashboard")
public void user_is_click_on_displayed_message_on_mail_dashboard() {
	try {
		 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]")).getText());
 }
		   
 catch(Exception e) {
			System.out.println(e);

	    }
	}
		  
}









