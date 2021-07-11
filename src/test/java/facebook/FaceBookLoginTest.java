package facebook;

import base.CommonAPI;
import facebookLogin.FaceBookPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FaceBookLoginTest extends CommonAPI {
    public static FaceBookPageObject faceBook = null;

    @BeforeMethod
    public void init() {
        faceBook = PageFactory.initElements(driver, FaceBookPageObject.class);
    }

    @Test
    public void verifyUrl() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("facebook.com"));
        TestLogger.log(this.getClass().getSimpleName() + "  " + convertToString((new Object() {
        }).getClass().getEnclosingMethod().getName()) + "-> Search for " + currentUrl);
    }

    @Test
    public void signUpTest() {
        clickOnElement("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
        typeByXpath("//input[@name='firstname']", "Hamza");
        typeByXpath("//input[@name='lastname']", "Zaman");
        typeByXpath("//input[@name='reg_email__']", "bafia7900@gmail.com");
        typeByXpath("//input[@name='reg_passwd__']", "Belmont1@");
        clickOnElement("//select[@name='birthday_month']");
        faceBook.monthDropDownSelect("Apr");
        faceBook.dayDropDownSelect("7");
        faceBook.yearDropDownSelect(1970);
        clickOnElement("//input[@class='_8esa' and @value='1']");
        clickOnElement("//button[@name='websubmit']");
    }
    @Test
    public void loginTest(){
        typeByXpath("//input[@id='email']","anhar@yahoo.com");
        typeByXpath("//input[@id='pass']","1234");
        clickOnElement("//button[@name='login']");
        String currentUrl= driver.getCurrentUrl();
    }
}
