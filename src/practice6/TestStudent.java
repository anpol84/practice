package practice6;

import java.util.Random;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] iDNumber = new Student[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++){
            int id = generator.nextInt(1000);
            String name = "smth" + generator.nextInt(1000);
            int mark = generator.nextInt(100);
            iDNumber[i] = new Student(id, name, mark);
        }
        for (int i = 0; i < n; i++){
            Student val = iDNumber[i];
            int j = i - 1;
            for(; j >= 0; j--){
                if (val.compareTo(iDNumber[j]) == -1){
                    iDNumber[j+1] = iDNumber[j];
                }else{
                    break;
                }
            }
            iDNumber[j+1] = val;
        }
        for (int i = 0; i < n; i++){
            System.out.println(iDNumber[i]);
        }
    }
}
