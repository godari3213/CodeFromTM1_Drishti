package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.testng.Assert;

public class CaseStudyClass {
	
	WebDriver driver;
	
	@Given("Webdemoshop home page is launched")
	public void webdemoshop_home_page_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for launching website");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");		
	}

	@Given("User clicks on the Register link")
	public void user_clicks_on_the_Register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for registration");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("User enters valid input fields")
	public void user_enters_valid_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for taking valid inputs");
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Drishti");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Singh");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("drishtilol.dt@gm.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("1234567890");
	}

	@Then("user clicks on the register button")
	public void user_clicks_on_the_register_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for clicking on register button");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
	}

	@Given("Webdemoshop register page is loaded")
	public void webdemoshop_register_page_is_loaded() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for loading register page");
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
	}

	@Given("user clicks on the LogIn link")
	public void user_clicks_on_the_LogIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for clicking on logIn link");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@When("user enters the credentials")
	public void user_enters_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for entering the credentials");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("drish.dt@gm.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234567890");
	}

	@Then("user clicks on the logIn button")
	public void user_clicks_on_the_logIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for clicking on logIn button");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Given("user is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for logging in");
	}

	@When("user enters the item to be searched")
	public void user_enters_the_item_to_be_searched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for searching item");
	}

	@Then("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for clicking on the search button");
	}

	@Given("item is displayed")
	public void item_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for displaying the item");
	}

	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for adding item in the cart");
	}

	@Then("item gets added on the cart")
	public void item_gets_added_on_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for cart");
	}


}
