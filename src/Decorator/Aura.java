package Decorator;

public class Aura extends OptionDecorator {

    public Aura(Service service) {
        super(service, "Характеристка ауры", 1500);
    }
}
