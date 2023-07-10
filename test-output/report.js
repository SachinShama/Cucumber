$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/orangeHRM.feature");
formatter.feature({
  "name": "OrangeHRM login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Click on dashboard options and save details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Dashboard"
    }
  ]
});
formatter.step({
  "name": "Chrome broswer is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.steps.chrome_broswer_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the orangeHRM URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.user_opens_the_orange_hrm_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide the username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.provide_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Dashboard Options",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.steps.user_clicks_on_Dashboard_Options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee Distribution by location should be fetched",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.steps.employee_Distribution_by_location_should_be_fetched()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\n\tat stepDefinition.steps.employee_Distribution_by_location_should_be_fetched(steps.java:64)\n\tat ✽.Employee Distribution by location should be fetched(file:///Users/tarun/eclipse-workspace/cucumber_test/./Features/orangeHRM.feature:43)\n",
  "status": "pending"
});
});