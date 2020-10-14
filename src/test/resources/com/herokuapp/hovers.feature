@hovers
Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

  Background:
    Given I am on the Hovers page

  Scenario Outline: Hover avatars
    When I hover avatar <avatar_id>
    Then I observe the <user_name> username
    Then If i observe the <user_name> ,i do not observe others username

    When I click on link view user <user_name> <avatar_id>
    Then I go to the user page <user_name> and see the text <text>

    Examples:
      | avatar_id | user_name | text      |
      | 1         | user1     | Not Found |
      | 2         | user2     | Not Found |
      | 3         | user3     | Not Found |
