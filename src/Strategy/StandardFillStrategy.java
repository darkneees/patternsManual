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
