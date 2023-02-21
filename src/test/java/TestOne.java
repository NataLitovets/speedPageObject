import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends TestInit{


    @Test
    public void testOne(){
SignInPage signInPage = new SignInPage(driver);
signInPage.navigate();
signInPage.getEmailField().sendKeys("afkdjfglsdkf");
signInPage.getPasswordField().sendKeys("asdkljfask");
signInPage.closeModal();
signInPage.getLoginBtn().click();
Assert.assertTrue(signInPage.getErorrMessage().isDisplayed());
    }


}
