public class StaticPolymorphismDemo {
    public static void main( String[] args ) {
        StudentRecord tsRecord = new StudentRecord();
        tsRecord.setName(``TalentSprint'');
        tsRecord.setAddress(``Hyderabad'');
        tsRecord.setAge(15);
        tsRecord.setWebGrade(80);
        tsRecord.setJavaGrade(95.5);
        tsRecord.setPythonGrade(100);

        //overloaded methods
        tsRecord.display( tsRecord.getName() );
        tsRecord.display( tsRecord.getPythonGrade(), 
             tsRecord.getJavaGrade(), tsRecord.getWebGrade());
    }
}
