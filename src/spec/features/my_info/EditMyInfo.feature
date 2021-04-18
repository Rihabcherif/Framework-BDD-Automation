@info
Feature: Modifier mes informations- OrangeHRM
  
  En tant que utilisateur je souhaite modifier mes informations

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username "Admin"
    And Je saisi le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"
    When Je clique sur le module My info

  @info1
  Scenario: Editer personal details - OrangeHRM
    And Je clique sur le bouton Edit
    And Je saisis le champ Driver's License Number "MR1254"
    And Je saisis le champ SSN Number "1235"
    And Je clique sur le bouton save dans personal

  @info2
  Scenario: Editer Custom Fields - OrangeHRM
    And Je clique sur le bouton Edit dans custom
    And Je selectionne blood type "A+"
    And Je clique sur le bouton save dans custom

  @info3
  Scenario: Ajouter un fichier - OrangeHRM
    And Je clique sur le bouton Add file
    And Je clique sur choisir un fichier "C:\\Users\\rihab\\Desktop\\Formation Selenium\\test.jpg"
    And Je clique sur le bouton Upload
