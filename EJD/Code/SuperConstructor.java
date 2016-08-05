class DerivedClass extends SuperClass {

  public DerivedClass () {
      super ();
      System.out.println(``Printing from DerivedClass'' +
                          ``default constructor'');      
  }

  public DerivedClass (String name) {
      super (name);
      System.out.println(``Printing from DerivedClass'' +
                          `` parameterized constructor'');      
  }
}

public class SuperConstructor {

    public static void main (String[] args) {
        /* Creating an object with default constructor. */
        DerivedClass derivedClassOne 
                     = new DerivedClass ();
        /* Creating an object with parameterized constructor. */
        DerivedClass derivedClassTwo 
                     = new DerivedClass (``TalentSprint'');
    }
}
