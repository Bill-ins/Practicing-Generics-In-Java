import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        /** Using the Generic simply */

        Gen<String, Integer, Double> g = new Gen("Hello", 123, 123.123);

        System.out.println("This is a String - " + g.a);
        System.out.println("This is a Integer - " + g.b);
        System.out.println("This is a Double - " + g.c);
        System.out.println();
        //--------------------------------------------------------------------------------------//

        /** Using Generics by creating a custom list */
        OwnCustomList<Integer> customList = new OwnCustomList();
        OwnCustomList<String> customList2 = new OwnCustomList();

        customList.add(21);
        customList.add(32);
        customList.add(54);
        customList.add(78);

        customList2.add("Hello");
        customList2.add("Welcome");
        customList2.add("Greetings");
        customList2.add("Hi");

        System.out.println(customList);
        System.out.println(customList2);
        System.out.println();
        //--------------------------------------------------------------------------------------//

        /** Using the generic methods */
        Gen gen = new Gen();

        System.out.println(gen.genenicReturn("Hello"));
        System.out.println(gen.genenicReturnNumber(123));
        System.out.println();

        List list = new ArrayList();
        list.add(56);
        list.add(98);
        list.add(7878);
        gen.firstNdLastIndxVal(list);
        System.out.println();
        //--------------------------------------------------------------------------------------//

        /** Using the Wild Card of generics by list implementation */
        WildCard wildCard = new WildCard();
        List list1 = new ArrayList<Double>();
        list1.add(65.6);
        list1.add(55.3);
        list1.add(86.7);
        wildCard.addNumbersToList(list1);
        System.out.println(wildCard);
    }
}
