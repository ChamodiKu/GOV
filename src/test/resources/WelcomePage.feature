Feature: User navigation localization
  Scenario Outline: User navigate to www.gov.lk with different languages
    Given User on the Welcome page of "https://www.gov.lk/welcome.html"
    When User click on <language>
    Then User should navigate to home page successfully with correct <language>
    Examples:
      | language |
      | sinhala  |
      | tamil    |
      | english  |