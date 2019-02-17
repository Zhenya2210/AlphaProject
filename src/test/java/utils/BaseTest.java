package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import site.pages.*;

public class BaseTest {


    private static WebDriver driver;
    private static WebDriverWait webDriverWait;
    private static JavascriptExecutor executor;
    protected static YandexMainPage yandexMainPage;
    protected static MarketMainMenuPage marketMainMenuPage;
    protected static ElectronicsPage electronicsPage;
    protected static MobilePhoneListPage mobilePhoneListPage;
    protected static MobilePhoneFiltersPage mobilePhoneFiltersPage;
    protected static MarketSearchLine marketSearchLine;
    protected static HeadphoneListPage headphoneListPage;
    protected static HeadphoneFiltersPage headphoneFiltersPage;
    private static boolean setUpIsDone = false;


    @BeforeAll
    public static void setUp(){
        if (setUpIsDone) {
            return;
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 5);
        executor = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        yandexMainPage = new YandexMainPage(driver);
        marketMainMenuPage = new MarketMainMenuPage(driver);
        electronicsPage = new ElectronicsPage(driver);
        mobilePhoneListPage = new MobilePhoneListPage(driver, webDriverWait);
        mobilePhoneFiltersPage = new MobilePhoneFiltersPage(driver, executor);
        marketSearchLine = new MarketSearchLine(driver);
        headphoneListPage = new HeadphoneListPage(driver, webDriverWait);
        headphoneFiltersPage = new HeadphoneFiltersPage(driver, executor);
        setUpIsDone = true;

    }


    public void openYandex(){
        driver.get("https://yandex.ru/");
    }


    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
