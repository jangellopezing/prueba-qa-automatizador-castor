package com.castor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_INPUT = Target.the("Username input")
            .located(By.id("username"));

    public static final Target LOGIN_WITH_PASSWORD_BUTTON = Target.the("Login with password button")
            .located(By.xpath("//button[text()='Iniciar sesión con contraseña']"));

    public static final Target PASSWORD_INPUT = Target.the("Password input")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.cssSelector("[data-testid='login-button']"));

    public static final Target ERROR_MESSAGE_CONTAINER = Target.the("Error message container")
            .located(By.cssSelector("[data-encore-id='banner'][role='alert']"));
}
