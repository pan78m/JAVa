 
package referencetest;

 class Reference {
    String name , gender ;
    int id;

    Reference(String n,String g,int i)
    {
       this.name = n;
       this.gender = g;
       this.id = i;
    }
    Reference(Reference r)
    {
        name = "JUBAER";
        gender = "MALE";
        id = 213902116;
    }
    void print()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(id);
    }
}
public class ReferenceTest {

     
      public static void main(String[] args) {
        Reference r1 = new Reference("sayeb","MALE",213902113);
        r1.print();

        Reference r2 = new Reference(r1);
        r2.print();
    }
    
}
