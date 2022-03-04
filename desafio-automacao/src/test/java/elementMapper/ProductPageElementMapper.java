package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {
    @FindBy(className = "cat-name")
    public WebElement nameCategoryTshirt;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    public WebElement productNameCategory;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")
    public WebElement  buttonMoreAddToProductPage;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"total_product\"]")
    public WebElement price;




}
