class DerivedClassWithSuper extends BaseClass {
   public void display () {
     System.out.println(``Printing from DerivedClassWithSuper'');
     super.display();
   }
}

public class WithSuperDemo {
    public static void main (String[] args) {
        /* Creating an object for DerivedClassWithSuper. */
        DerivedClassWithSuper derivedClass
                              = new DerivedClassWithSuper ();
        // calling display method.
        //Displays from DerivedClass
        derivedClass.display();   
    }
}
