import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Nowe numery telefonów
        Telephone Bartek = new Telephone("iPhone", 5.7,728866562);

        Telephone Krzysiek = new Telephone("Samsung", 6.2, 696002089);

        Telephone Karol = new Telephone("iPhone", 6.0, 622981089);

        System.out.println("Karol " + Karol.resolution + "' " + Karol.mark + " " + Karol.number);

        //Wysylanie wiadomosci za pomoca Scannera
        Krzysiek.sendSMSscanner();

        //Wysylanie wiadomosci
        Karol.sendSMS();
        Bartek.sendSMS();

        System.out.println();
        //Obiekty samochodow
        Car auto1 = new Car("black", "Ford", 3.6);
        Car auto2 = new Car("red", "Audi", 3.0);
        Car auto3 = new Car("white", "BMW", 4.0);
        Car auto4 = new Car("brown", "TESLA", 1.0);
        Car auto5 = new Car("grey", "ZUK", 1.5);

        auto1.getInfo();
        auto2.getInfo();
        auto3.getInfo();

        System.out.println();
        //Uzyskanie informacji o silniku
        auto1.getPower();
        auto4.getPower();
        auto5.getPower();
        auto3.getPower();

        System.out.println();
        //Zmiana pojemnosci silnika sposob 1
        auto1.getChange();
        auto3.getChange();
        System.out.println();
        //Zmiana pojemnosci silnika
        auto3.getChange2();
        auto1.getChange2();

    }

}
