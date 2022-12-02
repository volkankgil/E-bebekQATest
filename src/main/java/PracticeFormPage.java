import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends homePage {
        private final By name=By.id("firstName");
        private final By lastName=By.id("lastName");
        private final By email=By.id("userEmail");

        private gendersection gendersection;

        public PracticeFormPage(WebDriver driver){
            super(driver);
            driver.get(baseurl.concat("automation-practice-form"));
            gendersection =new gendersection(driver);
        }

    public gendersection gendersection() {
        return this.gendersection;
    }

    public void setName(String nameText){
            type(name,nameText);
        }

        public void setLastName(String lastNameText) {
            WebElement nameSpace=driver.findElement(lastName);
            nameSpace.click();
            nameSpace.sendKeys(lastNameText);
        }

         public void setEmail(String mailText) {
         WebElement nameSpace=driver.findElement(email);
         nameSpace.click();
         nameSpace.sendKeys(mailText);
    }

         public String getName(){
           return find(name).getAttribute("value");
         }

         public String getlastName(){
             WebElement lastnamespace=driver.findElement(lastName);
             return lastnamespace.getAttribute("value");

         }
    }
