@hovers
Feature: Hovers Page
  In order to see the usernames
  I hover over the avatar pictures

  Background:
    Given I am on the Hovers page

  Scenario Outline: Hover avatars
    When I hover avatar <avatar_id>
    Then I observe the <user_name> username
    But I do not observe others usernames besides <user_name>

    When I click on the link view user under the avatar <avatar_id>
    Then I go to the user page <user_name> and i see the text <text>

    Examples:
      | avatar_id | user_name | text      |
      | 1         | user1     | Not Found |
      | 2         | user2     | Not Found |
      | 3         | user3     | Not Found |
