import java.util.HashMap;
import java.util.Set;
public class GetHashMapkeys {
    public static void main(String a[]) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(12, ``one two'');
        hashMap.put(999, ``nine nine nine'');
        hashMap.put(2014, ``two zero one four'');
        System.out.println(hashMap);
        Set<Integer> keys = hashMap.keySet();
        System.out.println(``keys in HashMap: '');
        for (Integer key: keys) {
            System.out.print(key + `` '');
        }
        System.out.println();
    }
}
