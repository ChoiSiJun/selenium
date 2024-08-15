package forjun.selenium.domain.selenium;

import lombok.Getter;

@Getter
public class SeleniumVO {

    private String url;

    public SeleniumVO(String url) {
        this.url = url;
    }

}
