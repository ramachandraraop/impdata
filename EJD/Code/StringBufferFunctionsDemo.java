public class StringBufferFunctionsDemo {
    public static void main ( String [] args ) {
        // Examples of Creation of Strings
        StringBuffer strBuf1 = new StringBuffer(``Talent Sprint'') ;
        StringBuffer strBuf2 = new StringBuffer( 100 ); // With capacity 100
        StringBuffer strBuf3 = new StringBuffer() ; // Default Capacity 16
        System.out.println(`` strBuf1: '' + strBuf1 ) ;
        strBuf1.setCharAt(1, `t');
        System.out.println(``strBuf1 after setCharAt 1 to t is : ''+ strBuf1 ) ;
        System.out.println(``strBufr1 to String() is : '' + strBuf1.toString());
        strBuf3.append(``Enterprise Java Development '') ;
        System.out println(``strBuf3 when appended with a String : ''+ strBuf3.toString(strBuf3.insert(1, `c'));
        System.out.println(``strBuf3 when c is inserted at 1 : ''+ strBuf3.toString ( )) ;
        strBuf3.delete (1 , `c') ;
        System.out.println(``strBuf3 when c is deleted at 1 : ''+ strBuf3 . toString ( ) ) ;
        strBuf1.reverse ( ) ;
        System.out.println(``Reversed strBuf1 : '' + strBuf1) ;
        strBuf2.append(``Core Java & Adv Java '') ;
        strBuf2.setLength(10) ;
        System.out.println(`` strBuf2 : '' + strBuf2) ;
        // We can clear a String Buffer using the following line
        strBuf2.setLength(0);
        System.out.println(``strBuf2 when clear ed using setLength(0): ''+ strBuf2 ) ;
    }
}
