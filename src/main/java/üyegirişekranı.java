import org.openqa.selenium.WebDriver;

public class üyegirişekranı extends basePage {

    public üyegirişekranı(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("login?forced=true"));
    }
}
