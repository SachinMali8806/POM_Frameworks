$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/sachinLearnings/CucumberWorkspace/Cucumber/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "free crm login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "free crm login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Facebook – log in or sign up",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.User_Already_On_Login_Page()"
});
formatter.result({
  "duration": 46175718954,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Title_Of_The_Login_Page_Is_FacebookLoginOrSignUp()"
});
formatter.result({
  "duration": 9026989,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Enter_UserName_And_Password()"
});
formatter.result({
  "duration": 2360537817,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.Click_On_Login_Button()"
});
formatter.result({
  "duration": 149118177,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});