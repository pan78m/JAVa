package lab;

class Add {
    public void add(int a, int b) {
        System.out.println("Addtion: " + (a + b));
    }
}

class Sub extends Add {
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a + b));
    }
}

class Multiply extends Sub {
    public void multiply(int a, int b) {
        System.out.println("Subtraction: " + (a * b));
    }
}

class Div extends Multiply {
    public void div(int a, int b) {
        System.out.println("Division: "+(a/b));
    }
    public void CallAllMethods() {
        add(5, 3);
        sub(4, 2);
        multiply(4, 2);
        div(4, 3);
    }
}

  class Calculation extends Div {
    public static void main(String[] args) {
        Div d = new Div();
        d.CallAllMethods();
    }
}
