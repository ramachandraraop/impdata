class SuperClass {
    private String name = null;
    // Default constructor
    public SuperClass () {
        System.out.println(``Printing from SuperClass '' +
                         ``default constructor'');
    }

   // Parameterized constructor.
    public SuperClass (String name) {
        System.out.println(``Printing from SuperClass'' +
                            ``Parameterized constructor'');
    }
}
