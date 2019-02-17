package site.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.abstraction.ProductsListPage;

public class MobilePhoneListPage extends ProductsListPage {


    public MobilePhoneListPage(WebDriver driver, WebDriverWait webDriverWait) {
        super(driver, webDriverWait);
    }
}
