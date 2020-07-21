package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocalizationStepDef {

    WebDriver driver;
    @Given("^User on the Welcome page of \" ([^\"]*)\"$")
    public void user_on_the_on(String arg1) throws Throwable{
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get(arg1);
        driver.manage () . window () . maximize () ;
    }

    @When("^User click on (.*)$")
    public void user_click_on_English(String arg) throws Throwable{
        driver.findElement(By.xpath("//a[@class =' "+arg+"']")).click();
    }

    @Then("^User should navigate to home page successfully with correct (.*)$")
    public void user_should_navigate_to_main_page_successfully(String lan) throws Throwable{
        String actual = driver.findElement(By.xpath("//a[@id='contact_link']")) .getAttribute("href");
        //String before ="/wrapper/wordpress/CMSWrapper/content/contactus?gen_from-abt&appacode-cp&lang-";
        //String expected = before+lan.substring(0,2);
        //Assert.assertEquals(actual.substring((18)), expected);
    }

    @Then ("^Should close the browser$")
    public void should_close_the_browser () throws Throwable{
        driver.quit();
    }

}
