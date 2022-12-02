import org.openqa.selenium.WebDriver;

public class üyegiriþekraný extends basePage {

    public üyegiriþekraný(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("login?forced=true"));
    }
}
