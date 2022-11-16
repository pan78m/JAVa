package Class_Object;

class Box {
    double width, heigh, depth;

    double volume() {
        return width * heigh * depth;
    }

    void SetDiv(double w, double h, double d) {
        width = w;
        heigh = h;
        depth = d;
    }
}
public class Problem_1 {//Method value parameterized
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        // double vol;
        b1.SetDiv(10, 20, 15);
        b2.SetDiv(3, 6, 9);
        System.out.println("b1 Volume is: " + b1.volume());
        System.out.println("b2 Volume is: "+b2.volume());
    }
}
