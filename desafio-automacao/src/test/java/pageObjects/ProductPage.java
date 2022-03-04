package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {
    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public String getAuthenticationPageTShirts(){
     return nameCategoryTshirt.getText();
    }
    public boolean isPageTshirt(){
        return getAuthenticationPageTShirts().contains("T-SHIRTS");

    }
    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();

    }
    public String getProductNameCategory(){
        return productNameCategory.getText();
    }
    public void clickBtnAddToCart(){
        addToCart.click();
    }
    public void clickBtnProceedToCheckout(){
        proceedToCheckout.click();
    }
    public String getPrice(){
        return price.getText();
    }
    public boolean isPriceRight(){
        return getPrice().contains("$16.51");
    }

}
