import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends basePage {

    By al��veri�itamamlabutonu=By.id("btnGoToShippingAddress");

    public cartPage(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("cart"));

    }

    public void al��veri�itamamla() {
        click(al��veri�itamamlabutonu);

    }

    public boolean isoncardpage() {
        return isdisplayed(al��veri�itamamlabutonu);
    }


}
