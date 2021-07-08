package co.com.facebook.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FacebookLoginPage{
    public static final Target USER_EMAIL = Target.the("User Email").located(By.id("email"));
    public static final Target USER_PASS = Target.the("User Password").located(By.id("pass"));
    public static final Target BTN_LOGIN = Target.the("Click on Enter").located(By.xpath("//button[contains(@class, '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')]"));
}
