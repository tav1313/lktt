package lktt.po;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    private String baseUrl = "http://mail.ru"; // TODO: вынести как параметр в класс конфига запуска
    private String pageUrl;
    private boolean open = false;

    protected BasePage(String baseUrl, String pageUrl, boolean open) {
        // TODO: по-хорошему надо проверять значение baseUrl на null

        this.open = open;
        this.pageUrl = pageUrl;
        if (this.open) {
            navigate();
        }
    }

    protected void navigate() {
        open(this.baseUrl + this.pageUrl);
    }

    public String getBaseUrl() { return this.baseUrl; }
    public String getPageUrl() { return this.pageUrl; }
}
