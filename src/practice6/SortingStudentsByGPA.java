package practice6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (st1.getMark() < st2.getMark()) return -1;
        else if (st1.getMark() == st2.getMark()) return 0;
        else return 1;
    }

    public void sortStudent(Student [] m, int begin, int end){
        if (m.length == 0) return;
        if (begin >= end) return;
        int mid = begin + (end-begin)/2;
        Student val = m[mid];
        int i = begin, j = end;
        while (i <= j){
            while(compare(m[i], val) == 1) i++;
            while (compare(m[j], val) == -1) j--;
            if (i <= j){
                Student temp = m[i];
                m[i] = m[j];
                m[j] = temp;
                i++;
                j--;
            }
        }
        if (begin < j){
            sortStudent(m, begin, j);
        }
        if (end > i){
            sortStudent(m, i, end);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] m = new Student[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++){
            int id = generator.nextInt(1000);
            String name = "smth" + generator.nextInt(1000);
            int mark = generator.nextInt(100);
            m[i] = new Student(id, name, mark);
        }
        SortingStudentsByGPA a = new SortingStudentsByGPA();
        a.sortStudent(m, 0, n-1);
        for(int i = 0; i < n; i++){
            System.out.println(m[i]);
        }
    }
}
