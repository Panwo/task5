package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class WatchListTest extends BaseTest {

    private String listName = "Test";
    private String filmName =  "Godzilla vs Kong (2021)";


    @Test
    public void createNewWatchList  () throws InterruptedException {
        getHomePage().clickSignInHeaderOption();
        getHomePage().fillUsername(userName);
        getHomePage().fillPassword(password);
        getHomePage().clickSignIn();
        getHomePage().waitForPageLoadComplete(30);
        getHomePage().waitForAjaxToComplete(30);
        getHomePage().clickOnListMenu();
        getHomePage().waitForPageLoadComplete(30);
        getWatchListPage().clickStartYourOwnListButton();
        getWatchListPage().enterListName(listName);
        getWatchListPage().enterFilmName(filmName);
        getWatchListPage().submitNewListForm();
        getWatchListPage().verifyCreationSuccess();
    }


    @Test
    public void addMoviesToWatchList () {
        getHomePage().clickSignIn();
        getHomePage().fillUsername(userName);
        getHomePage().fillPassword(password);
        getHomePage().clickSignIn();
        getHomePage().waitForPageLoadComplete(30);

    }
}
