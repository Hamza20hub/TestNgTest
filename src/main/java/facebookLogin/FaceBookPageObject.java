package facebookLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FaceBookPageObject {
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//select[@name='birthday_month']")
    WebElement selectMonth;
    @FindBy(xpath = "//select[@name='birthday_day']")
    WebElement selectDay;
    @FindBy(xpath = "//select[@name='birthday_year']")
    WebElement selectYear;
    @FindBy(xpath = "//a[@aria-label='Marketplace']/span[@class='l9j0dhe7']")
    WebElement marketPlaceBtn;
    @FindBy(xpath = "//a[@aria-label='Groups']/span[@class='l9j0dhe7']")
    WebElement groupBtn;
    @FindBy(xpath = "//div[@class='fop5sh7t fv0vnmcu j83agx80']")
    WebElement profileBtn;
    @FindBy(xpath = "//div[@aria-label='Edit Profile']")
    WebElement profileEditBtn;
    @FindBy(xpath = "//div[@aria-label='Add Frame']//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']")
    WebElement addFrameBtn;
    @FindBy(xpath = "//div[@aria-label='Cancel']")
    WebElement cancelBtn;
    @FindBy(xpath = "//div[@aria-label='Add Hobbies']")
    WebElement addHobbBtn;
    @FindBy(xpath = "//div[@aria-label='Add Featured']")
    WebElement featuredBtn;
    @FindBy(xpath = "//div[@aria-label='New Message']")
    WebElement newMessageBtn;
    @FindBy(xpath = "//div[@class='bx45vsiw']//div[@aria-label='Menu']")
    WebElement menuBtn;
    @FindBy(xpath = "//div[@aria-label='Notifications']")
    WebElement notificationBtn;
    @FindBy(xpath = "//div[@aria-label='Account']")
    WebElement accountBtn;
    @FindBy(xpath = "//div[@aria-label='Account Controls and Settings']//div[@class='j83agx80 l9j0dhe7']//i")
    WebElement logOutBtn;
    @FindBy(xpath = "//div[ @aria-label='Options']")
    WebElement optionBtn;
    @FindBy(xpath = "//a[@aria-label='Facebook']")
    WebElement logoBtnFb;
    @FindBy(xpath = "//div[@aria-label='Edit Shortcuts']")
    WebElement shortcutBtn;

    public void monthDropDownSelect(String month) {
        selectMonth.click();
        Select select = new Select(selectMonth);
        select.selectByVisibleText(month);
    }

    public void dayDropDownSelect(String day) {
        selectDay.click();
        Select select = new Select(selectDay);
        select.selectByVisibleText(day);
    }

    public void yearDropDownSelect(int year) {
        selectYear.click();
        Select select = new Select(selectYear);
        select.selectByIndex(year);
    }

    public void fillEmptyField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void setMarketPlaceBtn() {
        marketPlaceBtn.click();
    }

    public boolean groupBtnEnable() {
        return groupBtn.isEnabled();
    }

    public boolean marketPlaceBtnEnable() {
        return marketPlaceBtn.isEnabled();
    }

    public boolean profileBtnIsEnable() {
        return profileBtn.isEnabled();
    }

    public boolean editProfileBtnEnable() {
        return profileBtn.isEnabled();
    }

    public boolean addFrameBtnIsEnable() {
        return addFrameBtn.isEnabled();
    }

    public boolean cancelBtnIsEnable() {
        return cancelBtn.isEnabled();
    }

    public boolean hobbiesBtnIsEnable() {
        return addHobbBtn.isEnabled();
    }

    public boolean addFeatIsEnable() {
        return featuredBtn.isEnabled();
    }

    public boolean newMessageEnable() {
        return newMessageBtn.isEnabled();
    }

    public boolean menuBtnIsEnable() {
        return menuBtn.isEnabled();
    }

    public boolean notificBtnIsEnable() {
        return notificationBtn.isEnabled();
    }

    public boolean accountBtnEnable() {
        return accountBtn.isEnabled();
    }

    public boolean logoutIsEnable() {
        return logOutBtn.isEnabled();
    }

    public boolean isOptionEnable() {
        return optionBtn.isEnabled();
    }

    public boolean logoIsEnable() {
        return logOutBtn.isEnabled();
    }

    public boolean shortcutIsEnable() {
        return shortcutBtn.isEnabled();
    }

}