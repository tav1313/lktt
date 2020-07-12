package lktt.po;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainListPage extends BasePage {
    MainListPage(boolean open) {
        super(null, "", open);
    }

    public void sendLetter(String toAddress, String subject, String body) {
        $(By.cssSelector(".compose-button__txt")).click();

        $(By.xpath("//div[@data-type='to']")).$(By.tagName("input")).setValue(toAddress);
        $(By.name("Subject")).setValue(subject);
        $(By.xpath("//*[contains(@class, 'editable-container')]/div/div")).sendKeys(body);
        $(By.xpath("//*[text() = 'Отправить']")).click();
        //TODO: обработать случай не корректного адреса
        //TODO: закрывать окно нотификации об отправке если надо
    }
}
