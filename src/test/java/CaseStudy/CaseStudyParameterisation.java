package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudyParameterisation {
	WebDriver driver;
	
	@Given("App is launched by user")
	public void app_is_launched_by_user() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");	
	}

	@Given("User clicks on the Register on home page")
	public void user_clicks_on_the_Register_on_home_page() {
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("User enters valid data in input fields")
	public void user_enters_valid_data_in_input_fields() {
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Drishti");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Singh");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("drishtis.dt@gm.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("1234567890");
	}

	@Then("user clicks on the register")
	public void user_clicks_on_the_register() {
	    driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//Thread.sleep(2000);
		driver.close();	
	}

	@Given("user clicks on the LogIn link on homepage")
	public void user_clicks_on_the_LogIn_link_on_homepage() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}

	@When("user enters the registered username {string}")
	public void user_enters_the_registered_username(String string_uname) {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string_uname);	
	}

	@When("user enters the registered password {string}")
	public void user_enters_the_registered_password(String string_pswrd) {
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string_pswrd);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
	}
}
