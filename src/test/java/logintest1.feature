@RegressionTest

Feature: Login Test

  Scenario: Go to amazon website and test login page

    Given Amazon sitesine git
    And login butonuna tıkla
    And isim gir
    And sifre gir
    When submit butonuna tıkladıgımda
    Then success mesajini verify et
