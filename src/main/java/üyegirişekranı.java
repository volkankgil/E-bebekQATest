import org.openqa.selenium.WebDriver;

public class �yegiri�ekran� extends basePage {

    public �yegiri�ekran�(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("login?forced=true"));
    }
}
