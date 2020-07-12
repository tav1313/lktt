package lktt.po;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {
    public LoginPage(boolean open) {
        super(null, "", open);
    }

    public MainListPage login(String userName, String password) {
        setUserName(userName);
        clickEnterPasswordBtn();
        setPassword(password);
        clickEnterBtn();

        // TODO: при первых логинах могут появляться различные всплывающие окна
        // надо обрабатывать и для новых и для старых логинов

        return new MainListPage(false);
    }

    private void setUserName(String name) {
        $(By.id("mailbox:login")).setValue(name);
    }

    private void clickEnterPasswordBtn() {
        $(By.xpath("//input[@class='o-control']")).click();
    }

    private void setPassword(String password) { $(By.id("mailbox:password")).setValue(password); }

    private void clickEnterBtn() { $(By.xpath("//input[@class='o-control']")).click(); }
}
