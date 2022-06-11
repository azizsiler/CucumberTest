
  Feature:

    Background: : kullanici amazon sayfasinda
      Given kullanici amazon sayfasinda

      Scenario:TC04 amazon nutella arama
        And kullanici Nutella icin arama yapar
        Then sonuclarin Nutella icerdigini test eder
        And sayfayi kapatir


        Scenario: TC05 amazon java arama
          And kullanici java icin arama yapar
          Then sonuclarin java icerdigini test eder
          And sayfayi kapatir