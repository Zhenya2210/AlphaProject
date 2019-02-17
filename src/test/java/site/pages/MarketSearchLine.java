package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketSearchLine {

    private WebDriver driver;

    private By searchLine = By.xpath("//input[@id = 'header-search']");
    private By findButton = By.xpath("//span[@class='search2__button']/button");


    public MarketSearchLine(WebDriver driver) {
        this.driver = driver;
    }


    public void enterValue(String value){
        driver.findElement(searchLine).sendKeys(value);
    }


    public void clickFind(){
        driver.findElement(findButton).click();
    }


}
