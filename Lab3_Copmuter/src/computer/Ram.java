package computer;

public class Ram {
    private String name;
    private int gigabyte;
    private TypeOfRam typeOfRam;

    public Ram(String name, int gigabyte, TypeOfRam typeOfRam) {
        this.name = name;
        this.gigabyte = gigabyte;
        this.typeOfRam = typeOfRam;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ram: " +
                "name: " + name + '\'' +
                ", gigabyte: " + gigabyte +
                ", typeOfRam: " + typeOfRam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGigabyte() {
        return gigabyte;
    }

    public void setGigabyte(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    public TypeOfRam getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(TypeOfRam typeOfRam) {
        this.typeOfRam = typeOfRam;
    }
}
