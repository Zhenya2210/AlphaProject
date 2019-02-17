package site.abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Helper;

public abstract class ProductsListPage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    private By allFiltersButton = By.xpath("//a[child::span[text() = 'Все фильтры']]");
    private By nameProduct = By.xpath("//div[@class='n-snippet-cell2__title']");
    private By sortByPriceButton = By.xpath("//div[@class='n-filter-sorter i-bem n-filter-sorter_js_inited']/a[text() = 'по цене']");
    private By activeFieldWithProducts = By.xpath("//div[@class='n-filter-applied-results__content preloadable i-bem preloadable_js_inited' and @style = 'height: auto;']");

    public ProductsListPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }


    public void clickAllFilters(){
        driver.findElement(allFiltersButton).click();
    }


    public int getQuantityProducts(){
        return driver.findElements(nameProduct).size();
    }


    public String getNameProduct(int numberFromList){
        return driver.findElement(By.xpath("/descendant::div[@class='n-snippet-cell2__title'][" + numberFromList + "]/a")).getText();
    }


    public void clickSortByPrice(){
        driver.findElement(sortByPriceButton).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(activeFieldWithProducts));

    }


    public boolean checkThatSortByPriceCorrect(){
        boolean result = true;
        int priceOne;
        int priceTwo;
        int quantityProductsOnPage = driver.findElements(nameProduct).size();
        for (int i1 = 1, i2 = 2; i2 <= quantityProductsOnPage; i1++, i2++) {
            priceOne = Helper.getNumberFromString(driver.findElement(By.xpath("/descendant::div[@class='n-snippet-cell2__main-price-wrapper'][" + i1 + "]//div[@class='price']")).getText());
            priceTwo = Helper.getNumberFromString(driver.findElement(By.xpath("/descendant::div[@class='n-snippet-cell2__main-price-wrapper'][" + i2 + "]//div[@class='price']")).getText());
            if (priceOne <= priceTwo){
                continue;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }


}
