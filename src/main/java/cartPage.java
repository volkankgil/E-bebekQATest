import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends basePage {

    By finishShoppingButtonWebElement =new By.ByCssSelector("#btnGoToShippingAddress > span");

    public cartPage(WebDriver driver){
        super(driver);
        //driver.get(baseurl.concat("cart"));
    }
}
