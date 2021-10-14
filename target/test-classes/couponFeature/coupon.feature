Feature: sign up feature

  Background: Login the user
    Given User is on the Retail application
    When User enter the username and password
    And click on login button
    And User navigate to the Dashboard
    And click on button menu
    Then User click on Marketing

  Scenario Outline: Add functionality of coupon
    Given User click on coupons
    And User navigate to coupon Dashboard
    And Click on Add button
    And Enter the "<Coupon Name>","<Code>","<Discount>","<Total Amount>","<products>","<category>","<Date Start>","<Date End>","<Uses per coupon>","<Uses per Customer>",
    And User Select Type,Customer_Login,Free_shipping,Status
    And User click on save button
    And User CLick the displayed message
    Then user redirected to the coupons home page

    Examples: 
      | Coupon Name | Code    | Discount | Total Amount | products    | category  | Date Start | Date End   | Uses per coupon | Uses per Customer |
      | abcde98288@     | abcd$#1136 |       20 |         5000 | xyz123 | electonic | 2021-10-06 | 2021-11-06 |                 |                   |
Scenario Outline: Edit functionality of coupon
    Given User click on coupons
    And User navigate to coupon Dashboard
    And user click on checkbox
    And User Click on Edit button
    And User Edit the "<Coupon Name>","<Code>",
    And User clicks on save button
    And User CLick the displayed message on coupon dashboard
    Then User redirected to home page

    Examples: 
      | Coupon Name | Code  |
      | ab%qw       | ab@ad |

  Scenario: Edit History(bug)
    Given User click on coupons
    And User navigate to coupon Dashboard
    And User Click on Edit button on coupons page
    Then User go to edit history

  Scenario Outline: Cancel  functionality of coupon in Edit button
    Given User click on coupons
    And User navigate to coupon Dashboard
    And user click on checkbox on edit page
    And User Click on Edit button on the coupon page
    And User Edit the values of "<Coupon Name>","<Code>",
    And User click on cancel button in the coupon page
    Then User redirected to home page of coupon

    Examples: 
      | Coupon Name | Code     |
      | abab@123    | abcd#224 |

  Scenario: Delete the coupon
    Given User click on coupons
    And User navigate to coupon Dashboard
    And user click on one of the checkbox to delete the coupon
    And User click on delete button in the coupon page
    And User got alert pop-up message
    Then user get redirected to the homepage

  Scenario: user wants to check the sorting functionality
    Given User click on coupons
    And User navigate to coupon Dashboard
    And User want to sort the Coupon by "Coupon Name"
    Then User get redirected to the homepage

  Scenario Outline: Mails
    Given User click on Mails
    And User navigate to mail Dashboard
    And User Select From,To
    Then Enter "<subject>","<message>"
    And Click on Send button
    And user is able to click on displayed message on mail dashboard
    Then User navigtates to Home page

    Examples: 
      | subject                  | message |
      | Earn a Google Credential | hi      |

  Scenario Outline: verify cancel button
    Given User click on Mails
    And User navigate to Home Page
    And User Select From,To
    Then Enter "<subject>","<message>"
    And User click on cancel button
    Then User gets redirected to home page

    Examples: 
      | subject                  | message |
      | Earn a Google Credential | hello   |

  Scenario Outline: Send the Mail(bug)
    Given User click on Mails
    And User navigate to mail Dashboard
    And User Select From,To
    Then Enter "<subject>","<message>" in Mail page
    And Click on Send button on the Mail page
    And user is click on displayed message on mail dashboard
    Then User navigtates to Home page

    Examples: 
      | subject | message |
      |         |         |

  