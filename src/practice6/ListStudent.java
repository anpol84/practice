package practice6;

import java.util.Random;
import java.util.Scanner;

public class ListStudent {
    public static Student[] merge(Student[] st1, Student[] st2){
        Student[] res = new Student[st1.length + st2.length];
        int i = 0, j = 0, k = 0;
        while (i < st1.length && j < st2.length){
            if (st1[i].compareTo(st2[j])==-1){
                res[k++] = st1[i++];
            }
            else{
                res[k++] = st2[j++];
            }
        }
        while (i < st1.length){
            res[k++] = st1[i++];
        }
        while (j < st2.length){
            res[k++] = st2[j++];
        }
        return res;
    }
    public static Student[] sort(Student[] st){
        if (st.length == 1) return st;
        Student[] temp1 = new Student[st.length /2];
        for (int i = 0; i < st.length /2; i++){
            temp1[i] = st[i];
        }
        Student[] temp2 = new Student[st.length - st.length/2];
        for (int i = st.length /2; i < st.length; i++){
            temp2[i-st.length/2] = st[i];
        }
        temp1 = sort(temp1);
        temp2 = sort(temp2);
        return merge(temp1, temp2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Student[] m1 = new Student[n1];
        Random generator = new Random();
        for (int i = 0; i < n1; i++){
            int id = generator.nextInt(1000);
            String name = "smth" + generator.nextInt(1000);
            int mark = generator.nextInt(100);
            m1[i] = new Student(id, name, mark);
        }
        int n2 = sc.nextInt();
        Student[] m2 = new Student[n2];
        for (int i = 0; i < n2; i++){
            int id = generator.nextInt(1000);
            String name = "smth" + generator.nextInt(1000);
            int mark = generator.nextInt(100);
            m2[i] = new Student(id, name, mark);
        }
        Student[] m = merge(m1, m2);
        m = sort(m);
        for (int i = 0; i < n1+n2; i++){
            System.out.println(m[i]);
        }
    }
}
