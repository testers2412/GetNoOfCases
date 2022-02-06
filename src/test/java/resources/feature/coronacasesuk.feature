Feature: Checking Total cases of corona virus in UK

  Scenario: As a user, I want to check total cases of covid for UK
    When I send the request to get the total number of covid cases for country "UK"
    Then I should verify the status code 200, request successful
    And I should extract the total number of corona cases for UK