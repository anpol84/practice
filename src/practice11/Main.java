package practice11;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> q = new LinkedQueue<>();
        System.out.println(q.isEmpty());
        q.add("1");
        q.add("2");
        q.add("3");
        System.out.println(q);
        String s1 = q.element();
        System.out.println(q);
        String s2 = q.remove();
        System.out.println(q);
        System.out.println(s1);
        System.out.println(s2);
    }
}
