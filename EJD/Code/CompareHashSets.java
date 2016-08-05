import java.util.HashSet;
public class CompareHashSets {
    public static void main(String args[]) {
        HashSet<String> fruitSet = new HashSet<>();
        //add elements to HashSet called `fruitSet'
        fruitSet.add(``apple'');
        fruitSet.add(``banana'');
        fruitSet.add(``lemons'');
        fruitSet.add(``oranges'');
        fruitSet.add(``mango'');
	System.out.println(``Spring Season Fruits: '');
        System.out.println(fruitSet);
	// add elements to another HashSet called `subSet'
        HashSet<String> subSet = new HashSet<String>();
        subSet.add(``banana'');
        subSet.add(``cherries'');
        subSet.add(``grapes'');
	subSet.add(``oranges'');
	System.out.println(``Summer Season Fruits: '');
	System.out.println(subSet);
        fruitSet.retainAll(subSet);
        System.out.println(``Fruits in All Seasons:'');
        System.out.println(fruitSet);
    }
}
