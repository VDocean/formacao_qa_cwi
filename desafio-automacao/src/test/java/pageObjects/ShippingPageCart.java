package pageObjects;

import elementMapper.CartElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShippingPageCart extends CartElementMapper {
    public ShippingPageCart(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void clickShipping(){
        agreeTermsOfService.click();
        getProceedToCheckoutShipping.click();

    }
}
