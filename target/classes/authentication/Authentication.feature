@connexion
Feature: Authentication - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Vérifier l'authentification
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username
    And Je saisi le mot de passe
    And Je clique sur le bouton Login
    Then Redirection vers la page Home de l'application OrangeHRM
  

  