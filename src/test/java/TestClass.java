import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(CustomListeners.class)
public class TestClass extends BaseClass {

    public String HOMEPAGE_URL = "https://www.bookswagon.com/";

    @Test
    public void launchingHomepage() {
        driver.get(HOMEPAGE_URL);
        assertEquals(driver.getCurrentUrl(), HOMEPAGE_URL);
    }
}
