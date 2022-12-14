import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testlogger.TestResultLogger;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)

public class baseTest {
     WebDriver driver;
    @BeforeAll
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.e-bebek.com/");
        driver.manage().window().maximize();
    }

    /*@BeforeEach
    public void afterMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }*/

    /*@AfterEach
    public void afterMethod(){
        driver.quit();
    }*/

   /* @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test Finished");
    }*/
}
