import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePage {

    WebDriver driver;
    String baseurl="https://www.e-bebek.com/";
    public basePage(WebDriver driver){
        this.driver=driver;
    }
   public boolean isdisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator,String text){
        find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
