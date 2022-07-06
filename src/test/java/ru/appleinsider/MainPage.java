/**
 * appleinsider.ru - Home page
 */

package ru.appleinsider;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@placeholder='Поиск']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * The articles are searched and the enter button is pressed
     * @param searchString search string
     */
    public SearchPage search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }


}
