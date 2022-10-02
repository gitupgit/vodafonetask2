package StepDefintions;

import Pages.P2_Task2Passenger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hr.Kad;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D1_Task2 {

    P2_Task2Passenger Taske2passenger;
   // public static WebDriver driver;


//
//    @Given("navigate to website")
//    public void navogateWEbsite() {
//        String chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromepath);
//
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//
//        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1#");
//    }

    @When("choose destination")
    public void destination() {
        Hooks.driver.findElement(By.cssSelector("[onclick=\"populateSearch('1467469338690', 'Chikkamagaluru', '1467467616730', 'Bengaluru');\"]")).click();
        System.out.println("s");
    }
    @And("select arrival date")
    public void arrivalDate() {
       Hooks. driver.findElement(By.xpath("//a[@class=\"ui-state-default\"][text()='23']")).click();
        System.out.println(" xpath");
    }

    @And("click on search bus button")
    public void SearchBus() {
        Hooks.driver.findElement(By.cssSelector("[onclick=\"openTTDConfirmPopoUp('1',this.form);\"]")).sendKeys(Keys.ENTER);
        System.out.println(" search");

    }

    @When("select a seat")
    public void SelectSeat() {
        Hooks.driver.findElement(By.xpath
                ("//input[@class=\"btnSelectLO select-service-btn\"][@id=\"SrvcSelectBtnForward0\"]")).sendKeys(Keys.ENTER);
        System.out.println(" seat ");
    }


    @Then("Choose the boarding point and dropping point")
    public void boardingPoint() {
        Hooks.driver.findElement(By.id
                ("Forward-1467550949362")).click();
        System.out.println(" search");
        Hooks.driver.findElement(By.id
                ("Forward-1467467616730")).click();
    }


    @And("Fill the “Customer” and “Passenger” details")
    public void customerDetails() {
        // write phone
       Hooks. driver.findElement(By.id("mobileNo")).sendKeys("6789125987)");
        // write Email
       Hooks. driver.findElement(By.id("email")).sendKeys("automation@gmail.com");

    }
    @And("Click on seat")
    public void clickseat() {

       Hooks. driver.findElement(By.id("Forward48")).click();
    }

    @And("^enter passenger name as \"(.*)\"$")
    public void write_name(String name) {
        Taske2passenger = new P2_Task2Passenger(Hooks.driver);
        Taske2passenger.passengerName(name);
        System.out.println("Name  "+name);
    }

    @And("choose gender")
    public void SelectGender() {
        // driver.findElement(By.id("genderCodeIdForward0")).click();
        //driver.findElement(By.xpath("//select[@id=\"genderCodeIdForward0\"])[1]")).click();
        Select select;
        select = new Select (Hooks.driver.findElement(By.id("genderCodeIdForward0")));
        select.selectByValue("24");
    }

    @And("^enter passenger Age as \"(.*)\"$")
    public void write_Age(String Age) {
        Taske2passenger = new P2_Task2Passenger(Hooks.driver);
        Taske2passenger.passengerAge(Age);
        System.out.println(" Age "+Age);
    }
    @And("select concession")
    public void selectconcession() {

        // driver.findElement(By.cssSelector("[id=genderCodeIdForward0"][value='25'])).click();
        Select select = new Select( Hooks.driver.findElement(By.id("concessionIdsForward0")));
        select.selectByValue("1466060086837");
    }
    @And("click Make Payment")
    public void MakePayment()
    {
       Hooks. driver.findElement(By.id("PgBtn")).sendKeys(Keys.ENTER);
    }
}
