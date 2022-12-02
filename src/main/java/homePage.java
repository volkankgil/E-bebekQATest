import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    protected WebDriver driver;
   /* String baseurl="https://demoqa.com/";*/
    String baseurl="https://www.e-bebek.com/";

    public homePage(WebDriver driver){
        this.driver=driver;
    }

    public void searchProduct(){

    }

    public void addToProductCart(){

    }

    public void showCart(){

    }

    public void finishShopping(){

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
}
