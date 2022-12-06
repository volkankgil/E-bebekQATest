import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends basePage{

    By loginOrSignUpButton= By.id("btnSubmitLogin");

    public loginPage(WebDriver driver){
        super(driver);
    }
    public boolean isOnLoginPage() {
        return isdisplayed(loginOrSignUpButton);
    }
}
