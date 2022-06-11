


Feature: US dogru kullanici adi ve sifre ile giris yapilabilmeli
  @wip
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then  login yazisina tiklar
    And   gecerli ussername girer
    And   gecerli password girer
    And   ikinci login yazisi tiklar
    Then  sayfaya giris yaptigini kontrol eder
    And   sayfayi kapatir

