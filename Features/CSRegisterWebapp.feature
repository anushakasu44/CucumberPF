Feature: CS User trys to register in dfarm webapp
@e2e
Scenario: dFarm webapp registration

Given user launch the browser
And user clicks 'Create new Account'
When user selects Cold storage and clik next
And user adds all his details and click next
And user inputs user name and password and clik submit
And OTP will be send to user phone number
And dFarm will either approve or hold his aacount
    