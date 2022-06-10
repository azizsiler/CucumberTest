package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefn {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasinda")
    public void kullanici_amazon_sayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime="Nutella";
        String actualKelime=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("kullanici java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("java"+Keys.ENTER);
    }

    @Then("sonuclarin java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String arananKelime="java";
        String actualKelime=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }


    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime=istenenKelime;
        String actualKelime=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));

    }

    @And("kullanici {string}\" icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime){
        amazonPage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullnici {int} saniye bekler")
    public void kullniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
