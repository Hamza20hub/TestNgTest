package facebook;

import base.CommonAPI;
import facebookLogin.FaceBookPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookProfilePageTest extends CommonAPI {
    public static FaceBookPageObject faceBookProfile = null;

    @BeforeMethod
    public void init() {
        faceBookProfile = PageFactory.initElements(driver, FaceBookPageObject.class);
    }

    @Test
    public void moreBtnTest() {
        clickOnElement("//div[@class='fop5sh7t fv0vnmcu j83agx80']");
        clickOnElement("//div[@aria-label='More']");
        Assert.assertTrue(faceBookProfile.profileBtnIsEnable());
    }

    @Test
    public void editProfile() {
        clickOnElement("//div[@aria-label='Edit Profile']");
        Assert.assertTrue(faceBookProfile.profileBtnIsEnable());
    }

    @Test
    public void editProfilePic() {
        clickOnElement("//div[@aria-label='Edit Profile']");
        clickOnElement("//div//div[@aria-label='Add Profile Picture']");
        upLoadFile("//div[@aria-label='Upload Photo']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']", "Users/anharuzzaman/Document/picture/");
    }

    @Test
    public void addFrameTest() {
        clickOnElement("//div[@aria-label='Edit Profile']");
        clickOnElement("//div//div[@aria-label='Add Profile Picture']");
        clickOnElement("//div[@aria-label='Add Frame']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']");
        Assert.assertTrue(faceBookProfile.addFrameBtnIsEnable());
    }

    @Test
    public void inputSearchForFrame() {
        clickOnElement("//div[@aria-label='Edit Profile']");
        clickOnElement("//div//div[@aria-label='Add Profile Picture']");
        clickOnElement("//div[@aria-label='Add Frame']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']");
        typeByXpath("//input[@aria-label='Search frames']", "Brazil");
        keysInput("//input[@aria-label='Search frames']");
        typeByXpath("//label[@aria-label='Description']", "Champion");
    }

    @Test
    public void editDetailTest() {
        clickOnElement("//div[@aria-label='Edit Details']");
        clickOnElement("//div[@aria-label='Cancel']");
        Assert.assertTrue(faceBookProfile.cancelBtnIsEnable());
    }

    @Test
    public void addHobbiesTest() {
        clickOnElement("//div[@aria-label='Add Hobbies']");
        Assert.assertTrue(faceBookProfile.hobbiesBtnIsEnable());
    }

    @Test
    public void addFeaturedBtnTest() {
        clickOnElement("//div[@aria-label='Add Featured']");
        Assert.assertTrue(faceBookProfile.addFeatIsEnable());
    }

    @Test
    public void newMessageBtnTest() {
        clickOnElement("//div[@aria-label='New Message']");
        Assert.assertTrue(faceBookProfile.newMessageEnable());
    }

    @Test
    public void menuBtn() {
        clickOnElement("//div[@class='bx45vsiw']//div[@aria-label='Menu']");
        Assert.assertTrue(faceBookProfile.menuBtnIsEnable());
    }

    @Test
    public void notificationBtnTest() {
        clickOnElement("//div[@aria-label='Notifications']");
        Assert.assertTrue(faceBookProfile.notificBtnIsEnable());
    }

    @Test
    public void accountBtnTest() {
        clickOnElement("//div[@aria-label='Account']");
        Assert.assertTrue(faceBookProfile.accountBtnEnable());
    }

    @Test
    public void logoutTest() {
        clickOnElement("//div[@aria-label='Account Controls and Settings']//div[@class='j83agx80 l9j0dhe7']//i");
        Assert.assertTrue(faceBookProfile.logoutIsEnable());
    }

}
