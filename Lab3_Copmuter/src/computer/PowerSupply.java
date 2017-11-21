package computer;

public class PowerSupply {
    private String name;
    private int power;
    private boolean cooler;

    public PowerSupply(String name, int powerl, boolean cooler) {
        this.name = name;
        this.power = powerl;
        this.cooler = cooler;
    }

    @Override
    public String toString() {
        return "PowerSupply: " +
                "name: " + name + '\'' +
                ", power: " + power +
                ", cooler: " + cooler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerl() {
        return power;
    }

    public void setPowerl(int powerl) {
        this.power = powerl;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }
}
