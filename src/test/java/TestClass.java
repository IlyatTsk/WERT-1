import constants.Endpoints;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pom.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestClass extends BaseTest {

    @Test
    @DisplayName("Проверка артикула журнального столика ДИВВИНА")
    @Description("Данный тест сравнивает артикул журнального столика ДИВВИНА с требуемым артиклем")
    public void checkArticleDivvina() {
        MainPage mainPage = open(Endpoints.BASE_URL, MainPage.class);

        mainPage.clickBestSellersButton();
        mainPage.clickCoffeeTableButton();
        String article = mainPage.getArticleDivvina();

        String expectedArticle = "C0MSSDSUM7";

        assert article.equals(expectedArticle) : "Названия артиклей не совпадают";
    }
}
