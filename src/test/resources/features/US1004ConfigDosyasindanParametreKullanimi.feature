Feature: US1004 Kullnici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "brcUrl" anasayfasinda
    Then kullnici 3 saniye bekler
    And url'nin "blue" icerdigini test eder
    Then sayfayi kapatir