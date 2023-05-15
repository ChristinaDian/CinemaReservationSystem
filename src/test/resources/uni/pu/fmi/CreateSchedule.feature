Feature: Създаване на прожекция в кино

  Scenario Outline: Създаване на прожекция в кино
    Given Отваряме екрана за добавяне на нова прожекция
    When Избираме кино от списък: "<cinema>"
    And Избираме филм от списък: "<movie>"
    And Избираме старт на прожекцията: "<startTime>"
    And Избираме зала: "<hall>"
    And Натискаме бутона за създаване на нова прожекция
    Then Виждаме съобщение на екрана: "<expectedMessage>"
    Examples:
      | cinema     | movie     | startTime           | hall | expectedMessage               |
      | cinemaCity | SpiderMan | 16-05-2023 15:00:00 | VIP  | Успешно създадохте прожекция! |
      | Arena | SpiderMan | 16-05-2023 15:00:00 | VIP  | Избрали сте несъществуващо кино! |
      | cinemaCity | Avengers | 16-05-2023 15:00:00 | VIP  | Избрали сте несъществуващ филм! |
      | cinemaCity | SpiderMan | 17-05-2023 15:00:00 | VIP  | Залата е заета! |
      | cinemaCity | SpiderMan | 15-05-2023 15:00:00 | VIP  | Не може да изберете дата, която е минала! |
