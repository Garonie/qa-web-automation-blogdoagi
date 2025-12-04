package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class PesquisarPage {

    //ELEMENTOS
    SelenideElement botaoPesquisa = $(By.xpath("//a[contains(@class,'astra-search-icon') and @role='button']"));
    SelenideElement CampoPesquisa = $(By.xpath("//*[@id=\"search-field\"]"));
    SelenideElement resultado = $(By.xpath("//a[normalize-space(.)='Qual banco faz portabilidade com troco?']"));
    SelenideElement linkServicos = $(By.xpath("//a[contains(.,'Serviços')]"));




    public void clicarCampoBusca() {
        botaoPesquisa.click();
    }

    public void escreverNoCampoPesquisa(String useName) {
        CampoPesquisa.sendKeys(useName);
    }

    public void clicarBotaoPesquisar() {
        botaoPesquisa.click();
    }

    public void validarMsgResult(String text) {
        resultado.shouldBe(exactText(text));
    }

    public void clicarLinkServicos(){
        linkServicos.click();
    }
}