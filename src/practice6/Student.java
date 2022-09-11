package practice6;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student st) {
        if (this.getId() < st.getId()) return -1;
        else if (this.getId() == st.getId()) return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public int getMark() {
        return mark;
    }

    public int getId() {
        return id;
    }
}
