# Мост

Мост — это структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга.

Адаптер оборачивает один из объектов, так что другой объект даже не знает о наличии первого. Например, вы можете обернуть объект, работающий в метрах, адаптером, который бы конвертировал данные в футы.

Адаптеры могут не только переводить данные из одного формата в другой, но и помогать объектам с разными интерфейсами работать сообща. Это работает так:

1 Адаптер имеет интерфейс, который совместим с одним из объектов.
2 Поэтому этот объект может свободно вызывать методы адаптера.
3 Адаптер получает эти вызовы и перенаправляет их второму объекту, но уже в том формате и 4 последовательности, которые понятны второму объекту.

Иногда возможно создать даже двухсторонний адаптер, который работал бы в обе стороны.

## Применимость

###  Когда вы хотите разделить монолитный класс, который содержит несколько различных реализаций какой-то функциональности (например, если класс может работать с разными системами баз данных).

Чем больше класс, тем тяжелее разобраться в его коде, и тем больше это затягивает разработку. Кроме того, изменения, вносимые в одну из реализаций, приводят к редактированию всего класса, что может привести к внесению случайных ошибок в код.

Мост позволяет разделить монолитный класс на несколько отдельных иерархий. После этого вы можете менять их код независимо друг от друга. Это упрощает работу над кодом и уменьшает вероятность внесения ошибок.

### Когда класс нужно расширять в двух независимых плоскостях.

Мост предлагает выделить одну из таких плоскостей в отдельную иерархию классов, храня ссылку на один из её объектов в первоначальном классе.

### Когда вы хотите, чтобы реализацию можно было бы изменять во время выполнения программы.

Мост позволяет заменять реализацию даже во время выполнения программы, так как конкретная реализация не «вшита» в класс абстракции.

Кстати, из-за этого пункта Мост часто путают со Стратегией. Обратите внимание, что у Моста этот пункт стоит на последнем месте по значимости, поскольку его главная задача — структурная.

## Шаги реализации

1 Определите, существует ли в ваших классах два непересекающихся измерения. Это может быть функциональность/платформа, предметная-область/инфраструктура, фронт-энд/бэк-энд или интерфейс/реализация.

2 Продумайте, какие операции будут нужны клиентам, и опишите их в базовом классе абстракции.

3 Определите поведения, доступные на всех платформах, и выделите из них ту часть, которая нужна абстракции. На основании этого опишите общий интерфейс реализации.

4 Для каждой платформы создайте свой класс конкретной реализации. Все они должны следовать общему интерфейсу, который мы выделили перед этим.

5 Добавьте в класс абстракции ссылку на объект реализации. Реализуйте методы абстракции, делегируя основную работу связанному объекту реализации.

6 Если у вас есть несколько вариаций абстракции, создайте для каждой из них свой подкласс.

7 Клиент должен подать объект реализации в конструктор абстракции, чтобы связать их воедино. После этого он может свободно использовать объект абстракции, забыв о реализации.

##  Преимущества и недостатки

### Преимущества:
- Позволяет строить платформо-независимые программы.
- Скрывает лишние или опасные детали реализации от клиентского кода.
- Реализует принцип открытости/закрытости
### Недостатки:
- Усложняет код программы из-за введения дополнительных классов.
## Источник
[Мост](https://refactoring.guru/ru/design-patterns/bridge)