#Autor: Jefferson Martinez
  @stories
  Feature: uTest
    As an user, I want to sing up to uTest

    @scenario1
    Scenario Outline: Sing up to www.utest.com
      Given that Jefferson wants to sign up to uTest
      When he clicks on the Join Today button
      And he introduces his personal data
        | strFirstName   | strLastName   | strEmailAddress   | strBirthMonth   | strBirthDay   | strBirthYear   | strUserLanguage   | strCity   | strZipPostalCode   | strCountry   | strComputerOs   | strOsVersion   | strComputerLanguage   | strMobileDevice   | strModel   | strMobileOs   | strPassword   |
        | <strFirstName> | <strLastName> | <strEmailAddress> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputerOs> | <strOsVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> | <strPassword> |
      Then the register is complete
        | strSuccessfulSignUpMessage                                              |
        | Welcome to the world's largest community of freelance software testers! |
      Examples:
        | strFirstName | strLastName | strEmailAddress         | strBirthMonth | strBirthDay | strBirthYear | strUserLanguage | strCity        |  strZipPostalCode | strCountry | strComputerOs | strOsVersion | strComputerLanguage | strMobileDevice | strModel                  | strMobileOs | strPassword   |
        | Jefferson    | Martinez    | jampandres98@gmail.com  | May           | 28          | 1998         | Spanish         | Villavicencio  |  500001           | Colombia   | Windows       | 10           | Spanish             | Xiaomi          | Mi 8 Lite (Youth/8X)      | Android 10  | Jeff123456@       |
