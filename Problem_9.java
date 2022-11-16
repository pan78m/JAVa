package classmethodobject;
//Inner Class or Nested Class
class Outer {

    int v = 100;
int count=0;
    void test() {
        for (int i = 0; i < 10; i++) {

            class Inner {
                   
                void display() {
                    System.out.println("This is outer value: " + v);
                    count++;
                }
                
            }
            System.out.print(count+" ");
            Inner n = new Inner();
            n.display();
        }
    }
}

public class Problem_9 {

    public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
    }
}
