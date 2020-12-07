@RegressionTest
Feature: Register Test

    Background:
    Given Navigate to Website
    And click Sign in button
    And  type email "omeroz@gmail.com"
    And click on Create an Account button

      Scenario: Kişi 1
        And type firstname "omer" and lastname "ozdemir"
        And type password "omer123"


        Scenario: Kisi 2
          And  type Company "techno study"
          And type address "Freiheitplatz 3"

          Scenario Outline: Kisi 3

            And type firstname "<isim>" and lastname "<soyisim>"
            And type password "<sifre>"
            And  type Company "<sirket>"
            And  type address "<adres>"
            Examples:
              | isim | soyisim | sifre | sirket | adres |
            |Mustafa|Ozdemir |1234   |Amazon  |limesStrasse|
            |Fatih  |Ozdemir | 4567  |Dell    |GoethePlatz 5|



