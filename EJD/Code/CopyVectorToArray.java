import java.util.Vector;
import java.util.Arrays;
public class CopyVectorToArray {
    public static void main(String args[]) {
        Vector<String> vct = new Vector<>();
            vct.add(``Python'');
            vct.add(``Java'');
            vct.add(``C'');
            vct.add(``Ajax'');
            vct.add(``SQL'');
            System.out.println(``Actual vector: '');
            System.out.println(vct);
            String[] copyArr = new String[vct.size()];
            vct.copyInto(copyArr);
            System.out.println(``Ordered Copied Array: '');
            Arrays.sort(copyArr);
            for (String str : copyArr) {
                System.out.print(str + `` '');
            }
            System.out.println();
    }
}
