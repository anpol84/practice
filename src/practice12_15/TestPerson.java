package practice12_15;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPerson {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String regex = "^ *[A-Z][a-z]+ {1,}[A-Z][a-z]+ {1,}[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            Person p = new Person(s);
            System.out.println(p);
        }else{
            System.out.println("Ошибка ввода");
        }
    }
}
