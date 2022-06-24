


Feature:
  Background:
    Given I am on Hotels Landing Page
    #When I maximize window


   Scenario: TC-22 Verify error message for invalid data in SignUp form
     When I click sign in link
     And I click sign up link
     When I enter kreshnik*@technosoft@gmail.com email address in sign up page
     And I enter Kr!*2@ first name in sign up page
     Then I verify that message Enter a valid email address is displayed in sign up page
     And I enter %*& last name in sign up page
     Then I verify that message First name cannot contain special characters is displayed in sign up page
     And I enter kreshnik@123 password in sign up page
     Then I verify that message Last name cannot contain special characters is displayed in sign up page
     Then I verify that keep me signed in box is enabled in sign up page
     Then I verify that text Keep me signed in is displayed
     Then I verify that continue button is displayed in sign up page
     Then I verify that continue button is not enabled in sign up page


    Scenario: TC-25 Verify User Can Submit Feedback After Completing The Feedback Form
      When I click sign in link
      And I click Feedback link
      And I switch to Feedback page
      And I click three star rating
      And I click comment box on feedback page
      And I type It vas a good experience being here on comment box on feedback page
      And I click on how likely are you to return on feedback page
      And I select somewhat likely on feedback page
      And I click yes in have you ever booked on hotels on feedback page
      And I click yes in did you accomplish what you wanted on feedback page
      And I click submit button on feedback page
      Then I verify that Thank you for your feedback is displayed





   Scenario: TC-23 Verify Filter_by And Sort_by Functionality Works As Expected
     When I click on destination search box
     When I enter Manhattan, NY in destination
     And I select Manhattan from suggestions
     And I click check in button on LP
     And I select 10 August 2022 as Check-in on LP
     And I select 15 August 2022 as Check-in on LP
     And I click done button in calendar
     And I click on search button
     And I click on five star on filter
     And I click on sort by box from search page
     And I click on price from select by dropdown on search page
     Then I verify that all the hotels are five star rated
     Then I verify that prices are in increasing order




   Scenario: TC-26 Verify Links On Deals Page
     When I click more travel link on landing page
     When I click deals link under more travel
     Then I verify that Manage Your Booking Anytime Anywhere is displayed
     Then I verify that Manage Your Booking Anytime Anywhere is enabled
     Then I verify that Stay Flexible With Free Cancellation is displayed
     Then I verify that Stay Flexible With Free Cancellation is enabled
     Then I verify that Save On Your Next Trip To The Great Outdoors is displayed
     Then I verify that Save On Your Next Trip To The Great Outdoors is enabled
     When I click Manage Your Booking Anytime Anywhere on deals page
     Then I verify that text Search Book And Save On The Go Is Displayed
     And I click back button
     When I click Stay Flexible With Free Cancellation on deals page
     Then I verify that text Amazing Deals With Free Cancellation Is Displayed
     And I click back button
     When I click Save On Your Next Trip To The Great Outdoors on deals page
     Then I verify that text Save On Your Next Trip To The Great Outdoors Is Displayed
