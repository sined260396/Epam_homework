package lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
        Adress adressIvan = new Adress("Russia", "Samara", "Togliatty", "Topolinaya", 5, 43);
        Human ivan = new Human("Ivan", "Neplokhov", 20, adressIvan, Gender.MALE, Phone.SMART);
        Adress adressPetr = new Adress("Russia", "Samara", "Togliatty", "Moskovskaya", 5, 43);
        Human petr = new Human("Petr", "Ivanov", 22, adressPetr, Gender.MALE, Phone.HOME);
        Adress adressDen = new Adress("Russia", "Samara", "Togliatty", "70 years", 52, 5);
        Human den = new Human("Den", "Sinelnikov", 19, adressDen, Gender.MALE, Phone.BUTTON);

        Human human = (Human) den.clone();

        Human humans[] = {ivan, petr, den, human};

        sortByAdress(humans);
        sortByAge(humans);
        sortByNameAndLastName(humans);

        petr.getPhone().call(202010);
        ivan.getPhone().call(202010);
        den.getPhone().call(202010);


    }

    public static void sortByAge(Human[] humans){
        System.out.println("Sorted by age:");

        Arrays.sort(humans);
        for(Human human : humans){
            System.out.println(human);
        }
    }

    public static void sortByNameAndLastName(Human[] humans){
        System.out.println("Sorted by name and last name:");

        Arrays.sort(humans, new Comparator<Human>() {
            public int compare(Human humanFirst, Human humanSec) {
                return humanFirst.toString().compareTo(humanSec.toString());
            }
        });
        for(Human human : humans){
            System.out.println(human);
        }
    }

    public static void sortByAdress(Human[] humans){
        System.out.println("Sorted by Adress");

        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {

                String o1Adress = o1.getAdress().getCity() + o2.getAdress().getCity();
                String o2Adress = o1.getAdress().getStreet() + o2.getAdress().getStreet();
                String o3ddress = o1.getAdress().getStreet() + o2.getAdress().getNumberOfHouse();

                return o1Adress.compareTo(String.valueOf(o2Adress.compareTo(o3ddress)));
            }
        });
        for(Human human : humans){
            System.out.println(human);
        }
    }
}
