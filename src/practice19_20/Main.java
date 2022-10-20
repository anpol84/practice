package practice19_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0 ; i < 1000000; i ++) {
            String s = Number.randGenerate();
            System.out.println(s);
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Number.SimpleSearch(s);
        s = sc.nextLine();
        Number.BinarySearch(s);
        s = sc.nextLine();
        Number.HashSearch(s);
        s = sc.nextLine();
        Number.TreeSearch(s);
    }
}
