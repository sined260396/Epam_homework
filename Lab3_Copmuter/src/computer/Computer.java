package computer;

public class Computer {
    private VideoCard videoCard;
    private Ram ram;
    private MotherBoard motherBoard;
    private Cpu cpu;
    private Hdd hdd;
    private PowerSupply powerSupply;
    public static boolean isOn;
    private final int block = 10;

    public Computer() {

    }

    public Computer(VideoCard videoCard, Ram ram, MotherBoard motherBoard, Cpu cpu, Hdd hdd, PowerSupply powerSupply) {
        this.videoCard = videoCard;
        this.ram = ram;
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.hdd = hdd;
        this.powerSupply = powerSupply;
    }

    public static void on(){
        if(isOn){
            System.out.println("Computer working");
        }else {
            System.out.println("Turn on");
            isOn = true;
        }
    }

    public static void off(){
        if(isOn) {
            System.out.println("Shut down");
            isOn = false;
        }else{
            System.out.println("Already shut down");
        }
    }

    public static void off(int second){
        if(isOn) {
            System.out.println("Shut down after: " + second + " second");
            isOn = false;
        }else{
            System.out.println("Already shut down");
        }
    }

    public static void printBlockCount(Object... args){
        System.out.println("Objects args: " + args.length);
    }

    public static void printBlockCount(Integer[] args){
        System.out.println("Integer[] args: " + args.length);
    }

    public static void printBlockCount(int... args){
        System.out.println("int args: " + args.length);
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\nVideoCard: " + videoCard +
                ", \nRam: " + ram +
                ", \nMotherBoard: " + motherBoard +
                ", \nCpu: " + cpu +
                ", \nHdd: " + hdd +
                ", \nPowerSupply: " + powerSupply +
                ", \nBlock: " + block;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}
