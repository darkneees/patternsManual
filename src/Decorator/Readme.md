# Паттерн Декоратор

Паттерн Декоратор динамически наделяет объект новыми возможностями и является альтернативой 
субклассированию в области расширения функциональности.

Например, мы предоставляем две услуги:
1. Гадание
2. Гороскоп

Для этого мы соотвественно реализуем интерфейс и сами услуги. Но тут мы захотелись обзавестись дополнительной функцией.

1. Мы можем создать дополнительные классы
2. Расширить родительский класс дочерним
3. Применить паттерн Декоратор

Мы создаём отдельный класс, Декоратор для отдельный опций:
```
public class OptionDecorator implements Service {

    private Service service;
    private String label;
    private double price;

    public OptionDecorator(Service service, String label, double price){
        this.service = service;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price + service.getPrice();
    }

    @Override
    public String getLabel() {
        return this.label + service.getLabel();
    }
}
```

Данный класс принимает в себя экземляр Service, таким образом на данном примере, применяя к классу какую-то опцию
мы складываем значения цены из самой опции с текущей услугой.
Для этого мы создадим отдельные дочерние классы от нашего декоратора:

```
public class Aura extends OptionDecorator {
    public Aura(Service service) {
        super(service, "Характеристика ауры", 1500);
    }
}

public class Chakra extends OptionDecorator {
    public Chakra(Service service) {
        super(service, "Характеристика чакр", 500);
    }
}
```

При этом данные опции можно применять также и к гороскопу, и к другим новым созданным услугам(Классам).

Данный паттерн позволяет нам добавлять объектам новые поведения на лету.