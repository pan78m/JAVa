package classmethodobject;
//Varargs Variable Length Argument Overloading??

class VaAOver {

    void vO(int... v) {
        System.out.println("Number of args: " + v.length);
        for (int x : v) {
            System.out.println("x:\n" + x);
        }
    }

    void vO(String msg, int... v) {
        System.out.println("String message is: " + msg);
        System.out.println("Number of args: " + v.length);
        for (int x : v) {
            System.out.println("x:\n" + x);
        }
    }
    
       void vO(boolean ... v){
        System.out.println("Number of args: "+v.length);
        for(boolean x:v){
            System.out.println("x:"+x);
        }
    }
}

public class Problem_12 {

    public static void main(String[] args) {
        VaAOver ob = new VaAOver();
            ob.vO(false,false,true,true);
            ob.vO(1,3,5,8,9);
            ob.vO("This is String",9,8,7,6);
    }
}
