import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class basePage {

    protected WebDriver driver;
    String baseurl="https://www.e-bebek.com/";

    public basePage(WebDriver driver){
        this.driver=driver;
    }

    public void addToProductCart(int i){

    }

    public void finishShopping(){

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

    public boolean isselected(By locator){
        return find(locator).isSelected();
    }

    public List<WebElement> findAll(By locator){
        return (List<WebElement>) driver.findElement(locator);
    }
}
