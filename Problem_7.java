package classmethodobject;
//Array Revisited without Constructor passing value
class Stack {

    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    //Push of Stack is?
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is overflow!");
        } else {
            stck[++tos] = item;
        }
    }

    //Pop is 
    int pop() {
        if (tos == -1) {
            System.out.println("Stack is underFlow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class Problem_7 {

    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        
        for(int i=0;i<10;i++)
            st1.push(i);
        for(int i=0;i<10;i++)
            st2.push(i);
        System.out.println("My Fist Stack is: ");
        for(int i=0;i<10;i++)
            System.out.println(st1.pop());
        System.out.println("My Second Stack is: ");
         for(int i=0;i<10;i++)
            System.out.println(st2.pop());
    }
}
