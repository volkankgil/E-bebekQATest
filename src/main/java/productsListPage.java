import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productsListPage extends basePage {

    By productNameLocator=new By.ByCssSelector(".description ");

    public productsListPage(WebDriver driver){
        super(driver);
        driver.get(baseurl.concat("kasik-mamasi-c3882"));
    }

    public void selectProduct(int i) {
        getALLelement().get(i).click();
    }

    private List<WebElement> getALLelement(){
        return findAll(productNameLocator);
    }
}
