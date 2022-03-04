package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement senha;

    @FindBy(id = "SubmitLogin")
    public WebElement SubmitLogin;

}
