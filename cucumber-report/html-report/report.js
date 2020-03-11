$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Task2.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I need to edit a list",
  "description": "",
  "id": "as-a-user-i-need-to-edit-a-list",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "As a user I add a new person",
  "description": "",
  "id": "as-a-user-i-need-to-edit-a-list;as-a-user-i-add-a-new-person",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see new page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add  new name \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add new job title \"\u003cjob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I press add button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I redirect on main page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I see new \"\u003cname\u003e\" and new \"\u003cjob\u003e\" there",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I reset list button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I don\u0027t see new person",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "as-a-user-i-need-to-edit-a-list;as-a-user-i-add-a-new-person;",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ],
      "line": 19,
      "id": "as-a-user-i-need-to-edit-a-list;as-a-user-i-add-a-new-person;;1"
    },
    {
      "cells": [
        "Ivan",
        "driver"
      ],
      "line": 20,
      "id": "as-a-user-i-need-to-edit-a-list;as-a-user-i-add-a-new-person;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 34045005100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open the page",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskTwoSteps.openPage()"
});
formatter.result({
  "duration": 17051458200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "As a user I add a new person",
  "description": "",
  "id": "as-a-user-i-need-to-edit-a-list;as-a-user-i-add-a-new-person;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I press add person button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see new page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I add  new name \"Ivan\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add new job title \"driver\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I press add button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I redirect on main page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I see new \"Ivan\" and new \"driver\" there",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I reset list button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I don\u0027t see new person",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskTwoSteps.iPressAddPersonButton()"
});
formatter.result({
  "duration": 31515122300,
  "status": "passed"
});
formatter.match({
  "location": "TaskTwoSteps.iSeeNewPage()"
});
formatter.result({
  "duration": 26213300,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ithub.io/site/tasks/[enter_a_new_person_with_a_job].html\u003e but was:\u003c...ithub.io/site/tasks/[list_of_people_with_jobs].html\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.TaskTwoSteps.iSeeNewPage(TaskTwoSteps.java:38)\r\n\tat ✽.And I see new page(Task2.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ivan",
      "offset": 17
    }
  ],
  "location": "TaskTwoSteps.iAddNewName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "driver",
      "offset": 21
    }
  ],
  "location": "TaskTwoSteps.iAddNewJobTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskTwoSteps.iPressAddButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskTwoSteps.iRedirectOnMainPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ivan",
      "offset": 11
    },
    {
      "val": "driver",
      "offset": 26
    }
  ],
  "location": "TaskTwoSteps.iSeeNewAndNewThere(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskTwoSteps.iResetListButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaskTwoSteps.iSeePerson()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://uljanovs.github.io/site/tasks/list_of_people_with_jobs.html");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4819128900,
  "status": "passed"
});
});