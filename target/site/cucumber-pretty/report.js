$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/categories.feature");
formatter.feature({
  "line": 1,
  "name": "Categories.feature",
  "description": "\r\nAs a company user \r\nI want to be able to search for product categories\r\nSo that I can see the details of various products",
  "id": "categories.feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Search for a category",
  "description": "",
  "id": "categories.feature;search-for-a-category",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@categories"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am an existing user",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I call the category service with categoryId \u003cid\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can see the name \u003cname\u003e of the category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I can see the canRelist  \u003cCanRelist\u003e status of the product",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I can see a promotion element with promotionName \u003cpromotionname\u003e and Description \u003cdescription\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "categories.feature;search-for-a-category;",
  "rows": [
    {
      "cells": [
        "id",
        "name",
        "CanRelist",
        "promotionname",
        "description"
      ],
      "line": 17,
      "id": "categories.feature;search-for-a-category;;1"
    },
    {
      "cells": [
        "\"6327\"",
        "\"Carbon credits\"",
        "\"true\"",
        "\"Gallery\"",
        "\"2x larger image\""
      ],
      "line": 18,
      "id": "categories.feature;search-for-a-category;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Search for a category",
  "description": "",
  "id": "categories.feature;search-for-a-category;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@categories"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am an existing user",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I call the category service with categoryId \"6327\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can see the name \"Carbon credits\" of the category",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I can see the canRelist  \"true\" status of the product",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I can see a promotion element with promotionName \"Gallery\" and Description \"2x larger image\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CategoriesSteps.i_am_an_existing_user()"
});
formatter.result({
  "duration": 203776943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6327",
      "offset": 45
    }
  ],
  "location": "CategoriesSteps.i_call_the_category_service_with_categoryId(String)"
});
formatter.result({
  "duration": 2551542843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Carbon credits",
      "offset": 20
    }
  ],
  "location": "CategoriesSteps.i_can_see_the_name_of_the_category(String)"
});
formatter.result({
  "duration": 406530941,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "true",
      "offset": 26
    }
  ],
  "location": "CategoriesSteps.i_can_see_the_canRelist_status_of_the_product(String)"
});
formatter.result({
  "duration": 34144647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gallery",
      "offset": 50
    },
    {
      "val": "2x larger image",
      "offset": 76
    }
  ],
  "location": "CategoriesSteps.i_can_see_a_promotion_element_with_promotionName_and_Description(String,String)"
});
formatter.result({
  "duration": 26888237,
  "status": "passed"
});
});