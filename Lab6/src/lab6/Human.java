package lab6;

/*1. Необходимо создать класс человека со следующими атрибутами: фио, возраст, адрес (отдельный класс, в должно быть в нем решайте сами).
 Для этого класса необходимо реализовать несколько видов сортировки, по фио, возрасту и адресу.
 Если кто забыл сортировать можно при помощи Arrays.sort(). И этот класс должен уметь клонировать себя.
 2. Так же необходимо сюда прикрутить перечисления, чтобы у всех не было одно и то же придумайте сами как можно применить их к нашему
  человеку, какой атрибут можно добавить.
  3. У человека может быть сотовый телефон, но ведь они бывают разные, кнопочные, смартфоны.
  Но у них у всех есть общая функция, звонить нужно сделать так, чтобы человек мог менять телефон, но все так же мог звонить с него.
  */

public class Human implements Cloneable, Comparable<Human>{
    private int age;
    private String name;
    private String lastName;
    private Adress adress;
    private Gender gender;
    private Phone phone;

    @Override
    public String toString() {
        return "Human:  " +
                "name : " + name +
                ", last name: " + lastName +
                ", adress: " + adress +
                ", age: " + age +
                ", gender: " + gender +
                ", phone: " + phone +
                '.';
    }

    public Human(String name, String lastName, int age, Adress adress, Gender gender, Phone phone) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
        this.gender = gender;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Human){
            Human human = (Human) obj;
            if(human.getName().equals(name) && human.getLastName().equals(lastName) && human.getAge() == age &&
                    human.getAdress().equals(adress) && human.getGender().equals(gender) && human.getPhone().equals(phone)){
                return true;
            }
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Human o) {
        return age - o.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
