$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CartVisible.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I check that shopping cart is visible in all pages",
  "description": "",
  "id": "as-a-user-i-check-that-shopping-cart-is-visible-in-all-pages",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16311049100,
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
  "line": 5,
  "name": "I open a page",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoppingCartSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 2284037900,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "As a use I add an item which is marked as out of stock",
  "description": "",
  "id": "as-a-user-i-check-that-shopping-cart-is-visible-in-all-pages;as-a-use-i-add-an-item-which-is-marked-as-out-of-stock",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "I add item into the search field",
  "rows": [
    {
      "cells": [
        "item",
        "Samsung Galaxy Tab 10.1"
      ],
      "line": 42
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I move to the search page with item",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on exist element",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I go to the correct page",
  "rows": [
    {
      "cells": [
        "item",
        "Samsung Galaxy Tab 10.1"
      ],
      "line": 46
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I open a cart using right menu button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I see item marked as out of stock",
  "rows": [
    {
      "cells": [
        "item",
        "Samsung Galaxy Tab 10.1"
      ],
      "line": 50
    },
    {
      "cells": [
        "state",
        "***"
      ],
      "line": 51
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I see red color note that item out of stock with message \" Products marked with *** are not available in the desired quantity or not in stock\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartSteps.iAddItemIntoTheSearchField(String,String\u003e)"
});
formatter.result({
  "duration": 1093651100,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iMoveToTheSearchPageWithItem()"
});
formatter.result({
  "duration": 198194600,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickOnExistElement()"
});
formatter.result({
  "duration": 8716127300,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iGoToTheCorrectPage(String,String\u003e)"
});
formatter.result({
  "duration": 60003000,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iClickAddToCart()"
});
formatter.result({
  "duration": 128544900,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iOpenACartUsingRightMenuButton()"
});
formatter.result({
  "duration": 10807815800,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingCartSteps.iSeeItemMarkedAsOutOfStock(String,String\u003e)"
});
formatter.result({
  "duration": 99947200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Products marked with *** are not available in the desired quantity or not in stock",
      "offset": 58
    }
  ],
  "location": "ShoppingCartSteps.iSeeRedColorNoteThatItemOutOfStockWithMessage(String)"
});
formatter.result({
  "duration": 1129998200,
  "status": "passed"
});
formatter.after({
  "duration": 154600,
  "status": "passed"
});
});