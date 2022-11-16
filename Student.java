package Class_Object;

class Class {
    String name="Pankaj Mahanto";
    String d="CSE";
    int id=213902002;

    void SetValue(String n, String da, int i) {
        name = n;
        d = da;
        id = i;
        System.out.println("Student Name: "+name+"\nStudent Dept: "+d+"\nStudent ID: "+id);
    }

    void PrintInfo() {
        System.out.println("Student Name: "+name+"\nStudent Dept: "+d+"\nStudent ID: "+id);
    }
}
public class Student {
    public static void main(String[] args) {
        Class ob = new Class();
        ob.name = "Joy Mahanto";
        ob.d = "CSE";
        ob.id = 213902003;
        ob.PrintInfo();
        
       // ob.SetValue("djfkjdj", "null", 21578);
        System.out.println("\n");
        Class ob1 = new Class();
        ob1.name = "Kajol Mahanto";
        ob1.d = "CSE";
        ob1.id = 213902005;
        ob1.PrintInfo();
        System.out.println("\n");
    }
}
