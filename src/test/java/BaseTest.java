import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.Logger;


public class BaseTest {
    protected WebDriver webDriver;
    protected static Logger log = LogManager.getLogger(BaseTest.class);
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Documents/softwares/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        webDriver = new ChromeDriver();
        log.info("Browser launched");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
        log.info("Browser closed");
    }
}
