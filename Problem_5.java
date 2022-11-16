
package classmethodobject;

//Call by value is no effect in main function
class Call{
    void display(int i,int j){
        i *=2;
        j /=2;
    }
}
public class Problem_5 {
    public static void main(String[] args) {
        Call ob=new Call();
        int a=15,b=20;
        System.out.println("a and b before Call :"+a+" "+b);
        ob.display(a,b);
         System.out.println("a and b After Call :"+a+" "+b);
    }
  
}
