package forjun.selenium.service;

import forjun.selenium.domain.selenium.SeleniumVO;
import forjun.selenium.domain.selenium.entity.SeleniumConnectionEntity;
import forjun.selenium.domain.selenium.entity.SeleniumConnectionId;
import forjun.selenium.domain.selenium.repo.SeleniumConnectionRepository;
import forjun.selenium.util.WebDriverFactory;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Ktx implements SeleniumInterface{

    private final WebDriverFactory webDriverFactory;
    private final SeleniumConnectionRepository connectionRepository;

    @Override
    public void LoginAction(String username, String password) {

        // Url 호출
        SeleniumConnectionId connectionId = new SeleniumConnectionId("ktx","login");

        SeleniumConnectionEntity entity =  connectionRepository.findByConnectionId(connectionId);

        SeleniumVO seleniumVO = new SeleniumVO(entity.getUrl());


        WebDriverFactory webDriverFactory = new WebDriverFactory();
        WebDriver driver = webDriverFactory.getDriver();


    }

    @Override
    public void reservationAction() {

    }
}
