package practice12_15;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Andrey", "Polyakov", "Maksimovich");
        System.out.println(p.getFullName());
        Person p2 = new Person("Andrey", "Polyakov", "");
        System.out.println(p2.getFullName());
    }
}
