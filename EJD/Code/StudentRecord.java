public class StudentRecord {
    String name;
    String address;
    int age;
    double pythonGrade;
    double javaGrade;
    double webGrade;
   
    \\ setter methods here
    \\ getter methods here

    public void display ( String temp ){
       System.out.println(``Name:'' + name);
       System.out.println(``Address:'' + address);
       System.out.println(``Age:'' + age);
    }
    public void display (double pGrade, double jGrade,
                            double wGrade) {
       System.out.println(``\nName:'' + name);
       System.out.println(``Web Grade:'' + wGrade);
       System.out.println(``Java Grade:'' + jGrade);
       System.out.println(``Python Grade:'' + pGrade);
    }
}

