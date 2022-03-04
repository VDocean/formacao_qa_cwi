package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver; // configurando as variaveis
    public static WebDriverWait wait;

    public static WebDriver getCurrentDriver(){
        if (driver==null){ //so abre um navegador por teste, portante antes de abrir a pagina este metodo
            //avalia se esta ja nao esta aberta

            try {
                ChromeOptions capability= new ChromeOptions();
                driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);// se o navegador ja
                wait= new WebDriverWait(driver, 120);// espera o comando ateh 30 segundos
                driver.manage().window().maximize();// maximiza a pagina
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);// espera a pagina carreagar ateh 30 segundos
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            //nao estiver aberto, crio um novo





        }
        return driver;
    }
    public static void close(){
        getCurrentDriver().quit();// metodo que fecha o navegador
        driver=null;
    }
    public static void loadPage(String url){
        getCurrentDriver().get(url);// metodo que carrega a url a qual vou trabalhar no navegador
    }
}
