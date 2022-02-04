import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

@Listeners(CustomListeners.class)
public class TestClass extends BaseClass {

    public String HOMEPAGE_URL = "https://www.bookswagon.com/";


    @Test(priority = 0)
    public void launchingHomepage() {
        driver.get(HOMEPAGE_URL);
        assertEquals(driver.getCurrentUrl(), HOMEPAGE_URL);
    }

    @Test(priority = 1)
    public void failedCase() {
        assertFalse(true);
    }
}
