# Легковес (Приспособленец, Кэш, Flyweight)

Легковес — это структурный паттерн проектирования, который позволяет вместить бóльшее количество объектов в отведённую оперативную память. Легковес экономит память, разделяя общее состояние объектов между собой, вместо хранения одинаковых данных в каждом объекте.

## Применимость

### Когда не хватает оперативной памяти для поддержки всех нужных объектов.

Эффективность паттерна Легковес во многом зависит от того, как и где он используется. Применяйте этот паттерн, когда выполнены все перечисленные условия:

- в приложении используется большое число объектов;
- из-за этого высоки расходы оперативной памяти;
- большую часть состояния объектов можно вынести за пределы их классов;
- большие группы объектов можно заменить относительно небольшим количеством разделяемых объектов, поскольку
  внешнее состояние вынесено.

## Шаги реализации

1 Разделите поля класса, который станет легковесом, на две части:
- внутреннее состояние: значения этих полей одинаковы для большого числа объектов;
- внешнее состояние (контекст): значения полей уникальны для каждого объекта.

2 Оставьте поля внутреннего состояния в классе, но убедитесь, что их значения неизменяемы. Эти поля должны инициализироваться только через конструктор.

3 Превратите поля внешнего состояния в параметры методов, где эти поля использовались. Затем удалите поля из класса.

4 Создайте фабрику, которая будет кешировать и повторно отдавать уже созданные объекты. Клиент должен запрашивать из этой фабрики легковеса с определённым внутренним состоянием, а не создавать его напрямую.

5 Клиент должен хранить или вычислять значения внешнего состояния (контекст) и передавать его в методы объекта легковеса.

### Преимущества:
- Экономит оперативную память.

### Недостатки:
- Расходует процессорное время на поиск/вычисление контекста.
- Усложняет код программы из-за введения множества дополнительных классов.

## Источник
[Легковес](https://refactoring.guru/ru/design-patterns/flyweight)