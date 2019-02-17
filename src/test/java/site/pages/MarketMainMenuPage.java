package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketMainMenuPage {

    WebDriver driver;

    private By electronicsButton = By.xpath("//div[@class='n-w-tabs__horizontal-tabs-container']//a[@href='/catalog--elektronika/54440']");


    public MarketMainMenuPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickElectronics(){
        driver.findElement(electronicsButton).click();
    }


}
