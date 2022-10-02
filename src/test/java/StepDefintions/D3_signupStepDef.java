package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D3_signupStepDef {
   // WebDriver driver;

    @When("enter card number")
    public void card() {
        //01 credit number
       Hooks. driver.findElement(By.name("cnumber")).sendKeys("5452566789876543");
    }

    @And("choose month")
    public void Date() {
        //02   month
        Select select = new Select (Hooks.driver.findElement(By.id("expmon")));
        select.selectByValue("04");
    }

    @And("choose Year")
    public void Date2() {
        //03 year
        Select select;
        select= new Select(Hooks.driver.findElement(By.id("expyr")));
        select.selectByValue("2024");
        // 04 CVV/CVC
         Hooks.driver.findElement(By.id("cvv2")).sendKeys("435366 64747");

    }

    @And("Card Holder Name")
    public void Holder() {
        //04 holder
       Hooks. driver.findElement(By.id("cname2")).sendKeys("aassdd");
    }



}