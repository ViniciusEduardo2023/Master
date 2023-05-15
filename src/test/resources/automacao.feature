
@tag
Feature: Abertura de conta 
  

  @tag1
  Scenario: Formulatio de abertura de conta PF
    Given que acesse o banco inter "https://www.bancointer.com.br/"
    And selecione o botao abra sua conta 
    When preencher o formulario 
    And selelecionar o botao checkebox
    And selecionar o botao continuar 
    Then sera exibido o textgo falta pouco 
    

  
