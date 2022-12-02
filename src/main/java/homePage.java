import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage {
        private final By SearchingProductNamelocator =By.id("txtSearchBox");

        private productsListPage productsListPage;

        public homePage(WebDriver driver){
            super(driver);
            productsListPage =new productsListPage(driver);
        }

    public productsListPage productsListPage() {
        return this.productsListPage;
    }

    public void setProductName(String nameText){
            type(SearchingProductNamelocator,nameText);
        }

         public String getName(){
           return find(SearchingProductNamelocator).getAttribute("value");
         }

    }
