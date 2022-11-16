
package classmethodobject;

class CallByR {

    int a, b;

    CallByR(int i, int j) {
        a = i;
        b = j;
    }

    void display(CallByR o) {
        o.a *= 2;
        o.b /= 2;
    }
}
//Page No:->251,254,256,258*,261,265,273,275,279,
//Command line Argument->>>>>>>>
public class Problem_6 {

    public static void main(String[] args) {
        CallByR ob = new CallByR(15, 20);
        System.out.println("a and b before Call: " + ob.a + " " + ob.b);
        ob.display(ob);
         System.out.println("a and b After Call: " + ob.a + " " + ob.b);
    }
}
