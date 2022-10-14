package practice12_15;

public class Person {
    private char name;
    private String surname;
    private char patronymic;

    public Person(String s) {
        s = s.trim();
        String [] ans = s.split(" ");
        surname = ans[0];
        if (ans.length == 1) name = ' ';
        else name = ans[1].charAt(0);
        if (ans.length <= 2 ) patronymic = ' ';
        else patronymic = ans[2].charAt(0);
    }

    @Override
    public String toString() {
        return  surname + " " + name + "." +  patronymic + ".";
    }
}
