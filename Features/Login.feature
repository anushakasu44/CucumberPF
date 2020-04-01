Feature: login button validation
 
@e2et
  Scenario Outline: login with correct username and password
    Given user launche the browser
    When user enters "<username>" and "<password>"
    And user clicks on signin button
    Then "<user>" can able to login sucessfully
    And user logout from the site

    Examples: 
      |username | password      |user |
      |cs       | Password@123  |cs   |
      |pc1      | Password@123  |pc   |
      |dist1    | Password@123  |dc   |
      
      
      


