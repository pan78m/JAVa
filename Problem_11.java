package classmethodobject;
//Varargs Variable Length Argument

class VarA {

    static void Vtest(int... v) {
        int sum = 0;
        System.out.println("Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.println("x: " + x + "\n");
            sum+= x;
            //System.out.println("Sum of: "+sum+"\n");
        }
        System.out.println("Sum of: " + sum + "\n");
    }
}

public class Problem_11 {

    public static void main(String[] args) {
        VarA ob = new VarA();
        ob.Vtest(10);
        ob.Vtest(1, 2, 3);
        ob.Vtest(4,3);
    }
}
