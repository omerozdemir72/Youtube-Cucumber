@RegressionTest

Feature: Contact Us Test

  Scenario: Go to website and test Contact us Page

    Given navigate to Website
    And click on contact us button
    And select Subject Heading
    And type Email
    And type Order reference "123"
    And type a message
    When click on send button
    Then verify success message
