package practice8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> temp = new BoundedWaitList<>(3);
        temp.add("str1");
        temp.add("str2");
        temp.add("str3");
        System.out.println(temp);
        temp.add("str4");
        System.out.println(temp);
        UnfairWaitList<String> temp2 = new UnfairWaitList<>();
        temp2.add("str1");
        temp2.add("str2");
        temp2.add("str3");
        temp2.remove("str1");
        temp2.add("str4");
        System.out.println(temp2);
        temp2.moveToBack("str3");
        System.out.println(temp2);
    }
}
