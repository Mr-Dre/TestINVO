$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/testINVO.feature");
formatter.feature({
  "line": 1,
  "name": "test INVO",
  "description": "",
  "id": "test-invo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Протестировать функционал сайта",
  "description": "",
  "id": "test-invo;протестировать-функционал-сайта",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Пользователь должен открыть сайт",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Пользователь должен нажать на кнопку try it for free",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Пользователь должен авторизоваться с этими данными",
  "rows": [
    {
      "cells": [
        "yourFullName",
        "userName",
        "eMail",
        "password",
        "repeatPassword"
      ],
      "line": 9
    },
    {
      "cells": [
        "testxc2",
        "demotest2",
        "hasorex962@meidir.com",
        "test12345",
        "test12345"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Пользователь доложен успешно зайти в систему",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Система запросила  вести логин и пароль пользователь должен вести эти даные",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Пользователь должен увидет  \"Your Invoices\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Пользователь должен зайти в раздел companies",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Должен увидеть в разделе companies \"Search companies\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Пользователь должен зайти в раздел products",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Должен увидеть в разделе products \"Search products\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Пользователь должен зайти в раздел Product Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Должен увидеть в разделе Product Type  \"Search product types\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Пользователь должен зайти в раздел Your profile",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Должен увидеть \"Your Full Name\"  \"Email Address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_открыть_сайт()"
});
formatter.result({
  "duration": 3042631800,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_Должен_Нажать_НаКнопку_TryItForFree()"
});
formatter.result({
  "duration": 485600500,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_авторизоваться_с_этими_данными(LoginDateINVO\u003e)"
});
formatter.result({
  "duration": 337147500,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_доложен_успешно_зайти_в_систему()"
});
formatter.result({
  "duration": 372317300,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.системаЗапросилаВестиЛогинИПарольПользовательДолженВестиЭтиДаные()"
});
formatter.result({
  "duration": 406853100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Invoices",
      "offset": 29
    }
  ],
  "location": "Test1Steps.пользователь_должен_увидет(String)"
});
formatter.result({
  "duration": 1438700,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_зайти_в_раздел_companies()"
});
formatter.result({
  "duration": 262972200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search companies",
      "offset": 36
    }
  ],
  "location": "Test1Steps.должен_Увидеть_В_Разделе_Companies(String)"
});
formatter.result({
  "duration": 76500,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_зайти_в_раздел_products()"
});
formatter.result({
  "duration": 290867100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search products",
      "offset": 35
    }
  ],
  "location": "Test1Steps.долженУвидетьВРазделеProducts(String)"
});
formatter.result({
  "duration": 50600,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_зайти_в_раздел_Product_Type()"
});
formatter.result({
  "duration": 265067700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search product types",
      "offset": 40
    }
  ],
  "location": "Test1Steps.долженУвидетьВРазделеProductType(String)"
});
formatter.result({
  "duration": 146600,
  "status": "passed"
});
formatter.match({
  "location": "Test1Steps.пользователь_должен_зайти_в_раздел_Your_profile()"
});
formatter.result({
  "duration": 272932700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Full Name",
      "offset": 16
    },
    {
      "val": "Email Address",
      "offset": 34
    }
  ],
  "location": "Test1Steps.должен_увидеть(String,String)"
});
formatter.result({
  "duration": 438100,
  "status": "passed"
});
});