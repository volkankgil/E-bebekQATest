import org.junit.jupiter.api.Assertions;

public class test_gender_selection extends baseTest{

    @org.junit.jupiter.api.Test
    public void check_male_button(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.gendersection().clickRadioButton(gendersection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.gendersection().isRadioButtonChecked(gendersection.Genders.MALE),"male radio button is not checked");
    }

    @org.junit.jupiter.api.Test
    public void check_female_button(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.gendersection().clickRadioButton(gendersection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.gendersection().isRadioButtonChecked(gendersection.Genders.FEMALE),"female radio button is not checked");
    }
}
