$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buzz/Buzz.feature");
formatter.feature({
  "line": 2,
  "name": "Buzz - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier et ecrire mon nom dans le champs buzz",
  "id": "buzz---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@buzz"
    }
  ]
});
formatter.before({
  "duration": 3529949699,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Vérifier l\u0027authentification",
  "description": "",
  "id": "buzz---orangehrm;vérifier-l\u0027authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@authetification"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Je saisi le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Je saisi le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Redirection vers la page Home de l\u0027application OrangeHRM \"Welcome\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Je clique sur le buzz",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Je saisie mon nom dans le champs update status \"Rihab Cherif\"",
  "keyword": "And "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 2878745401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 22
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiLeUsername(String)"
});
formatter.result({
  "duration": 127491700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 26
    }
  ],
  "location": "AuthentificationStepDefinition.jeSaisiLeMotDePasse(String)"
});
formatter.result({
  "duration": 63906700,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 6138384099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 58
    }
  ],
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHomeDeLApplicationOrangeHRM(String)"
});
formatter.result({
  "duration": 33812800,
  "status": "passed"
});
formatter.match({
  "location": "ModuleBuzzStepDefinition.jeCliqueSurLeBuzz()"
});
formatter.result({
  "duration": 7785342700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rihab Cherif",
      "offset": 48
    }
  ],
  "location": "ModuleBuzzStepDefinition.jeSaisieMonNomDansLeChampsUpdateStatus(String)"
});
formatter.result({
  "duration": 77832800,
  "status": "passed"
});
formatter.after({
  "duration": 1355677700,
  "status": "passed"
});
});