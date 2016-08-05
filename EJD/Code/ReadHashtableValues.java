import java.util.Enumeration;
import java.util.Hashtable;
public class ReadHashtableValues {
    public static void main(String args[]) {
        Hashtable<String, String> hm = new Hashtable<>();
        hm.put(``one'', ``January'');
        hm.put(``two'', ``Febraury'');
        hm.put(``three'', ``March'');
        Enumeration<String> keys = hm.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(``Value of '' + key + `` is: '' 
                                + hm.get(key));
        }
    }
}
