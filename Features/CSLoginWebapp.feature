Feature: CS User trys to login in dFarm web app


@e2e
Scenario: CS login

Given user launch the browser
And user enters <"cs"> and <"Password@123"> and clicks on login button
When user clicks on Farmer pending orders viewdetails
And user clicks on farmer accepted orders viewdetails
And user clicks on farmer completed orders viewdetails
And user clicks on rejected orders viewdetails
And accept orders and wait for produce


@e2e
Scenario: CS login farmer pending

Given user launch the browser
And user enters <"cs"> and <"Password@123"> and clicks on login button
When user clicks on Farmer pending orders viewdetails
And user logout from the site


@e2e
Scenario: CS login farmer accepted

Given user launch the browser
And user enters <"cs"> and <"Password@123"> and clicks on login button
When user clicks on Farmer pending orders viewdetails
And user clicks on farmer accepted orders viewdetails
And user logout from the site



@e2e 
Scenario: CS login farmer completed

Given user launch the browser
And user enters <"cs"> and <"Password@123"> and clicks on login button
When user clicks on Farmer pending orders viewdetails
And user clicks on farmer completed orders viewdetails
And user logout from the site