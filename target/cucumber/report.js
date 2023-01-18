$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/CreationCompte.feature");
formatter.feature({
  "name": "Création de compte client",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@REQ_POEC4-4"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Valider la création de compte",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TEST_POEC4-89"
    },
    {
      "name": "@GR4_TNR"
    }
  ]
});
formatter.step({
  "name": "j ouvre l application practice.automationtesting",
  "keyword": "Given "
});
formatter.step({
  "name": "j accède la page My Account",
  "keyword": "When "
});
formatter.step({
  "name": "je saisis une adresse mail \"\u003cmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "je saisis un password \"\u003cPSW\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Je valide avec le bouton REGISTER",
  "keyword": "And "
});
formatter.step({
  "name": "J\u0027accède à la page my account",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mail",
        "PSW"
      ]
    },
    {
      "cells": [
        "groupe4proj@yopmail.com",
        "Sdqwo8s91!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valider la création de compte",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@REQ_POEC4-4"
    },
    {
      "name": "@TEST_POEC4-89"
    },
    {
      "name": "@GR4_TNR"
    }
  ]
});
formatter.step({
  "name": "j ouvre l application practice.automationtesting",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefsConnexion.jOuvreLApplicationPracticeAutomationtesting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "j accède la page My Account",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefsConnexion.jAccèdeLaPageMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis une adresse mail \"groupe4proj@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsCreationCompte.jeSaisisUneAdresseMail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "je saisis un password \"Sdqwo8s91!\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsCreationCompte.jeSaisisUnPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Je valide avec le bouton REGISTER",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefsCreationCompte.jeValideAvecLeBoutonREGISTER()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "J\u0027accède à la page my account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefsCreationCompte.jAccèdeÀLaPageMyAccount()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027https://practice.automationtesting.in/my-account/orders/\u0027]\"}\n  (Session info: chrome\u003d109.0.5414.75)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027FRP03403\u0027, ip: \u0027192.168.3.51\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.17\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 109.0.5414.75, chrome: {chromedriverVersion: 109.0.5414.74 (e7c5703604da..., userDataDir: C:\\Users\\FORMAT~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:6913}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8a42e5c2a5872130149e3d0180315b81\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027https://practice.automationtesting.in/my-account/orders/\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Steps.MyStepdefsCreationCompte.jAccèdeÀLaPageMyAccount(MyStepdefsCreationCompte.java:40)\r\n\tat ✽.J\u0027accède à la page my account(classpath:features/CreationCompte.feature:12)\r\n",
  "status": "failed"
});
});