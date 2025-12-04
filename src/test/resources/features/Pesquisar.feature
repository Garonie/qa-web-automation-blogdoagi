#language: pt
#encoding: UTF-8


@Pesquisar
Funcionalidade: Pesquisar

  Contexto:

    Dado que o usuário clicou no campo busca

  @ConfirmarBuscaBanco
  Cenario: Confirmar Busca por banco
    E o usuário informar o valor "Banco"
    Quando o usuário clicar no botão pesquisar
    Então o sistema deverá apresentar a tela com a mensagem "Qual banco faz portabilidade com troco?"

  @ConfirmarBuscaServiços
  Cenario: Confirmar Busca por serviços
    Quando o usuário clicar no link Serviços
    Então o sistema deverá apresentar a tela com a mensagem "Quanto custa um canal no dente? Guia completo de preços atualizados"