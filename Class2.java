package lab;

public class Class2 extends Class1 {
    int count = 0;

    Class2(String s, int count) {
        super(s);
       // count = count;//0
        this.count = count;//3
    }
    @Override
    public void show() {
        System.out.println("Class2");
        System.out.println(super.name);
        super.show_string();
       // System.out.println(s);
    }

    public void show_count() {
        System.out.println("Class2 "+this.count);
    }
    
     
}
