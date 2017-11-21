package computer;

public class Hdd {
    private String name;
    private TypeOfHdd typeOfHdd;
    private int amount;


    public Hdd(String name, TypeOfHdd typeOfHdd, int amount) {
        this.name = name;
        this.typeOfHdd = typeOfHdd;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Hdd: " +
                "name: " + name + '\'' +
                ", typeOfHdd: " + typeOfHdd +
                ", amount: " + amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfHdd getTypeOfHdd() {
        return typeOfHdd;
    }

    public void setTypeOfHdd(TypeOfHdd typeOfHdd) {
        this.typeOfHdd = typeOfHdd;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
