package practice2;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a = new Author("Ivanov", "smth@mail.ru", 'm');
        System.out.println(a);
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        a.setEmail("2smth@mail.ru");
        System.out.println(a.getEmail());
    }
}
