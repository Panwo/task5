package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchListsPage extends BasePage {

    @FindBy(xpath = "//a[contains(.,'Start your own list')]")
    private WebElement createYourOwnListButton;
    @FindBy(xpath = "//input[contains(@class,'field focus-ring')]")
    private WebElement listName;
    @FindBy(xpath = "//input[contains(@placeholder,'Enter name of film...')]")
    private WebElement addAFilmField;
    @FindBy(xpath = "//input[contains(@class,'field ac_input focus-ring')]")
    private WebElement saveButton;
    @FindBy(xpath = "//span[contains(@class,'directors')]")
    private WebElement selectFirstSuggestion;
    @FindBy(xpath = "(//div[contains(.,'Your Test list was saved.')])[4]")
    private WebElement successMessage;

    public void clickStartYourOwnListButton () {
       createYourOwnListButton.click();
    }

    public void enterListName (String name) {
        listName.clear();
        listName.sendKeys(name);
    }

    public void enterFilmName (String filmName) {
         addAFilmField.sendKeys(filmName);
         selectFirstSuggestion.click();
    }

    public void submitNewListForm () {
        saveButton.click();
    }

    public void verifyCreationSuccess () {
        successMessage.isDisplayed();
    }

    public WatchListsPage(WebDriver driver) {
        super(driver);
    }
}
