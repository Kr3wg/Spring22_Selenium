

Feature:Hotels.com S1
  Background:
    Given I am on Hotels Landing Page

    Scenario: TC-17 Verify past date and back button on Current month's calendar is disabled
      When I click check in button
      Then I verify that current month back button is disabled
      Then I verify that past dates are disabled
      And I click done button in calendar
      And I click check out button
      Then I verify that past dates are disabled
      Then I verify that current month back button is disabled



  Scenario: TC-18 Verify user can update number of guests on Home page
    When I click travelers button




  Scenario: TC-19 Verify Share feedback button is displayed at the end of search results
    When I enter bora in destination
    When I select Bora Bora from suggestion
    And I click check in button
    And I select 1 August 2022 as Check-in
    And I click done button in calendar
    And I click check out button
    And I select 10 August 2022 as checkout
    And I click done button in calendar
    When I click on search button
    Then I verify that the message tell us how we can improve is displayed
    Then I verify that share button is enabled






  Scenario: TC-20 Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
    When I click sign in link
    When I click sign up link
    And I click terms and conditions link
    And I verify terms and conditions page opens in new tab
    And I click privacy statements link
    And I verify privacy statement page opens in new tab



  Scenario: TC-21 Verify Verification message for invalid sign in credentials
    When I click sign in link
    When I click sign in button
    When I enter krshnik@gmail.com email address
    When I enter TechnoSoft* password
    And I click on sign in button
    Then I verify that the message is displayed


    Scenario: TC-24 Verify error is displayed when user submits the empty feedback form
      When I click sign in link
      When I click Feedback link
      And I click submit button










