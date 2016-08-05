public class StringBuilderDemo {
    public static void main (String [] args) {
        //Create new String Builder.
        StringBuilder builder = new StringBuilder() ;
        // Loop and append values .
        for(int i = 0 ; i < 5 ; i ++) {
            builder.append (``abc'' ) ;
        }
        // Convert to string .
        String result = builder.toString() ;
        // Print result.
        System.out.println(result) ;
        // Insert this substring at position2 .
        builder.insert(2, ``xyz'');
        System.out.println(builder);
        // Delete characters from index2 to index5 .
        builder.delete(2, 5);
        System.out.println(builder);
        builder.replace(1,2, ``xyz'');
        System.out.println(builder);
    }
}
