package starter.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.Pages.LoginPage;

public class Login_New {

    @Steps
    public LoginPage loginPage;

    @Managed(uniqueSession =  true)
    public WebDriver driver;

    @When("the user opens up the application")
    public void the_user_opens_up_the_application() {
        loginPage.openApplication();
    }

    @When("enters a valid username")
    public void enters_a_valid_username() {

    }

    @When("a valid password")
    public void a_valid_password() {

    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {

    }

    @Then("the system should redirect the user to the application home page")
    public void the_system_should_redirect_the_user_to_the_application_home_page() {

    }

}
