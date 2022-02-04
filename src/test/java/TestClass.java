import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(listeners.CustomListeners.class)
public class TestClass {

    public WebDriver driver;

    public String HOMEPAGE_URL = "https://www.bookswagon.com/";


    @BeforeTest
    public void setup() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void launchingHomepage() {
        driver.get(HOMEPAGE_URL);
        assertEquals(driver.getCurrentUrl(), HOMEPAGE_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
