package site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage {

    private WebDriver driver;

    private By mobilePhoneButton = By.xpath("//a[text() = 'Мобильные телефоны']");
    private By headphoneButton = By.xpath("//a[text() = 'Наушники и Bluetooth-гарнитуры']");

    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMobilePhone(){
        driver.findElement(mobilePhoneButton).click();
    }

    public void clickHeadphone(){
        driver.findElement(headphoneButton).click();
    }
}
