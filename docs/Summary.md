# Отчет по итогам автоматизации

## Запланировано для осуществления автоматизации:

- создание автоматизированных позитивных и негативных тестовых сценариев для проверки работы веб-сервиса онлайн оплаты
- создание автоматизированной проверки работы баз данных MySQL и PostgreSQL

## Выполнено по итогу:

- все тестовые сценарии реализованы

## Выявленные риски:

- сложность c подключением к порту 5432, так как он занят. Поэтому пришлось подключаться к БД PostgreSQL на порте 5433
- сложность в нахождении элементов на странице (локаторы для сообщений об ошибке под полями);
- сложность запуска тестов для разных БД (команды для запуска и безопасность хранения кредов);

Указанные выше риски привели к увеличению времени, затраченного на автоматизацию

## Затраченное время:

- Было запланировано затратить 96 часов. Сдача проекта - 10.05.2023
- Было затрачено 131 час. Сдача проекта (первая версия) - 13.05.2023
