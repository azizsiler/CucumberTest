Feature: US1011 web tablosundaki istenen sutunu yazdirma

  Scenario:

  http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
  Cucumber framework’de US1012_Guru_Web_Tables altinda
  Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli   olusturun ve                asagidaki testi yapin
    Given kullanici "guruUrl" anasayfasinda
    And “Istenen Baslik”, sutunundaki tum degerleri yazdirir