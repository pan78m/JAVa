package Class_Object;

// import java.util.*;

class Name {

  String name;
  static String uni = "Green University of Bangladesh";
  int id;

  void show() {
    System.out.println(
      "Name: " + name + "\nUniversity Name: " + uni + "\nId:" + id
    );
  }
}

public class method {

  public static void main(String[] args) {
    // System.out.println("hello!");
    Name s1 = new Name();
    s1.name = "Pankaj Mahanto";
    //s1.uni = "GUB";
    s1.id = 2025;
    s1.show();
    //    System.out.println(s1.name);
    //    System.out.println(s1.id);
    //    System.out.println(s1.uni);
    Name s2 = new Name();
    s2.name = "Joy Mahanto";
    //s2.uni = "GUB";
    s2.id = 2005;
    //    System.out.println(s2.name);
    //    System.out.println(s2.id);
    //    System.out.println(s2.uni);
    s2.show();
    Name s3 = new Name();
    s3.name = "Akash Mahanto";
    // s3.uni = "GUB";
    s3.id = 20205;
    s3.show();
    //    System.out.println(s3.name);
    //    System.out.println(s3.id);
    //    System.out.println(s3.uni);

  }
}
