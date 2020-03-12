$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Discount.feature");
formatter.feature({
  "line": 1,
  "name": "Discount price",
  "description": "As a user\r\nI want to see discount",
  "id": "discount-price",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15761570400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Discount check on Shopping Cart Page",
  "description": "",
  "id": "discount-price;discount-check-on-shopping-cart-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on Desktops page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click on Apple Cinema",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I choose options for product",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I go to Shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I see price with discount",
  "keyword": "Then "
});
formatter.match({
  "location": "DiscountSteps.iAmOnDesktopsPage()"
});
formatter.result({
  "duration": 1957473300,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iClickOnAppleCinema()"
});
formatter.result({
  "duration": 10608863200,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iChooseOptionsForProduct()"
});
formatter.result({
  "duration": 1210847100,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iAddProductToShoppingCart()"
});
formatter.result({
  "duration": 140453800,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iGoToShoppingCart()"
});
formatter.result({
  "duration": 458741400,
  "status": "passed"
});
formatter.match({
  "location": "DiscountSteps.iSeePriceWithDiscount()"
});
formatter.result({
  "duration": 95848100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"content\"]/form/div/table/tbody/tr/td[5]\"}\n  (Session info: chrome\u003d80.0.3987.132)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LVAGPLTP1065\u0027, ip: \u0027192.168.8.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\IANINA~1.SPI\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 80.0.3987.132, webStorageEnabled: true}\nSession ID: 7109f26bdb98c04993035db932456105\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"content\"]/form/div/table/tbody/tr/td[5]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat stepDefinitions.DiscountSteps.iSeePriceWithDiscount(DiscountSteps.java:71)\r\n\tat ✽.Then I see price with discount(Discount.feature:21)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is http://www.demoshop24.com/index.php?route\u003dcheckout/cart");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1451324600,
  "status": "passed"
});
});