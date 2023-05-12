# Процедура запуска автотестов:

## Запуск контейнеров

Через Docker (скачать при необходимости) для  MySQl, PostgerSQL и Node.js через терминал в IDE по команде:  
**docker-compose up**

## Запуск SUT:

По команде через терминал IDE:
- для БД MySQL: **java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar artifacts/aqa-shop.jar**
- для БД Postgres: **java "-Dspring.datasource.url=jdbc:postgresql://localhost:5433/app" -jar artifacts/aqa-shop.jar**

## Приложение запускается на порту 8080:
http://localhost:8080/

## Запуск тестов:

По команде через терминал IDE:
-  для БД MySQL: **./gradlew clean test "-Durl=jdbc:mysql://localhost:3306/app"**
-  для БД Postgres: **./gradlew clean test "-Durl=jdbc:postgresql://localhost:5433/app"**

## Запуск репортинга (Allure):

По команде в терминале IDE:
**./gradlew allureServe** (отчет откроется локально в браузере на локальном хосте 127.0.0.1:some_port)


## Завершение работы:

Закрыть сгенерированный Allure`ом отчет командой в термнале IDE:
**Ctrl+C**  (остановка локального хоста с отчетом Allure)

## Остановка контейнеров:

По команде в термнале IDE:
**docker-compose down**

## Документация:

- [План автоматизации](docs/Plan.md)
- [Отчет по итогам тестирования](docs/Report.md)
- [Отчет по итогам автоматизации](docs/Summary.md)


