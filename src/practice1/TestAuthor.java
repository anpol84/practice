package practice1;

import java.sql.SQLOutput;

public class TestAuthor {
    public static void main(String[] args) {
        Book b = new Book ("Captains daughter", "Pushkin");
        System.out.println(b);
        String a = b.getAuthor();
        String c = b.getName();
        System.out.println(a);
        System.out.println(c);
        b.setAuthor("Gogol");
        b.setName("Dead souls");
        System.out.println(b);
    }
}
