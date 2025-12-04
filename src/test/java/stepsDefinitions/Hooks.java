package stepsDefinitions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static utils.Utils.capturarScreenshot;

import com.codeborne.selenide.Selenide;
import commons.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    Browser browser = new Browser();

    @Before(order = 0, value = "@Pesquisar")
    public void setUpPesquisar() {
        Selenide.open("https://blog.agibank.com.br/");
    }

   @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        capturarScreenshot(scenario);
        closeWebDriver();
    }

//	@AfterStep
//	public void tearDownStep(Scenario scenario) throws InterruptedException {
//		capturarScreenshot(scenario);;
//	}
}
