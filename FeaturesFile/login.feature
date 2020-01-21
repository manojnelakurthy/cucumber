Feature: stock accounting login validation


Scenario: Application Login validation
  When Open Browser
  When Open Application
  When Wait For Username
  When Enter Username
  And Wait For password
  And Enter Password
  And Wait For Login
  When Click On Login
  When Wait For Logout
  When Click On Logout
  When Wait For Ok
  When Click On Ok
  When Close Browser 