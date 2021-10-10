package starter.ElementDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.Utils.MobileObject;

import java.net.MalformedURLException;
import java.net.URL;

public class Login extends MobileObject {

    WebDriver driver;

    public Login(WebDriver driver){

        super(driver);
        this.driver = driver;

    }

    @AndroidFindBy(id="com.thecarousell.Carousell:id/login_button")
    private MobileElement BtnLogin;

    public void loadApp(){

        System.out.println("Reached this place !!!!!");
    }


}
