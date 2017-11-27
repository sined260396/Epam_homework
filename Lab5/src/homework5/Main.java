package homework5;

import homework5.ship.*;
import homework5.vehicle.*;

public class Main {
    public static void main(String args[]){
        AviaShip aviaShip = new AviaShip(2, new String[]{"mi8", "a8"});
        aviaShip.setName("Igor");
        aviaShip.setWeight(5000);
        AviaShip aviaShip1 = new AviaShip(2, new String[]{"mi8", "a85"});
        aviaShip1.setName("Igoran");
        aviaShip1.setWeight(5000);

        System.out.println(aviaShip.equals(aviaShip1));
        aviaShip1.swim();
        aviaShip.zalp();
        aviaShip.allPlaneInAir(aviaShip);
        System.out.println("====================================");

        Tram tram = new Tram(20, 10, false, true);
        tram.setName("15");
        tram.setRoute("MSK - TLT");
        tram.setType(Type.TRAIN);
        System.out.println();
        tram.canISeat();
        tram.tramGo();
    }
}
