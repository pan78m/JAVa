package Class_Object;
//Method Overloading with parameterized??
class OverLoad {
    void test() {
        System.out.println("No Parameterized!");
    }

    void test(int a) {
        System.out.println("a is:"+a);
    }

    void test(int a, int b) {
        System.out.println("a&b is:" + a + " " + b);
    }
    double test(double a) {
        System.out.println("a :" + a);
        return a * a;
    }
}
public class Problem_2 {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        ob.test();
        ob.test(20);
        ob.test(15, 87);
        System.out.println(ob.test(123.25));
    }
}
