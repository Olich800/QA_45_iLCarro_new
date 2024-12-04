package pages;

import dto.UserDtoLombok;
import dto.UserDtoLombokLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//input[@type='email']")
    WebElement inputLogin;
    @FindBy(xpath = "//input[@type='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnYalla;
    @FindBy(xpath = "//h2[@class='message']")
    WebElement popUpMessage;
    @FindBy(xpath = "//h1[@class='title']")
    WebElement popupMessage;


    public void typeLoginForm(UserDtoLombokLogin user) {
        inputLogin.sendKeys(user.getLogin());
        inputPassword.sendKeys(user.getPassword());


    }

    public void clickBtnYalla() {
        btnYalla.click();
    }

    public boolean isPopUpMessagePresent() {
        return isTextInElementPresent(popUpMessage, "Logged in success");
    }

    public boolean isPopupMassagePresent() {
        return isTextInElementPresent(popupMessage, "Login or Password incorrect");

    }
}
