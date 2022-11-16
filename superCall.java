package lab;

class Animal {
    // Animal() {
    //     System.out.println("I am Animal!");
    // }
// Parameterise
    Animal(String type) {
        System.out.println("I am Animal!"+type);
    }
}

 class Dog extends Animal {
     Dog() {
        //Without paramerter
        //super();
         
         //Parameter
         super("Good");
        System.out.println("I am Dog");
        //super();
    }
}

public class superCall {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        
    }
}
