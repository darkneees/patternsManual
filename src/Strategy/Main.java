package Strategy;

public class Main {

    public static void main(String[] args) {
        Auto sedan = new Sedan();
        Auto truck = new Truck();
        Auto f1car = new F1Car();

        sedan.fill();
        truck.fill();
        f1car.fill();
    }
}
