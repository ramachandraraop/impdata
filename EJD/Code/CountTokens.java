import java.util.StringTokenizer;
public class CountTokens{
    public static void main(String args[]) {
        String msg = ``TalentSprint Module-4 EJD'';
        StringTokenizer st = new StringTokenizer(msg, `` '');
        System.out.println(``No of Tokens: '' + st.countTokens()); 
        System.out.println(``Tokens are: '');
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
