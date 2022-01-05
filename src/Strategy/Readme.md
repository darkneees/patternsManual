# Паттерн стратегия

Данный паттерн используется в тех случаях когда в достаточно похожих классах может различаться поведение.
В данном случае мы должны отделить поведение нашего класса от самого класса. Таким образом мы выносим поведение в отдельный класс
который будет реализовать также интерфейс этого поведения.

```

public interface FillStrategy {

   void fill();
}

```

Данный интерфейс требует от нас реализацию данного метода.


```
package Strategy;

public class StandardFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляем бензин!");
    }
}

class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензин или электричеством на выбор");
    }
}

class F1PitstopStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензин после всех процедур пит-стопа!");
    }
}
```

Здесь мы создаём стратегии поведения - для различных видов машин.
Далее дополняем родительских класс:
```

FillStrategy fillStrategy;

   public void fill() {
       fillStrategy.fill();
   }
   
```

Здесь мы указываем не конкретную реализацию, а именно интерфейс. В дочерних классах-автомобилях мы указываем конкретные
реализации интерфейса. Например при помощи конструкторов:

```

class Sedan extends Auto{

    public Sedan(){
        this.fillStrategy = new StandardFillStrategy();
    }
}
class Truck extends Auto{

    public Truck(){
        this.fillStrategy = new HybridFillStrategy();
    }

}
class F1Car extends Auto{

    public F1Car(){
        this.fillStrategy = new F1PitstopStrategy();
    }
}


```