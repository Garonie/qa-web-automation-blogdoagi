package stepsDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.PesquisarPage;

public class PesquisarSteps {

    PesquisarPage pesquisarPage = new PesquisarPage();

    @Dado("que o usuário clicou no campo busca")
    public void queOUsuarioclicouNoCampoBusca() {
        pesquisarPage.clicarCampoBusca();
    }

    @E("o usuário informar o valor {string}")
    public void oUsuarioInformarOValor(String campoPesquisa) {
        pesquisarPage.escreverNoCampoPesquisa(campoPesquisa);
    }

    @Quando("o usuário clicar no botão pesquisar")
    public void oUsuarioClicarNoBotaoPesquisar() {
        pesquisarPage.clicarBotaoPesquisar();

    }

    @Então("o sistema deverá apresentar a tela com a mensagem {string}")
    public void oSistemaDeveraApresentarATelaComAMensagem(String msg) {
        pesquisarPage.validarMsgResult(msg);
    }

    @Quando("o usuário clicar no link Serviços")
    public void oUsuarioClicarNoLinkServicos() {
        pesquisarPage.clicarLinkServicos();
    }
}