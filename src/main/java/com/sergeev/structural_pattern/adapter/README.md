# Адаптер

Адаптер — это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.

Адаптер оборачивает один из объектов, так что другой объект даже не знает о наличии первого. Например, вы можете обернуть объект, работающий в метрах, адаптером, который бы конвертировал данные в футы.

Адаптеры могут не только переводить данные из одного формата в другой, но и помогать объектам с разными интерфейсами работать сообща. Это работает так:

1 Адаптер имеет интерфейс, который совместим с одним из объектов.
2 Поэтому этот объект может свободно вызывать методы адаптера.
3 Адаптер получает эти вызовы и перенаправляет их второму объекту, но уже в том формате и 4 последовательности, которые понятны второму объекту.

Иногда возможно создать даже двухсторонний адаптер, который работал бы в обе стороны.

## Применимость

###  Когда вы хотите использовать сторонний класс, но его интерфейс не соответствует остальному коду приложения.

Адаптер позволяет создать объект-прокладку, который будет превращать вызовы приложения в формат, понятный стороннему классу.

###  Когда вам нужно использовать несколько существующих подклассов, но в них не хватает какой-то общей функциональности, причём расширить суперкласс вы не можете.

Вы могли бы создать ещё один уровень подклассов и добавить в них недостающую функциональность. Но при этом придётся дублировать один и тот же код в обеих ветках подклассов.

Более элегантным решением было бы поместить недостающую функциональность в адаптер и приспособить его для работы с суперклассом. Такой адаптер сможет работать со всеми подклассами иерархии. Это решение будет сильно напоминать паттерн Декоратор.

## Шаги реализации

1 Убедитесь, что у вас есть два класса с несовместимыми интерфейсами:

- полезный сервис — служебный класс, который вы не можете изменять (он либо сторонний, либо от него зависит другой код);
- один или несколько клиентов — существующих классов приложения, несовместимых с сервисом из-за неудобного или несовпадающего интерфейса.

2 Опишите клиентский интерфейс, через который классы приложения смогли бы использовать класс сервиса.

3 Создайте класс адаптера, реализовав этот интерфейс.

4 Поместите в адаптер поле, которое будет хранить ссылку на объект сервиса. Обычно это поле заполняют объектом, переданным в конструктор адаптера. В случае простой адаптации этот объект можно передавать через параметры методов адаптера.

5 Реализуйте все методы клиентского интерфейса в адаптере. Адаптер должен делегировать основную работу сервису.

6 Приложение должно использовать адаптер только через клиентский интерфейс. Это позволит легко изменять и добавлять адаптеры в будущем.

##  Преимущества и недостатки

### Преимущества:
- Отделяет и скрывает от клиента подробности преобразования различных интерфейсов.
### Недостатки:
-  Усложняет код программы из-за введения дополнительных классов.
## Источник
[Адаптер](https://refactoring.guru/ru/design-patterns/adapter)