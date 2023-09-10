Feature: Belly

	@regressiontest
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 10 hour
    Then my belly should growl
    
  @regressiontest
  Scenario: summation test
    Given I gave 50 as input
    When I give 20 as input
    Then my result will be 70
