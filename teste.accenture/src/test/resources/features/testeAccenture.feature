#Author: joseluizeugenio@hotmail.com

@desafio
Feature: Validacao do site tricentis 
  Eu como usuario quero acessar o site de cotacao para realizar uma cotacao de seguros 
  
  Background: Acessar o site da tricentis 
  Given acessar o site da tricentis sampleapp "http://sampleapp.tricentis.com/101/app.php"

  
  Scenario: Cotacao de seguros 
    When preencher dados do veiculo 
    And preencher dados do seguro 
    And preencher dados do produto 
    And selecionar opcao pagamento
    And envio a cotacao 
    Then valido a mensagem de envio de e-mail com sucesso  

 