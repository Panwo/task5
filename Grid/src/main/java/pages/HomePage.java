package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//a[@href='/lists/'][contains(.,'Lists')]")
    private WebElement listsMenu;
    @FindBy(xpath = "//ul[@class='poster-list -p150 -horizontal']")
    private List<WebElement> newOnLetterboxList;

    public void clickSignIn () {
        signInButton.click();
    }

    public void fillUsername(String username) {
       userNameField.clear();
       userNameField.sendKeys(username);
    }

    public void fillPassword (String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnListMenu () {
        listsMenu.click();
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }


}
