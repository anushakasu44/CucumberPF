Feature: Verifying check of Cold Storage site
 

 @e2e
  Scenario: CS site farmingorders module verification check
    Given user launch the browser 
    And user enters <"cs"> and <"Password@123"> and clicks on login button
    When user clicks on farmingorders viewdetails
    And user logout from the site
    
 @e2e
  Scenario: CS site PCorders module verification check
    Given user launch the browser 
    And user enters <"cs"> and <"Password@123"> and clicks on login button
    When user  clicks on PCorders viewdetails
    And user logout from the site
    
 @e2e
  Scenario: CS site CAS Stock module verification check
    Given user launch the browser 
    And user enters <"cs"> and <"Password@123"> and clicks on login button
    When user  clicks on CAS Stock viewdetails
    And user logout from the site
    
    

