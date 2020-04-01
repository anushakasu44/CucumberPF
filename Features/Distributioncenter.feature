Feature: Verifying check of Distribution center site
 


  @e2e
  Scenario: DC site DStock verification check
    Given user launch the browser 
    And user enters <"dist1"> and <"Password@123"> and clicks on login button
    And user  clicks on DStock viewdetails
    And user logout from the site
