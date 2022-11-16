package classmethodobject;
//Method OverLoading??
class OverLoad {

    void test() {
        System.out.println("No Parameterized");
    }

    void test(int a) {
        System.out.println("a " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("a " + a);
        return a*a;
    }
}

public class ClassMethodObject {

    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        ob.test();
        ob.test(7);
        ob.test(9,8);
        System.out.println("a*a "+ob.test(123.25));
    }

}
