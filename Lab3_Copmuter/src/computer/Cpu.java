package computer;

public class Cpu {
    private String name;
    private int numberOfCores;
    private int frequency;
    private boolean builtInVideoCard;

    public Cpu(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public Cpu(String name, int numberOfCores, int frequency, boolean builtInVideoCard) {
        this.name = name;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.builtInVideoCard = builtInVideoCard;
    }

    @Override
    public String toString() {
        return "Cpu: " +
                "name: '" + name + '\'' +
                ", numberOfCores: " + numberOfCores +
                ", frequency: " + frequency +
                ", builtInVideoCard: " + builtInVideoCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public boolean isBuiltInVideoCard() {
        return builtInVideoCard;
    }

    public void setBuiltInVideoCard(boolean builtInVideoCard) {
        this.builtInVideoCard = builtInVideoCard;
    }
}
