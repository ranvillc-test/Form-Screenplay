Feature: form

  @formok
  Scenario Outline: send form
    Given the user <client> is in the home page
    When the user enters name <name> and email <email>
    Then the form <validate> send successfully

    Examples: 
      | client  | name   | email  							   | validate  |
      | Rafael  | Rafael  | rafael123@prueba.com   |Name:Rafael|
