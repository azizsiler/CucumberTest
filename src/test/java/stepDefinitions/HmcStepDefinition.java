package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;

public class HmcStepDefinition {

    HmcPage hmcPage=new HmcPage();
    @Then("login yazisina tiklar")
    public void login_yazisina_tiklar() {
        hmcPage.loginButonu.click();

    }
    @Then("gecerli ussername girer")
    public void gecerli_ussername_girer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

    }
    @And("ikinci login yazisi tiklar")
    public void ikinciLoginYazisiTiklar() {
        hmcPage.loginButonu2.click();

    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {

        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));

    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz ussername girer")
    public void gecersizUssernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @Then("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmcPage.usernameKutusu.sendKeys(username);
    }



    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPage.passwordKutusu.sendKeys(password);
    }
}
