
package classmethodobject;

class Box {

    double width, height, depth;
    Box(Box o){
        width=o.width;
        height=o.height;
        depth=o.depth;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
//Constructor Overloading here!!

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double Volume() {
        return width * height * depth;
    }
}

public class Problem_3 {
    public static void main(String[] args) {
        
        Box ob=new Box(10,20,15);
        Box ob1=new Box(ob);
        Box ob2=new Box();
        Box ob3=new Box(7);
        double vol;
        
        vol=ob.Volume();
        System.out.println("Box1 Volume: "+vol);
        
        vol=ob1.Volume();
        System.out.println("Box2 Volume: "+vol);
        
        vol=ob2.Volume();
        System.out.println("Box3 Volume: "+vol);
        
        vol=ob3.Volume();
        System.out.println("Box4 Volume: "+vol);
    }
}
