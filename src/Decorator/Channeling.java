package Decorator;

public class Channeling extends OptionDecorator {
    public Channeling(Service service) {
        super(service, "Полёт в Поле чудес", 9999);
    }
}
