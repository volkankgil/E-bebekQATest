import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends basePage {

        private final By clickPassPromotion =new By.ByCssSelector("body > div.ins-custom-overlay-c2703 > div > div.ins-close-button-container-c2703 > img");
        private productsListPage productsListPage;
        private final By SearchingProductNamelocator =By.id("txtSearchBox");
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
