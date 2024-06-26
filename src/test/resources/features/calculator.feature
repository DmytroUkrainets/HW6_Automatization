Feature: Calculator
  Scenario Outline: Addition
    Given I have a calculator
    When I add <a> and <b>
    Then the result should be <result>

    Examples:
      | a | b | result |
      | 1 | 2 | 3      |
      | 2 | 3 | 5      |
      | 3 | 5 | 8      |

  Scenario Outline: Subtraction
    Given I have a calculator
    When I subtract <b> from <a>
    Then the result should be <result>

    Examples:
      | a | b | result |
      | 4 | 2 | 2      |
      | 3 | 3 | 0      |
      | 1 | 5 | -4     |
