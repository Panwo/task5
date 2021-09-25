package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilmPage extends BasePage {
    @FindBy(xpath = "//a[contains(.,'Add this film to your Watchlist')]")
    private WebElement addToWatchListButton;
    @FindBy(xpath = "(//a[@href='#'][contains(.,'Tester123')])[2]")
    private WebElement accountDropdown;
    @FindBy(xpath = "//a[contains(.,'Watchlist')]")
    private WebElement watchListsElement;
    @FindBy(xpath = "//ul[contains(@class,'poster-list -p125 -grid -constrained')]")
    private List<WebElement> watchlistMoviesContainer;


    public void clickAddToWatchListButton () {
        addToWatchListButton.click();
    }

    public void expandAccountDropdown () {
        accountDropdown.click();
    }


    public void openWatchListWithinAccountDropdown () {
        expandAccountDropdown();
        watchListsElement.click();
    }

    public void verifyThatWatchListContainsMovies (int moviesCount) {
        checkFilmsNumber(moviesCount);
    }

    public boolean checkFilmsNumber (int moviesCount) {
       if (watchlistMoviesContainer.size() == moviesCount) return true;
       else return false;
    }

    public FilmPage(WebDriver driver) {
        super(driver);
    }

}
