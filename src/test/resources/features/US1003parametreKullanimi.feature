Feature: US1003 kullanıcı parametre kullanarak arama yapabilmeli

  @parametre
  Scenario:
    Given kullanici amazon sayfasinda
    And kullanici "Nutella"" icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir