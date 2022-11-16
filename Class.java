package Class_Object;

class Car {
    String brand;

    Car() {
        this.brand = "Frad";
    }

    public String getBrand() {
        return brand;
    }

    void run() {
        System.out.println("Car is running....");
    }
}
public class Class {
    public static void main(String[] args) {
        Car ford = new Car();
        String brand = ford.getBrand();
        System.out.println(brand);
    }
}
