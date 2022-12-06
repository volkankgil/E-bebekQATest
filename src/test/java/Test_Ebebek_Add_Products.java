import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Test_Ebebek_Add_Products extends baseTest{

        basePage basePage;
        homePage homePageNavigationBar;
        productDetailedPage productDetailedPage;
        productsListPage productsListPage;
        cartPage cartPage;
        loginPage loginPage;
        private final By productSelectionOfWebElement =new By.ByCssSelector("body > app-root > cx-storefront > main > cx-page-layout > cx-page-slot.SearchResultsListSlot.has-components.ng-star-inserted > eb-product-list > div > section > div > div > div > div.cx-product-container.row.ng-star-inserted > eb-product-scroll > div > div > eb-product-list-item:nth-child(1) > div > eb-generic-link > a > figure > cx-media > img");
        private final By buttonOfCartWebElement = By.xpath("/html/body/app-root/cx-storefront/main/cx-page-layout/div/div/div[2]/cx-page-layout/cx-page-slot/eb-add-to-cart/form/button");
        private final By exitButton =new By.ByCssSelector("body > div.ins-custom-overlay-c2703 > div > div.ins-close-button-container-c2703 > img");

        private final By SearchingClickSpace =By.id("txtSearchBox");
        @Test
        @Order(1)
        public void setProductName(){
            homePageNavigationBar=new homePage(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            homePageNavigationBar.click(exitButton);
            homePageNavigationBar.click(SearchingClickSpace);
            homePageNavigationBar.setProductName("Kaþýk mamasý");
            Assertions.assertEquals("Kaþýk mamasý", homePageNavigationBar.getName(),"Searching value is correct");
            driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);
        }
        @Test
        @Order(2)
        public void select_product(){
            productDetailedPage=new productDetailedPage(driver);
            productsListPage=new productsListPage(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            productsListPage.click(productSelectionOfWebElement);
        }
        @Test
        @Order(3)
        public void addToCart(){
            productDetailedPage=new productDetailedPage(driver);
            productsListPage=new productsListPage(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            productDetailedPage.click(buttonOfCartWebElement);
        }
        @Test
        @Order(4)
        public void goToCart(){
            productDetailedPage.showcartmethod();
        }
        @Test
        @Order(5)
        public void completeShopping(){
            cartPage=new cartPage(driver);
            loginPage=new loginPage(driver);
            cartPage.click(cartPage.finishShoppingButtonWebElement);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Assertions.assertTrue(loginPage.isOnLoginPage(),"Not on card page!");
        }
}
