import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.pdas.pom.HomePage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestHomePage extends BaseTest{
    @Test
    public void testHomePage() throws IOException {
        log.info("Navigating to login page");
        webDriver.get("https://automationpanda.com/");

        HomePage homePage = new HomePage(webDriver);
        homePage.goToHeader();
        log.info("Home page reached");

        addScreenshot();

    }

    public void addScreenshot() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File directory = new File("screenshots");
        if (!directory.exists()) {
            directory.mkdir();
            log.info("Created directory: screenshots");
        }
        // create unique filename using timestamp
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        File destinationFile = new File("screenshots/login_"+ timestamp+".png");
        Files.copy(screenshot.toPath(), destinationFile.toPath());
        log.info("Screenshot saved successfully: "+ destinationFile.getPath());
    }
}
