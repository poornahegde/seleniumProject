$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/data_driven.feature");
formatter.feature({
  "name": "Data Driven",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "A valid Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "URL of web shop",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \u003cusername\u003e as \u003ctype\u003e username",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \u003cpassword\u003e as password",
  "keyword": "When "
});
formatter.step({
  "name": "User is in valid  page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "type"
      ]
    },
    {
      "cells": [
        "ask@gmail.com",
        "abc123",
        "guest"
      ]
    },
    {
      "cells": [
        "ask@ymail.com",
        "xyz345",
        "valid"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A valid Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "URL of web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumDataDriven.url_of_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ask@gmail.com as guest username",
  "keyword": "When "
});
formatter.match({
  "location": "CucumDataDriven.user_enters_ask_gmail_com_as_guest_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters abc123 as password",
  "keyword": "When "
});
formatter.match({
  "location": "CucumDataDriven.user_enters_abc_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid  page",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumDataDriven.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "A valid Login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "URL of web shop",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumDataDriven.url_of_web_shop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ask@ymail.com as valid username",
  "keyword": "When "
});
formatter.match({
  "location": "CucumDataDriven.user_enters_ask_gmail_com_as_guest_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters xyz345 as password",
  "keyword": "When "
});
formatter.match({
  "location": "CucumDataDriven.user_enters_abc_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in valid  page",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumDataDriven.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
});