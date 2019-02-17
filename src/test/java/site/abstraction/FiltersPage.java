package site.abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class FiltersPage {

    private WebDriver driver;
    private JavascriptExecutor executor;

    private By priceMinInput = By.xpath("//input[@id = 'glf-pricefrom-var']");
    private By showSuitableButton = By.linkText("Показать подходящие");

    public FiltersPage(WebDriver driver, JavascriptExecutor executor) {
        this.driver = driver;
        this.executor = executor;
    }

    public void setPriceMin(String priceMin){
        driver.findElement(priceMinInput).sendKeys(priceMin);
    }

    public void clickCheckBoxBrand(String brand){
        By locatorBrand = By.xpath("//div[@class='n-filter-block__list-items i-bem']//label[@class='checkbox__label' and text()='" + brand + "']");
        WebElement checkBoxBrand = driver.findElement(locatorBrand);
        executor.executeScript("arguments[0].click()", checkBoxBrand);
    }

    public void clickShowSuitable(){
        driver.findElement(showSuitableButton).click();
    }

}
