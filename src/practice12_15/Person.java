package practice12_15;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFullName(){
        StringBuilder s = new StringBuilder(surname).append(" ");
        StringBuilder temp;
        if (!name.equals("")){
            temp = new StringBuilder().append(name.charAt(0)).append(".");
        }else{
            temp = new StringBuilder("");
        }
        s.append(temp);
        if (!patronymic.equals("")){
            temp = new StringBuilder().append(patronymic.charAt(0)).append(".");
        }else{
            temp = new StringBuilder("");
        }
        s.append(temp);
        return s.toString();
    }
}
