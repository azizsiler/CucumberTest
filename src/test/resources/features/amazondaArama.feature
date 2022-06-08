Feature: Amazonda Arama

  @amazon
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir



    Scenario: TC02 kullanici amazonda java aratir
      Given kullanici amazon sayfasinda
      Then kullanici java icin arama yapar
      Then sonuclarin java icerdigini test eder
      And sayfayi kapatir