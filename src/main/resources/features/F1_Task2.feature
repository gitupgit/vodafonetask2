@smoke
Feature: Task2 book seat on bus

  Scenario: client book a seat with valid data
   // Given navigate to website
    When  choose destination
    And   select arrival date
    And   click on search bus button
    And   select a seat
    Then  Choose the boarding point and dropping point
    And    Fill the “Customer” and “Passenger” details
    And    Click on seat
    And    enter passenger name as "soha"
    And    choose gender
    And    enter passenger Age as "22"
    And    select concession
    And   click Make Payment
   When   enter card number
   And    choose month
   And    choose Year
   And    Card Holder Name


   And  Card Holder Name