package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilmPage extends BasePage {
    @FindBy(xpath = "//a[contains(.,'Add this film to your Watchlist')]")
    private WebElement addToWatchListButton;


    public void clickAddToWatchListButton () {
        addToWatchListButton.click();
    }
    public FilmPage(WebDriver driver) {
        super(driver);
    }

}
