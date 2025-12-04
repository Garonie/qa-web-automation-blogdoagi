
# Testes Automatizados com Selenide e Cucumber - Blog do Agi

Este projeto realiza testes automatizados de interface gráfica utilizando Java, Selenide e Cucumber, tendo como alvo o site de demonstração https://blog.agibank.com.br/

## 🧪 O que é testado

O projeto cobre os componentes de busca e clicando no link Serviços:

- Pesquisa
- Link pesquisa

## 🔧 Tecnologias Utilizadas

- Java 11+
- Selenide
- Cucumber
- JUnit
- Maven

## 📁 Estrutura do Projeto

```
src
├── test
│   ├── java
│   │   ├── commons           # Configuração de browser e propriedades
│   │   ├── pageObjects       # Page Objects do site Blog do Agi
│   │   └── stepDefinitions   # Passos Gherkin definidos em Java
│   └── resources
│       ├── features          # Cenários de testes em Gherkin
│       └── config            # Configurações adicionais (se houver)
```

## 🚀 Como executar os testes

1. Clone este repositório:

```bash
git clone https://github.com/Garonie/qa-web-automation-blogdoagi.git
```

2. Execute os testes com Maven:

3. Entre na pasta do projeto:

```bash
mvn clean test
```

## 💡 Observações

- O projeto utiliza o padrão Page Object Model (POM) para garantir a manutenção e escalabilidade.
- Todos os cenários estão descritos em arquivos `.feature` seguindo a linguagem Gherkin.


## 💡 Possíveis cenários

- Com a automação de testes percebi esse cenários para serem feitos no futuro
        
        
1. Carregamento e Estabilidade da Página

Cenário: Página não carrega completamente ou demora mais de X segundos.
Objetivo: Garantir que o sistema exibe indicador de carregamento ou mensagem de erro.
Validação: Timeout configurado, fallback funcional.

Cenário: Elementos quebrados após carregamento parcial.
Objetivo: Verificar se todos os componentes essenciais (menu, botões, campos) estão visíveis e clicáveis.

2. Identificação dos Elementos

Cenário: Campos sem atributos únicos (id, name, data-testid).
Objetivo: Validar presença de identificadores para automação.
Validação: Inspecionar DOM e reportar ausência.

Cenário: Links com texto dinâmico ou truncado.
Objetivo: Garantir consistência do texto em diferentes resoluções (desktop, mobile).

3. Funcionalidade dos Links e Navegação

Cenário: Link “Serviços” não direciona corretamente.
Objetivo: Validar que o link leva à página esperada.
Validação: Comparar URL final com URL esperada.

Cenário: Links quebrados ou retornando erro 404.
Objetivo: Testar todos os links do menu e rodapé.

4. Comportamento Assíncrono

Cenário: Carregamento via JavaScript sem feedback.
Objetivo: Garantir que indicadores de loading aparecem e desaparecem corretamente.

Cenário: Pop-ups inesperados (cookies, promoções) bloqueando fluxo.
Objetivo: Validar que pop-ups não impedem interação com elementos principais.

5. Responsividade e Layout

Cenário: Layout desalinhado em diferentes resoluções.
Objetivo: Testar comportamento em desktop, tablet e mobile.

Cenário: Texto truncado ou botões sobrepostos.
Objetivo: Garantir acessibilidade e usabilidade.

6. Performance e Resiliência

Cenário: Testar comportamento com conexão lenta.
Objetivo: Garantir que o site continua funcional com baixa banda.


Cenário: Testar comportamento após falha parcial no carregamento.
Objetivo: Validar mensagens de erro amigáveis.


## 💡 Dificuldades encontradas

- Os campos não continham o ID
- Tela não carrega direito (instabilidade visual): Isso indica problemas de renderização ou tempo de resposta do servidor, causando falhas intermitentes nos testes.
        Impacto: testes quebram por NoSuchElementException ou TimeoutException.

- Ausência de IDs nos campos: Sem atributos únicos (id ou name), os locators ficam frágeis.
        Impacto: necessidade de usar XPaths complexos ou baseados em texto, aumentando risco de quebra quando o layout muda.

- Muitos bugs na interface: Elementos sobrepostos, links não clicáveis, ou scripts que não carregam.
        Impacto: testes precisam de esperas dinâmicas e tratamento de exceções.
