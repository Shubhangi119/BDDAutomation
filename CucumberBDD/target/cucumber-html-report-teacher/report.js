$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featuretest.feature");
formatter.feature({
  "name": "Gmail login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is able to login in gmail account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "I am on google website",
  "keyword": "Given "
});
formatter.match({
  "location": "qai.login_gmail_stepdefs.StepDef_login.opengmail() in file:/C:/MTS2/login-gmail/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the keyword to search",
  "keyword": "And "
});
formatter.match({
  "location": "qai.login_gmail_stepdefs.StepDef_login.enterkeyword() in file:/C:/MTS2/login-gmail/target/classes/"
});
formatter.result({
  "status": "passed"
});
});