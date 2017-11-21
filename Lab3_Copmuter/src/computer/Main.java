package computer;

public class Main {
    public static void main(String args[]){
        Cpu cpu = new Cpu("Intel", 4, 1200, false);
        Hdd hdd = new Hdd("Samsung", TypeOfHdd.SSD, 250);
        MotherBoard motherBoard = new MotherBoard("AMD", TypeOfRam.DDR3, 2, 1200);
        PowerSupply powerSupply = new PowerSupply("LG", 1000, true);
        Ram  ram = new Ram("AMD", 4, TypeOfRam.DDR3);
        VideoCard videoCard = new VideoCard("Geforce", 8);
        Computer computer = new Computer(videoCard, ram, motherBoard, cpu, hdd, powerSupply);
        // сделать все, что было в лекции
        computer.on();
        computer.on();
        computer.off();
        computer.off();
        computer.on();
        computer.off(5);
        computer.printBlockCount(new int[]{1, 2, 3});
        computer.printBlockCount(new Object[]{1, true, null, 5});
        System.out.println("\n" + computer.toString());
    }
}
