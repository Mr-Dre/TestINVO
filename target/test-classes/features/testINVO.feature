Feature: test INVO


  @Regression
  Scenario:Протестировать функционал сайта
    Given Пользователь должен открыть сайт
    And Пользователь должен нажать на кнопку try it for free
    When Пользователь должен авторизоваться с этими данными
      | yourFullName | userName | eMail                | password  | repeatPassword |
      | testxc2     | demotest2 | hasorex962@meidir.com | test12345 | test12345      |
    And Пользователь доложен успешно зайти в систему
    And Система запросила  вести логин и пароль пользователь должен вести эти даные
    And Пользователь должен увидет  "Your Invoices"
    And Пользователь должен зайти в раздел companies
    And Должен увидеть в разделе companies "Search companies"
    And Пользователь должен зайти в раздел products
    And Должен увидеть в разделе products "Search products"
    And Пользователь должен зайти в раздел Product Type
    And Должен увидеть в разделе Product Type  "Search product types"
    And Пользователь должен зайти в раздел Your profile
    Then Должен увидеть "Your Full Name"  "Email Address"