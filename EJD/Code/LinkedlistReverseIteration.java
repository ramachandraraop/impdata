import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListReverseIteration {

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        String choice = ``'';
        do {
            System.out.print(``enter name to store in a list: '');
            String name = sc.next();
            linkedList.add(name);
            System.out.println();
            System.out.print(``want to add one more element(Y/N)?'');
            choice = sc.next();
        } while (choice.equals(``y''));
        System.out.println(``Original list: '');
        System.out.println(linkedList);
        System.out.println(``Reversed list: '');
        Iterator<String> iterator = linkedList.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }
        System.out.println();
    }
}
