package framework.webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ElementUtil{

    WebDriver driver;

    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");


    public void clickOnLoginButton() {
        clickOn(loginButton);
    }

    public void enterEmail(String enterEmail) {
        setValue(emailTextField, enterEmail);
    }

    public void enterPassword(String enterPassword) {
        setValue(passwordTextField, enterPassword);
    }





}