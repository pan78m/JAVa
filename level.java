package lab;

class CSE {

  public CSE() {
    System.out.println("Class CSE");
  }

  public void dType() {
    System.out.println("Department Type: CSE");
  }
}

class Lab extends CSE {

  public Lab() {
    System.out.println("Class Lab");
  }

  public void category() {
    System.out.println("Category - Lab");
  }
}

class Final extends Lab {

  public Final() {
    System.out.println("Class Final");
  }

  public void dislplay() {
    dType();
    category();
    
    System.out.println("Fiveth Lab Class- Final");
  }
}

class level extends Final {

  public static void main(String[] args) {
    Final ft = new Final();
    ft.dislplay();
   
  }
}
