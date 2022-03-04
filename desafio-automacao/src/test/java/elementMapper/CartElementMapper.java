package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartElementMapper {
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement proceedToCheckoutSummary;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceedToCheckoutAdress;

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    public WebElement agreeTermsOfService;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement getProceedToCheckoutShipping;

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    public WebElement wire;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    public WebElement confirmMyOrder;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
    public WebElement orderComplete;


}
