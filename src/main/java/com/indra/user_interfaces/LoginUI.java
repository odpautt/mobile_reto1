package com.indra.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target USERNAME = Target.the("campo nombre usuario")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Usuario']"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target PASSWORD = Target.the("campo contraseña")
            .locatedForAndroid(By.xpath("//android.widget.EditText[@content-desc='test-Contrase\u00f1a']"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target LOGINBTN = Target.the("Boton login")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target STANDARD_USER = Target.the("WINDOW")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-standard_user']/android.widget.TextView");



}
