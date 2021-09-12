@googlesearch @firstRunner
Feature: Google search

  Background: User is on the google page
    Given user is in the google page
    #given her 2 senarioda da ortak oldugu icin background a yazdık

  @iphone @1
  Scenario: user searches iphone in google
    #Given user is in the google page
    And user searches iphone
    Then verify result has iphone 


  @nokia @1 @2
  Scenario: user searches nokia in google
    #Given user is in the google page
    And user searches nokia
    Then verify result has nokia