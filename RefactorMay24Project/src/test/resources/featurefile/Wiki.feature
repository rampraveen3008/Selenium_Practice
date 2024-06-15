Feature: Wiki Page Automation

  @Wiki01
  Scenario: validate the mapping of column one and two
    Given user extracts the column one value
    When user extracts the column two value
    Then validates the mapping

    @Wiki02
  Scenario: key to value pair validation
    Then user validates the key and value pair relation of Share holder and Share holdings