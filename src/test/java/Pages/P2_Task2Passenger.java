package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Task2Passenger {
    WebDriver driver;

    public P2_Task2Passenger(WebDriver driver) {
        this.driver = driver;

        //create pagefactory
        PageFactory.initElements(driver, this);
    }

    //pagefactory
    @FindBy(name = "passengerName")
    WebElement namePF;

    public WebElement NamePom() {
        By Name = By.name("passengerName");
        WebElement nameElement = driver.findElement(Name);
        return nameElement;
    }

    public WebElement AgePom() {
        By Age = By.name("passengerAge");
        WebElement AgeElement = driver.findElement(Age);
        return AgeElement;
    }

    public void passengerName(String Name) {
        //pagefactory
        // namePF.clear();
        NamePom().sendKeys(Name);
    }

    public void passengerAge(String Age) {
        //pagefactory
        AgePom().sendKeys(Age);
    }
}