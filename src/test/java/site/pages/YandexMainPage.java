package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexMainPage {

    private WebDriver driver;

    private By marketButton = By.xpath("//a[@data-id = 'market']");


    public YandexMainPage(WebDriver driver){
        this.driver = driver;
    }


    public void clickMarket(){
        driver.findElement(marketButton).click();
    }
}
