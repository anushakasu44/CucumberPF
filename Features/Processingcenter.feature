Feature: Verifying check of processing center site

 
    
    @e2e
  Scenario: PC site CACASStock verification check
    Given user launch the browser 
    And user enters <"pc"> and <"Password@123"> and clicks on login button
    And user  clicks on CACASStock viewdetails
    And user logout from the site
    