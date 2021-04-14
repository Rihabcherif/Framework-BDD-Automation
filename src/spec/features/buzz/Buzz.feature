@buzz
Feature: Buzz - OrangeHRM
En tant que utilisateur je souhaite m'authentifier et ecrire mon nom dans le champs buzz

   @authetification
   Scenario: Vérifier l'authentification
   
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username "Admin"
    And Je saisi le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"
    When Je clique sur le buzz
    And Je saisie mon nom dans le champs update status "Rihab Cherif"
