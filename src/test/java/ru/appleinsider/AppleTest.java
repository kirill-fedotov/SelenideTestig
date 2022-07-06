package ru.appleinsider;//import org.junit.Assert;
//import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest {

    private final String BASE_URL = "https://appleinsider.ru/";
    private final String EXPECTED_WORD = "iphone-13";
    private final String SEARCH_STRING = "Чем IPhone 13 отличается от IPhone 12";

    @Test
    public void checkHref() {

        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }

}
