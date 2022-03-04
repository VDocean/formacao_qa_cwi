package testes;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

public class SetupTest extends BaseTest {
    @Test// anotacao que diz ao programa que eh um teste e tenho retorno se este passou ou nao
    public void testOpeningBrownserAndLoadingPage() {

        Assert.assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Pagina inicial validada!");
    }
    @Test
    public void testLogin(){
        HomePage home= new HomePage();
        LoginPage login= new LoginPage();
        home.clickBtnLogin();
        System.out.println("Cliquei no botao de login");
        login.fillEmail();
        login.fillPasswd();
        login.clickBtnSubmitLogin();
        System.out.println("Login Realizado!");
    }
    @Test
    public void clickTshirt(){
        testLogin();
        HomePage home= new HomePage();
        ProductPage category= new ProductPage();
        home.clickBtnCategoryTshirt();
        System.out.println("Clique na categoria Tshirt");
        Assert.assertTrue(category.isPageTshirt());
    }
    @Test
    public void testAddProductToProductPage(){
        clickTshirt();
        ProductPage pdp=new ProductPage();
        pdp.clickProductAddToProductPage();
        pdp.clickBtnAddToCart();
        pdp.clickBtnProceedToCheckout();
        Assert.assertTrue(pdp.isPriceRight());

    }
    @Test
    public void TestToConfirmCart(){
        testAddProductToProductPage();
        SummaryPageCart summary= new SummaryPageCart();
        AdressPageCart adress= new AdressPageCart();
        ShippingPageCart shipping= new ShippingPageCart();
        PaymentPageCart payment= new PaymentPageCart();

        summary.clickSummary();
        adress.clickAdress();
        shipping.clickShipping();
        payment.clickPayment();

     Assert.assertTrue(payment.isMyOrderComplete());

    }
}
