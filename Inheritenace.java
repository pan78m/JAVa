package inheritenace;

class Student {

    private String name;
    private String Dept;
    private int id;

    Student(String name, String Dept, int id) {
        this.name = name;
        this.Dept = Dept;
        this.id = id;
    }

    Student() {
        name = "Joy Arya";
        Dept = "EEE";
        id = 213902010;
    }

    Student(String name) {
        this.name = name;
    }

    Student(Student s) {
        name = s.name;
        Dept = s.Dept;
        id = s.id;
    }

    void display() {
        System.out.println("Name: " + name + "\nDept: " + Dept + "\nid: " + id);
    }
}

class Cse_Student extends Student {

    String section;

    Cse_Student(String name, String Dept, int id, String section) {
        super(name, Dept, id);
        this.section = section;
    }

    Cse_Student() {
        super();
        section = "PC-213DA";
    }

    Cse_Student(String name, String section) {
        super(name);
        this.section = section;
    }

    Cse_Student(Cse_Student s) {
        super(s);
        section = s.section;

    }
}

public class Inheritenace {

    public static void main(String[] args) {
        Cse_Student s1 = new Cse_Student("Pankaj Mahanto", "CSE", 213902002, "PC-213DA");
        Cse_Student s2 = new Cse_Student();//Defual method
        Cse_Student s3 = new Cse_Student("Virat Kohali", "PC-213DA");
        Cse_Student s4 = new Cse_Student(s1);
        s1.display();
        System.out.println(s1.section);
        s2.display();
        System.out.println(s2.section);
        s3.display();
        System.out.println(s3.section);
        s4.display();
        System.out.println(s4.section);
    }

}
