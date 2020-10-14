package com.herokuapp.steps;

import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.*;
import static com.herokuapp.pages.UserPage.PAGE_TITLE;


/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps implements En {
    public HoverSteps() {

        When("I hover avatar {}", (String avatarIndex) -> $(generateXpath(avatarIndex)).hover());

        Then("I observe the {} username", (String username) -> {
            switch (username) {
                case "user1":
                    assert ($(USER_1).getText().contains(username));
                    break;
                case "user2":
                    assert ($(USER_2).getText().contains(username));
                    break;
                case "user3":
                    assert ($(USER_3).getText().contains(username));
                    break;
            }
//            if (username.equals("user1"))
//                assert ($(USER_1).getText().contains(username));
//            if (username.equals("user2"))
//                assert ($(USER_2).getText().contains(username));
//            if (username.equals("user3"))
//                assert ($(USER_3).getText().contains(username));
        });

        Then("I do not observe others usernames besides {}", (String userName) -> {
            if (userName.equals("user1")) {
                assert (!$(USER_2).isDisplayed());
                assert (!$(USER_3).isDisplayed());
            }
            if (userName.equals("user2")) {
                assert (!$(USER_1).isDisplayed());
                assert (!$(USER_3).isDisplayed());
            }
            if (userName.equals("user3")) {
                assert (!$(USER_1).isDisplayed());
                assert (!$(USER_2).isDisplayed());
            }
        });

        When("I click on the link view user under the avatar {}", (String avatarId) -> {
            $(generateXpath(avatarId)).hover();
            $(generateXpathViewLink(avatarId)).click();
        });

        Then("I go to the user page {} and i see the text {}", (String userName, String pageText) -> {
            assert ($(PAGE_TITLE).getText()).equals(pageText);
        });
    }
}
