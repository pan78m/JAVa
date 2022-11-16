package classmethodobject;
//Array Revisited with Constructor passing value
class Stack {

    private int stc[];
    private int tos;

    Stack(int size) {
        stc = new int[size];
        tos = -1;
    }

    void push(int i) {
        if (tos == stc.length - 1) {
            System.out.println("Stack is overflow");
        } else {
            stc[++tos] = i;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stc[tos--];
        }
    }
}

public class Problem_8 {

    public static void main(String[] args) {
        Stack s1 = new Stack(8);
        Stack s2 = new Stack(5);
        for (int i = 0; i < 8; i++) {
            s1.push(i);
        }
        for (int i = 0; i < 5; i++) {
            s2.push(i);
        }
        
        System.out.println("My Fist Stack is: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(s1.pop());
        }
        
        System.out.println("My Second Stack is: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(s2.pop());
        }

    }
}
