package site.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import site.abstraction.FiltersPage;

public class MobilePhoneFiltersPage extends FiltersPage {


    public MobilePhoneFiltersPage(WebDriver driver, JavascriptExecutor executor) {
        super(driver, executor);
    }
}
