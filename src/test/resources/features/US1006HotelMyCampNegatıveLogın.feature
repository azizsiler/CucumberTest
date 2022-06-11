Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then  login yazisina tiklar
    And   gecerli ussername girer
    And   gecersiz password girer
    And   ikinci login yazisi tiklar
    Then  sayfaya giris yapilamadigini test eder
    And   sayfayi kapatir



  Scenario: TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then  login yazisina tiklar
    And   gecersiz ussername girer
    And   gecersiz password girer
    And   ikinci login yazisi tiklar
    Then  sayfaya giris yapilamadigini test eder
    And   sayfayi kapatir


  Scenario: TC10 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then  login yazisina tiklar
    And   gecersiz ussername girer
    And   gecersiz password girer
    And   ikinci login yazisi tiklar
    Then  sayfaya giris yapilamadigini test eder
    And   sayfayi kapatir