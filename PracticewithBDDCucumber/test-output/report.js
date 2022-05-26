$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Credentials",
  "description": "",
  "id": "login;successful-login-with-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User opens a URL \"http://localhost:8888/\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters Email as \"admin\" and password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});