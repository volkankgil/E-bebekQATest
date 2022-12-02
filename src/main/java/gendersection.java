import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gendersection extends homePage {

    private final By maleRadioButton=new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleRadioButton=new By.ByCssSelector("label[for='gender-radio-2']");

    private final By maleradiobuttoncheck=By.id("gender-radio-1");
    private final By femaleradiobuttoncheck=By.id("gender-radio-2");


    public enum Genders {MALE,FEMALE}

    public gendersection(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void clickRadioButton(Genders gender){

        switch (gender){
            case MALE :
                click(maleRadioButton);
                break;

            case FEMALE:
                driver.findElement(femaleRadioButton).click();
                break;
        }
    }

    public boolean isRadioButtonChecked(Genders genders){
        boolean isChecked = false;
        switch (genders){

            case FEMALE :
                isChecked=isselected(femaleradiobuttoncheck);
                break;
            case MALE:
                isChecked=driver.findElement(maleradiobuttoncheck).isSelected();
                break;
        }
        return isChecked;
    }
}
