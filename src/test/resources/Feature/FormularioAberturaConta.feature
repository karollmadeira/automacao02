
@tag
Feature: Abertura de conta
 
  @tag1
  Scenario: Fluxo do formulario de abertura de conta pessoa fisica
Given que o usuario acesse a url "https://www.bancointer.com.br/"
And selecine o botao abra sua conta 
When o usuario preencher o formulario
And selecionar o botao autorizo os termos politicos
And selecionar o botao continuar 
Then valido o texto prontinho recebemos seus dados    