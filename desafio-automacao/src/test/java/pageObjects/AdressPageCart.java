package pageObjects;

import elementMapper.CartElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class AdressPageCart extends CartElementMapper {
    public AdressPageCart(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void clickAdress(){
        proceedToCheckoutAdress.click();
    }
}
