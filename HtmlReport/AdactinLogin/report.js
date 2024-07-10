$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Siva/eclipse-workspace/Cucumber/src/test/java/featurefile/TestRunner.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel using Adactin Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality",
  "description": "",
  "id": "booking-hotel-using-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the Adactin application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters a valid username in the Username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters a valid password in the Password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User navigates to the Search Hotel Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userLaunchesTheAdactinApplicationURL()"
});
formatter.result({
  "duration": 2541120200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.userEntersAValidUsernameInTheUsernameField()"
});
formatter.result({
  "duration": 989679200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d122.0.6261.95)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-04JH5G7\u0027, ip: \u0027192.168.43.242\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_391\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 122.0.6261.95, chrome: {chromedriverVersion: 122.0.6261.94 (880dbf29479c..., userDataDir: C:\\Users\\Siva\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:59583}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 320b247dc7f1c3ca8467d5e0bd491908\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.base.BaseClass_Cucumber.sendvalues(BaseClass_Cucumber.java:29)\r\n\tat com.stepDefinition.StepDefinition.userEntersAValidUsernameInTheUsernameField(StepDefinition.java:34)\r\n\tat ✽.When User enters a valid username in the Username field(C:/Users/Siva/eclipse-workspace/Cucumber/src/test/java/featurefile/TestRunner.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.userEntersAValidPasswordInThePasswordField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.userClicksTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.userNavigatesToTheSearchHotelPage()"
});
formatter.result({
  "status": "skipped"
});
});