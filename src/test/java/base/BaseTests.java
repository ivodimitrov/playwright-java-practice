package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.SearchPage;

public class BaseTests {

    private Browser browser;

    @BeforeClass
    public void setUp() {
        browser = Playwright
                .create()
                .chromium()
                .launch();
    }
}
