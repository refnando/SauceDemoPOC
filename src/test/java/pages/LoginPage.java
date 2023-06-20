package pages;

public class LoginPage extends BasePage{

    private String userNameField = "//input[@id='user-name']";
    private String passwordField = "//input[@id='password']";
    private String loginButton = "//input[@id='login-button']";

    public LoginPage(){
        super(driver);
    }

    public void navigateToLogin(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUser(String user){
        enterText(user);
    }

    public void clickLogin(){
        clickElement(loginButton);
    }
}
