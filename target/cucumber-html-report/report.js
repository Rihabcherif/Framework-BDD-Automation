$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("my_info/EditMyInfo.feature");
formatter.feature({
  "line": 2,
  "name": "Modifier mes informations- OrangeHRM",
  "description": "\nEn tant que utilisateur je souhaite modifier mes informations",
  "id": "modifier-mes-informations--orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@info"
    }
  ]
});
formatter.before({
  "duration": 2455550000,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisi le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisi le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Redirection vers la page Home de l\u0027application OrangeHRM \"Welcome\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Je clique sur le module My info",
  "keyword": "When "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3402244300,
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
  "duration": 87844800,
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
  "duration": 64920500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 5542003400,
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
  "duration": 1432415400,
  "status": "passed"
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeModuleMyInfo()"
});
formatter.result({
  "duration": 1426342400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Editer Custom Fields - OrangeHRM",
  "description": "",
  "id": "modifier-mes-informations--orangehrm;editer-custom-fields---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@info2"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Je clique sur le bouton Edit dans custom",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Je selectionne blood type \"A+\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Je clique sur le bouton save dans custom",
  "keyword": "And "
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeBoutonEditDansCustom()"
});
formatter.result({
  "duration": 62863400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A+",
      "offset": 27
    }
  ],
  "location": "MyInfoStepDefinition.jeSelectionneBloodType(String)"
});
formatter.result({
  "duration": 3164539500,
  "status": "passed"
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeBoutonSaveDansCustom()"
});
formatter.result({
  "duration": 56386500,
  "status": "passed"
});
formatter.after({
  "duration": 1360387000,
  "status": "passed"
});
});