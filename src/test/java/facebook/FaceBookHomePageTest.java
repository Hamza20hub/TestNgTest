package facebook;

import base.CommonAPI;
import facebookLogin.FaceBookPageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookHomePageTest extends CommonAPI {
    public static FaceBookPageObject faceBookHome = null;

    @BeforeMethod
    public void init() {
        faceBookHome = PageFactory.initElements(driver, FaceBookPageObject.class);
    }

    @Test
    public void watchButtonTest() {
        clickOnElement("//a[@aria-label='Watch']/span[@class='l9j0dhe7']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/watch"));
    }

    @Test
    public void marketplaceButtonTest() {
        clickOnElement("//a[@aria-label='Marketplace']/span[@class='l9j0dhe7']");
        Assert.assertTrue(faceBookHome.marketPlaceBtnEnable());
    }

    @Test
    public void groupsBtnTest() {
        clickOnElement("//a[@aria-label='Groups']/span[@class='l9j0dhe7']");
        Assert.assertTrue(faceBookHome.groupBtnEnable());
    }

    @Test
    public void gamingBtnTest() {
        clickOnElement("//a[@aria-label='Groups']/span[@class='l9j0dhe7']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/gaming/feed/"));
    }

    @Test
    public void HomeBtnTest() {
        clickOnElement("//a[@aria-label='Groups']/span[@class='l9j0dhe7']");
        clickOnElement("//a[@aria-label='Home']/span[@class='l9j0dhe7']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com"));

    }

    @Test
    public void createStoryTest() {
        clickOnElement("//i[@class='hu5pjgll eb18blue']");
        upLoadFile("//div[@aria-label='Upload photo']//div[@class='kr520xx4 j9ispegn pmk7jnqg n7fi1qx3 i09qtzwb']//i", "Users/Document/Picture");
        clickOnElement("//div[@aria-label='Share to Story']//div//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com"));
    }

    @Test
    public void friendsLinkTest() {
        clickOnElement("//li//span[text()='Friends']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/friends"));
    }

    @Test
    public void homeLinkTest() {
        clickOnElement("//div//a[@aria-current='page']//div//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg']//div");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/"));
    }

    @Test
    public void memoriesLinkTest() {
        clickOnElement("//li//span[text()='Memories']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/memories"));
    }

    @Test
    public void savedLinkTest() {
        clickOnElement("//li//span[text()='Saved']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/saved"));
    }

    @Test
    public void groupsLinkTest() {
        clickOnElement("//li//span[text()='Groups']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/groups"));
    }

    @Test
    public void watchLinkTest() {
        clickOnElement("//li//span[text()='Watch']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/watch"));
    }

    @Test
    public void marketplaceLinkTest() {
        clickOnElement("//li//span[text()='Marketplace']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/marketplace"));
    }

    @Test
    public void userProfileBtnTest() {
        clickOnElement("//div[@class='fop5sh7t fv0vnmcu j83agx80']");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("https://www.facebook.com/anhar.uzzaman"));
    }

    @Test
    public void searchContactsTest() {
        clickOnElement("//div[@aria-label='Search by name or group']");
        typeByXpath("//input[@dir='ltr' and @aria-label='Search by name or group']", "Abdullah");
    }

    @Test
    public void optionTest() {
        clickOnElement("//div[ @aria-label='Options']");
        Assert.assertTrue(faceBookHome.isOptionEnable());
    }

    @Test
    public void logoBtnTest() {
        clickOnElement("//li//span[text()='Watch']");
        clickOnElement("//a[@aria-label='Facebook']");
        Assert.assertTrue(faceBookHome.logoIsEnable());
    }

    @Test
    public void editShortcutTest() {
        clickOnElement("//div[@aria-label='Edit Shortcuts']");
        Assert.assertTrue(faceBookHome.shortcutIsEnable());
    }
}
