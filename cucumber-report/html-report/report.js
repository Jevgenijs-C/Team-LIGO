$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Discount.feature");
formatter.feature({
  "line": 1,
  "name": "Discount price",
  "description": "As a user\r\nI want to see discount price on Product List, Product Page and Order Page",
  "id": "discount-price",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16368733600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on page",
  "rows": [
    {
      "cells": [
        "Desktops",
        "http://www.demoshop24.com/index.php?route\u003dproduct/category\u0026path\u003d20"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DiscountSteps.iAmOnPage(String,String\u003e)"
});
formatter.result({
  "duration": 2053681600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Discount check on Product List",
  "description": "",
  "id": "discount-price;discount-check-on-product-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@discount"
    },
    {
      "line": 9,
      "name": "@elementPresence"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I see discount price in Product info container for: \"Apple Cinema\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I see original price in Product info container for: \"Apple Cinema\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Cinema",
      "offset": 53
    }
  ],
  "location": "DiscountSteps.iSeeDiscount(String)"
});
formatter.result({
  "duration": 165945300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Cinema",
      "offset": 53
    }
  ],
  "location": "DiscountSteps.iSeeOriginalPrice(String)"
});
formatter.result({
  "duration": 194542600,
  "status": "passed"
});
formatter.after({
  "duration": 911594800,
  "status": "passed"
});
formatter.before({
  "duration": 16788001200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on page",
  "rows": [
    {
      "cells": [
        "Desktops",
        "http://www.demoshop24.com/index.php?route\u003dproduct/category\u0026path\u003d20"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DiscountSteps.iAmOnPage(String,String\u003e)"
});
formatter.result({
  "duration": 1292276200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Discount check on Product Page",
  "description": "",
  "id": "discount-price;discount-check-on-product-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@discount"
    },
    {
      "line": 14,
      "name": "@elementPresence"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on: \"Apple Cinema\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see discount price in info",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I see original price in info",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Cinema",
      "offset": 13
    }
  ],
  "location": "DiscountSteps.iClickOnAppleCinema(String)"
});
formatter.result({
  "duration": 10904901500,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iSeeDiscountProductPage()"
});
formatter.result({
  "duration": 50530800,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iSeeOriginalPriceProductPage()"
});
formatter.result({
  "duration": 86128300,
  "status": "passed"
});
formatter.after({
  "duration": 1129910900,
  "status": "passed"
});
formatter.before({
  "duration": 16059413600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on page",
  "rows": [
    {
      "cells": [
        "Desktops",
        "http://www.demoshop24.com/index.php?route\u003dproduct/category\u0026path\u003d20"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DiscountSteps.iAmOnPage(String,String\u003e)"
});
formatter.result({
  "duration": 2839327300,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Discount check on Shopping Cart Page",
  "description": "",
  "id": "discount-price;discount-check-on-shopping-cart-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@discount"
    },
    {
      "line": 20,
      "name": "@shoppingCart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I click on: \"Apple Cinema\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I choose options for product",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I go to",
  "rows": [
    {
      "cells": [
        "Shopping Cart",
        "http://www.demoshop24.com/index.php?route\u003dcheckout/cart"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I see price with discount: \"$147.20\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Cinema",
      "offset": 13
    }
  ],
  "location": "DiscountSteps.iClickOnAppleCinema(String)"
});
formatter.result({
  "duration": 10135473500,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iChooseOptionsForProduct()"
});
formatter.result({
  "duration": 10567647900,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iAddProductToPage()"
});
formatter.result({
  "duration": 136792900,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iGoToShoppingCart(String,String\u003e)"
});
formatter.result({
  "duration": 5514560400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$147.20",
      "offset": 28
    }
  ],
  "location": "DiscountSteps.iSeePriceWithDiscount(String)"
});
formatter.result({
  "duration": 45029600,
  "status": "passed"
});
formatter.after({
  "duration": 970344300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Discount Calculation",
  "description": "",
  "id": "discount-price;discount-calculation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@discount"
    },
    {
      "line": 29,
      "name": "@calculation"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I see discount for \"\u003cproduct\u003e\" is correct: \"\u003cprice with discount\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "discount-price;discount-calculation;",
  "rows": [
    {
      "cells": [
        "product",
        "price with discount"
      ],
      "line": 33,
      "id": "discount-price;discount-calculation;;1"
    },
    {
      "cells": [
        "Apple Cinema",
        "$110.00"
      ],
      "line": 34,
      "id": "discount-price;discount-calculation;;2"
    },
    {
      "cells": [
        "Canon EOS 5D",
        "$98.00"
      ],
      "line": 35,
      "id": "discount-price;discount-calculation;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14168318600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on page",
  "rows": [
    {
      "cells": [
        "Desktops",
        "http://www.demoshop24.com/index.php?route\u003dproduct/category\u0026path\u003d20"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DiscountSteps.iAmOnPage(String,String\u003e)"
});
formatter.result({
  "duration": 1498501600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Discount Calculation",
  "description": "",
  "id": "discount-price;discount-calculation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@discount"
    },
    {
      "line": 29,
      "name": "@calculation"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I see discount for \"Apple Cinema\" is correct: \"$110.00\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Cinema",
      "offset": 20
    },
    {
      "val": "$110.00",
      "offset": 47
    }
  ],
  "location": "DiscountSteps.iSeeDiscountIsCorrect(String,String)"
});
formatter.result({
  "duration": 577405000,
  "status": "passed"
});
formatter.after({
  "duration": 970277400,
  "status": "passed"
});
formatter.before({
  "duration": 14238509600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on page",
  "rows": [
    {
      "cells": [
        "Desktops",
        "http://www.demoshop24.com/index.php?route\u003dproduct/category\u0026path\u003d20"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DiscountSteps.iAmOnPage(String,String\u003e)"
});
formatter.result({
  "duration": 2608687800,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Discount Calculation",
  "description": "",
  "id": "discount-price;discount-calculation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@discount"
    },
    {
      "line": 29,
      "name": "@calculation"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I see discount for \"Canon EOS 5D\" is correct: \"$98.00\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Canon EOS 5D",
      "offset": 20
    },
    {
      "val": "$98.00",
      "offset": 47
    }
  ],
  "location": "DiscountSteps.iSeeDiscountIsCorrect(String,String)"
});
formatter.result({
  "duration": 194608500,
  "status": "passed"
});
formatter.after({
  "duration": 931758700,
  "status": "passed"
});
});