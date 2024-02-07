package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.XPATH,
            using = "//div[@class='catalog-toolbar-tabs__title' and text()='Товары']")
    private SelenideElement products;

    @FindBy(how = How.XPATH,
            using = "//a[@href='https://testqastudio.me?products_group=best_sellers']")
    private SelenideElement bestSellers;

    @FindBy(how = How.XPATH,
            using = "//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link' and contains(text(), 'ДИВВИНА Журнальный столик')]")
    private SelenideElement coffeeTable;

    @FindBy(how = How.XPATH,
            using = "//span[@class='sku' and text()='C0MSSDSUM7']")
    private SelenideElement C0MSSDSUM7;

    @Step("Клик по кнопке Товары")
    public void clickProductsButton(){
        products.click();
    }

    @Step("Клик по кнопке Бестселлеры")
    public void clickBestSellersButton() {
        bestSellers.click();
    }

    @Step("Клик по товару журнального столика ДИВВИНА")
    public void clickCoffeeTableButton(){
        coffeeTable.click();
    }

    @Step("Получение артикля журнального столика ДИВВИНА")
    public String getArticleDivvina(){
        return C0MSSDSUM7.getText();
    }
}
