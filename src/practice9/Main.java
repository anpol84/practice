package practice9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inn.setInn("a", "123");
        Inn.setInn("rer", "134");
        System.out.println("Введите ФИО и инн:");
        try{
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            String inn = sc.next();
            Inn.checkInn(name, inn);
            System.out.println("Покупка совершена");
        }catch(IncorrectInn e) {
            System.out.println(e.getMessage());
        }
    }

}
