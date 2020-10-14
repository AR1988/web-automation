
package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * HoversPage
 * Class implements the hover methods and fields of the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoversPage extends BasePage {

    /* properties */

    public static final By USER_1 = By.xpath("//div/div[1]/div/h5");
    public static final By USER_2 = By.xpath("//div[2]/div/h5");
    public static final By USER_3 = By.xpath("//div[3]/div/h5");

    public static final By LINK_USER_1 = By.xpath("//div/div[1]/div/a");
    public static final By LINK_USER_2 = By.xpath("//div/div[2]/div/a");
    public static final By LINK_USER_3 = By.xpath("//div/div[3]/div/a");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public static By generateXpath(String index) {
        return By.xpath("(//img[@alt='User Avatar'])[" + index + "]");
    }

    public static By generateXpathViewLink(String avatarId) {
        return By.xpath("//div/div[" + avatarId + "]/div/a");
    }
}
