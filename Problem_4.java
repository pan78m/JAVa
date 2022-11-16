package classmethodobject;

class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}

public class Problem_4 {

    public static void main(String[] args) {
        Test ob = new Test(100, 22);
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(-1, 22);
        System.out.println("ob==ob1 " + ob.equalTo(ob1));
        System.out.println("ob==ob2 " + ob.equalTo(ob2));

    }
}
