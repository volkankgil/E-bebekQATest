import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends basePage {

    By alýþveriþitamamlabutonu=By.id("btnGoToShippingAddress");

    public cartPage(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("cart"));

    }

    public void alýþveriþitamamla() {
        click(alýþveriþitamamlabutonu);

    }

    public boolean isoncardpage() {
        return isdisplayed(alýþveriþitamamlabutonu);
    }


}
