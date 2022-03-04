package pageObjects;

import elementMapper.CartElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SummaryPageCart extends CartElementMapper {
    public SummaryPageCart(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void clickSummary(){
        proceedToCheckoutSummary.click();
    }
}
