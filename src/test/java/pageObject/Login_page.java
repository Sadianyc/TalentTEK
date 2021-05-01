package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    public Login_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.NAME,using = "email")
    public WebElement emailOrId;
    @FindBy(how = How.NAME,using = "password")
    public WebElement password;
    @FindBy(how = How.CLASS_NAME,using = "my-login")
    public WebElement loginButton;

    public void enterEmailOrId(String studentEmailOrId){
        emailOrId.sendKeys(studentEmailOrId);
    }
    public void enterPassword(String studentPassword){
        password.sendKeys(studentPassword);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }
}
