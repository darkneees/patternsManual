package Decorator;

public class Main {

    public static void main(String[] args) {
        Service taro = new Divination("Tapo", 1000);
        Service chakra = new Chakra(taro);
        Service aura = new Aura(chakra);


        System.out.println(aura.getPrice());

        Service horoscope = new Horoscope("Персональный гороскоп", 1000);
        Service channeling = new Channeling(horoscope);
        Service avatar = new Avatar(channeling);

        System.out.println(avatar.getPrice());
    }
}
