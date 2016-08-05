class DerivedClassWithOutSuper extends BaseClass {
    public void display () {
      System.out.println(``Printing from DerivedClassWithOutSuper.'');   
    }
}
public class WithOutSuperDemo {
    public static void main (String[] args) {
        /* Creating an object for DerivedClassWithOutSuper. */
        DerivedClassWithOutSuper derivedClass
                            = new DerivedClassWithOutSuper ();
        // calling display method.
        derivedClass.display();
    }
}
