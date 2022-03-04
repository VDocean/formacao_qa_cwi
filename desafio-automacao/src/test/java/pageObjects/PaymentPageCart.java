package pageObjects;

import elementMapper.CartElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class PaymentPageCart extends CartElementMapper {
    public PaymentPageCart(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void clickPayment(){
        wire.click();
        confirmMyOrder.click();
    }
    public String getNameOrderComplete(){
        return orderComplete.getText();
    }
    public boolean isMyOrderComplete(){
        return getNameOrderComplete().contains("Your order on My Store is complete.");
    }

}
