package homework5.ship;

public abstract class BattleShip implements Ship{
    String name;
    int weight;

    void attack(BattleShip battleShip, BattleShip battleShip1){
        System.out.println(battleShip.getName() + " attack " + battleShip1.getName());
        if(battleShip.getWeight() > battleShip1.getWeight()){
            System.out.println(battleShip1.getName() + " defeat ");
        }
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract void zalp();

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BattleShip){
            BattleShip battleShip = (BattleShip) obj;
            if(battleShip.getName().equals(name) && battleShip.getWeight() == weight){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", "+ "weight: " + weight;
    }
}

