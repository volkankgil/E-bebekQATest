import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productDetailedPage extends basePage {

    By yanakayd�rma =new By.ByCssSelector(".swiper-next");

    By buttonsLocatorocator =new By.ByCssSelector(".description ");

    By btnshowcard=By.id("btnShowCart");



    public productDetailedPage(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("hammm-6-tahilli-sutlu-keciboynuzlu-ve-hurmali-kasik-mamasi-200-gr-p-ham-1704"));
    }

    public boolean isOnproductdetailedPage() {
        return isdisplayed(yanakayd�rma);
    }

    public void addToProductCard(int i) {
        getALLbuttonselemet().get(i).click();
    }

    private List<WebElement> getALLbuttonselemet(){
        return findAll(buttonsLocatorocator);
    }

    public void sepetig�r() {
        click(btnshowcard);

    }

}

