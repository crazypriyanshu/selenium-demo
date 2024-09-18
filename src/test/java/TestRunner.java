import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void setup() {
        System.out.println("--- starting test suite from testng ---");
    }

    @AfterClass
    public void tearDown() {
        System.out.println(" --- closing test suite from testng ---");
    }
}
