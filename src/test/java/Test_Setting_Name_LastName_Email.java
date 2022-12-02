import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends baseTest{

        homePage homePage;
        productPage productPage;

        productDetailPage productDetailPage;
        @Test
        public void setName(){
            PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
            practiceFormPage.setName("volkan");
            Assertions.assertEquals("volkan",practiceFormPage.getName(),"Name value is not correct");
        }
        @Test
        public void setLastName () {
            PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
            practiceFormPage.setLastName("kebapcýgil");
            Assertions.assertEquals("kebapcýgil",practiceFormPage.getlastName(),"Last Name value is not correct");
        }
        @Test
        public void setEmail () {
            PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
            practiceFormPage.setEmail("volkankgil@gmail.com");
        }
}
