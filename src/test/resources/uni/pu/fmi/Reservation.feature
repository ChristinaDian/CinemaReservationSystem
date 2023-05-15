Feature: Резервация на място в системата

  Scenario Outline: Резервация на място в системата
    Given Отваряме екрана за резервация на място в системата
    When Въвеждаме име: "<username>"
    And Избираме кино: "<cinema>"
    And Избираме филм: "<movie>"
    And Избираме начало на прожекцията: "<startTime>"
    And Сравняваме времето на регистрацията "<timeOfReservation>"
    And Избираме ред: <row>
    And Избираме място: <num>
    And Натискаме бутона за резервация
    Then Виждаме съобщение: "<expectedMessage>"
    Examples:
      | username | cinema     | movie     | startTime           | timeOfReservation   | row | num | expectedMessage                                                        |
      | krisi    | cinemaCity | SpiderMan | 15-05-2023 15:00:00 | 15-05-2023 13:00:00 | 5   | 8   | Успешно направихте резервация!                                         |
      | krisi    |            | SpiderMan | 15-05-2023 15:00:00 | 15-05-2023 13:00:00 | 5   | 8   | Не сте избрали кино!                                                   |
      | krisi    | cinemaCity |           | 15-05-2023 15:00:00 | 15-05-2023 13:00:00 | 5   | 8   | Не сте избрали филм!                                                   |
      | mimi     | cinemaCity | SpiderMan | 15-05-2023 15:00:00 | 15-05-2023 13:00:00 | 1   | 2   | Мястото е заето!                                                       |
      | krisi    | cinemaCity | SpiderMan | 15-05-2023 15:00:00 | 15-05-2023 14:30:00 | 5   | 8   | Резервацията трябва да е поне 60 минути преди началото на прожекцията! |

