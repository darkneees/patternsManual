package Strategy;

public class Auto {

    FillStrategy fillStrategy;

    public void gas(){
        System.out.println("Едем вперёд");
    }

    public void stop(){
        System.out.println("Тормозим");
    }

    public void fill(){
        fillStrategy.fill();
    }
}

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

class ChildrenBuggies extends Auto{}
