# Паттерн Фабрика

Фабрика — это шаблон проектирования, который помогает решить проблему создания различных объектов в зависимости от некоторых условий. 

Рассмотрим паттерн на примере кофе. Мы собираем готовить разный кофе. Для создания нужного экземпляра кофе, мы пользуемся
switch-case и enum. Сравнивая значения мы создаём нужный экземпляр кофе. Для того чтобы при добавлении нового
вида кофе мы могли изменять минимальное количество кода, мы выносим блок отвечающий за создание кофе в отдельный класс.
Для этого мы создаём класс SimpleCoffeeFactory:
```
package Fabric;

public class SimpleCoffeeFactory {

    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
        }
        return coffee;
    }
}

```

Таким образом создание кофе за классом нашей кофейни, позволяет нам более не трогать этот класс. А если классов, где мы
создаём кофе 5, 10, 100? Без данного паттерна мы бы редактировали switch-case во всех классах, где создаётся кофе. С использованием
данного паттерна мы дополняем только код SimpleCoffeeFactory новым case.
