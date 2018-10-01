package step_definitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver;


    @Dado("^usuario entra na pagina do login$")
    public void usuario_entra_na_pagina_do_login()  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pt.crmpro.com");

    }

    @Quando("^usuario digitar usuaruio e senha$")
    public void usuario_digitar_usuaruio_e_senha() {

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Obtenha CRMPRO, software lír no mercado, e comece hoje.", title);
    }

    @Quando("^clicar no botão enviar$")
    public void clicar_no_botão_enviar() {
        driver.findElement(By.name("username")).sendKeys("marciod");
        driver.findElement(By.name("password")).sendKeys("051080");

    }

    @Entao("^entrara na pagina principal do site$")
    public void entrara_na_pagina_principal_do_site()  {
        WebElement LoginBtn = driver.findElement(By.xpath("//input[@value='Enviar']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", LoginBtn);

    }
}
