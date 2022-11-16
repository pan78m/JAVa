package Class_Object;
//Assigning Object Reference Variable?
class b1 {
    String name = "Pankaj Mahanto";
    int id = 213902002;

    void display() {
        System.out.println("Name: "+name+"\nID: "+id);
    }
}
public class Assigning {
    public static void main(String[] args) {
        b1 ob = new b1();
        ob.display();
        b1 ob2 = ob;
        ob2.display();
    }
}
