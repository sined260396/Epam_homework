package computer;

public class MotherBoard {
    private String chipName;
    private TypeOfRam typeOfRam;
    private static int slotsRam;
    private int frequency;



    public MotherBoard(String chipName, TypeOfRam typeOfRam, int slotsRam, int frequency) {
        this.chipName = chipName;
        this.typeOfRam = typeOfRam;
        this.slotsRam = slotsRam;
        this.frequency = frequency;
    }

    public String getChipName() {
        return chipName;
    }

    @Override
    public String toString() {
        return "MotherBoard: " +
                "chipName: " + chipName + '\'' +
                ", typeOfRam: " + typeOfRam +
                ", slotsRam: " + slotsRam +
                ", frequency: " + frequency;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public TypeOfRam getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(TypeOfRam typeOfRam) {
        this.typeOfRam = typeOfRam;
    }

    public int getSlotsRam() {
        return slotsRam;
    }

    public void setSlotsRam(int slotsRam) {
        this.slotsRam = slotsRam;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
