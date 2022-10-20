package practice19_20;

import java.util.*;

public class Number {
    private static final String symbols = "АВЕКМНОРСТУХ";
    private static ArrayList<String> arrayList = new ArrayList<>();
    private static HashSet<String> hashSet = new HashSet<>();

    private static TreeSet<String> treeSet = new TreeSet<>();
    public static String randGenerate(){
        StringBuilder result = new StringBuilder();
        result.append(symbols.charAt((int)(Math.random()*11)));
        result.append((int)(Math.random()*9));
        result.append((int)(Math.random()*9));
        result.append((int)(Math.random()*9));
        result.append(symbols.charAt((int)(Math.random()*11)));
        result.append(symbols.charAt((int)(Math.random()*11)));
        int region = (int)(Math.random()*199) + 1;
        if (region < 10) result.append(0);
        result.append(region);
        arrayList.add(result.toString());
        hashSet.add(result.toString());
        treeSet.add(result.toString());
        return result.toString();
    }
    public static void SimpleSearch(String result){
        boolean flag = true;
        long m = System.nanoTime();
        flag = arrayList.contains(result);
        double time = (double) (System.nanoTime() - m);
        String s;
        if (flag) s = "найден";
        else s = "не найден";
        System.out.println("Поиск перебором: номер " + s + ", поиск занял " + time +"нс");
    }

    public static void BinarySearch(String result){
        Collections.sort(arrayList);
        int flag;
        long m = System.nanoTime();
        flag = Collections.binarySearch(arrayList, result);
        double time = (double) (System.nanoTime() - m);
        String s;
        if (flag >= 0) s = "найден";
        else s = "не найден";
        System.out.println("Бинарный поиск: номер " + s + ", поиск занял " + time +"нс");
    }

    public static void HashSearch(String result){
        boolean flag = true;
        long m = System.nanoTime();
        flag = hashSet.contains(result);
        double time = (double) (System.nanoTime() - m);
        String s;
        if (flag) s = "найден";
        else s = "не найден";
        System.out.println("Поиск в HashSet: номер " + s + ", поиск занял " + time +"нс");
    }

    public static void TreeSearch(String result){
        boolean flag = true;
        long m = System.nanoTime();
        flag = treeSet.contains(result);
        double time = (double) (System.nanoTime() - m);
        String s;
        if (flag) s = "найден";
        else s = "не найден";
        System.out.println("Поиск в TreeSet: номер " + s + ", поиск занял " + time +"нс");
    }



}
