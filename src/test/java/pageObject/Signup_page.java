package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Signup_page extends Config {
    public Signup_page (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//a[@class='new-account']")
    public WebElement createNewAccount;

    public void clickOnNewAccount(){
        createNewAccount.click();
    }

    public void pageTitle(){
        System.out.println("Page title is=====>"+ driver.getTitle());
    }

}
