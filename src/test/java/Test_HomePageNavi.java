import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Test_HomePageNavi extends baseTest{

        basePage basePage;
        homePage homePageNavigationBar;
        productDetailedPage productDetailedPage;
        productsListPage productsListPage;
        cartPage cartPage;
        üyegiriþekraný üyegiriþekraný;
        private final By SearchingClickSpace =By.id("txtSearchBox");
        private final By dad=new By.ByCssSelector("eb-generic-link.product-item-anchor a[href*=ari-12-vitaminli-6-mineralli-sutlu-pirinc-unu");

        @Test
        @Order(1)
        public void setProductName(){
            homePage homePageNavigationBar =new homePage(driver);
            homePageNavigationBar.click(SearchingClickSpace);
            homePageNavigationBar.setProductName("Kaþýk mamasý");
            Assertions.assertEquals("Kaþýk mamasý", homePageNavigationBar.getName(),"Searching value is correct");
            driver.findElement(By.id("txtSearchBox")).sendKeys(Keys.ENTER);

        }

        @Test
        @Order(2)
        public void select_product(){
            homePage homePage=new homePage(driver);
            productsListPage productsListPage1=new productsListPage(driver);
             productsListPage.selectProduct(1);
            Assertions.assertTrue(productDetailedPage.isOnproductdetailedPage(),"Not on Product Page");
        }

        @Test
        @Order(3)
        public void sepeteekle(){
            productDetailedPage productDetailedPage1=new productDetailedPage(driver);
            productDetailedPage.addToProductCart(1);

        }

        @Test
        @Order(4)
        public void goToCart(){
            productDetailedPage.sepetigör();
        }

        @Test
        @Order(5)
    public void sepetteiken(){
            cartPage cartPage1=new cartPage(driver);
            cartPage.alýþveriþitamamla();
            Assertions.assertTrue(cartPage.isoncardpage(),"nott on card page" );
        }
}
