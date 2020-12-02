@stories
  Feature: uTest
    As a user,I want to enter the uTest community to
    know the functionalities of the site

  @scenario1
  Scenario: Register in the uTest platform
    Given than Maria want to know the sities uTest

    When  entering the data from the uTest registration form
      | name    | last_name   | email |month_of_birth | day_birth | year_birth | operative_system | version_operative_system |language| password | password_confirmation |
      | juanita | gil| juanita045@gmail.com | April | 6     | 1992       | windows | 10 | English | Juanita.gil10225  | Juanita.gil10225 |
    Then  She Know the functionalities of the uTest

    | welcome |
    | Welcome to the world's largest community of freelance software testers!|