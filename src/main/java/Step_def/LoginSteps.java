package Step_def;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    public static WebDriver driver;

    @Dado("^usuario entra na pagina do login$")
    public void usuario_entra_na_pagina_do_login() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para uma página
        navegador.manage().window().maximize();
        navegador.get("https://pt.crmpro.com");
    }
}
