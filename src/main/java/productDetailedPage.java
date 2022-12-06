import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productDetailedPage extends basePage {

    By btnshowcard=new By.ByCssSelector("#btnShowCart");

    public productDetailedPage(WebDriver driver){
        super(driver);
        //driver.get(baseurl.concat("hammm-6-tahilli-sutlu-keciboynuzlu-ve-hurmali-kasik-mamasi-200-gr-p-ham-1704"));
    }
    public void showcartmethod() {
        click(btnshowcard);
    }
}

