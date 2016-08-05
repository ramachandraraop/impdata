import java.util.ArrayList;
import java.util.Collections;
public class ShuffleArrayList {
    public static void main(String a[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(``Java'');
        list.add(``Cric'');
        list.add(``Play'');
        list.add(``Watch'');
        list.add(``Glass'');
        list.add(``Movie'');
        list.add(``Girl'');
        
	System.out.println(``List before shuffle operation: '');
	for (String element : list) {
	    System.out.print(element + `` '');
	}
        Collections.shuffle(list);
        System.out.println(``Results after shuffle operation:'');
        for (String element : list) {
            System.out.print(element + `` '');
        }
         
        Collections.shuffle(list);
        System.out.println(``Results after shuffle operation:'');
        for (String element: list) {
            System.out.print(element + `` '');
        }
    }
}
