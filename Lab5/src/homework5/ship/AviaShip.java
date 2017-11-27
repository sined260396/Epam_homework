package homework5.ship;

public class AviaShip extends BattleShip {
    int planes;
    String[] namePlane;

    public AviaShip(int planes, String[] namePlane) {
        this.planes = planes;
        this.namePlane = namePlane;
    }

    public void inAir(AviaShip aviaShip, int i){
        System.out.println(aviaShip.getName() + ": plane " + namePlane[i] + " in the air");
    }

    public void allPlaneInAir(AviaShip aviaShip){
        System.out.println(aviaShip.getName() + ": all planes in the air");
    }

    @Override
    public void zalp() {
        System.out.println("Pli");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AviaShip){
            AviaShip aviaShip = (AviaShip) obj;
            if(aviaShip.getName().equals(name) && aviaShip.getWeight() == weight){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + super.name + ", " + "weight: " + super.weight + ", " + "count of ship: " + this.planes;
    }
}
