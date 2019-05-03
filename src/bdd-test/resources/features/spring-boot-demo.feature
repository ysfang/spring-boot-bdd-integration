Feature: Demonstration of Spring Boot BDD integration
In order to keep PM, RD, QE aligned to the feature delivery
As an RD or QE
Use Cucumber to verify feature(s) of this spring boot project

  Scenario: Verify the Hello service
    Given context is initialized
    When summon service "getHello"
    Then get result of "Hello"

  Scenario: Verify the Hello page
    Given context is initialized
    When browse the page "hello"
    Then see "Hello" on the page