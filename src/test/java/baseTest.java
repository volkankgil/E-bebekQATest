import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class baseTest {

    protected WebDriver driver;


    @BeforeAll
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //test initiated
        driver.get();
    }

    @BeforeEach
    public void afterMethod(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

   /* @AfterEach
    public void afterMethod(){
        driver.quit();
    }*/

   /* @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test Finished");
    }*/
}
