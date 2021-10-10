package starter.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileObject  extends PageObject {

    protected WebDriver driver;

    protected AndroidDriver androidDriver;

    protected WebDriverWait wait;

    public MobileObject(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(new AppiumFieldDecorator(((WebDriverFacade) getDriver()).getProxiedDriver(), this.getImplicitWaitTimeout()), this);
        wait = new WebDriverWait(driver, 60);

        this.driver = driver;
        this.androidDriver = (AndroidDriver)((WebDriverFacade) getDriver()).getProxiedDriver();
    }


}
