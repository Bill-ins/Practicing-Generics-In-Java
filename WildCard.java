import java.util.ArrayList;
import java.util.List;

public class WildCard {

    List list;

    /** The statement - '(List<? extends Number> list)', in the method parameter defines that the method will only accept the
     *  argument of type Number; i.e. it will only accepts datatype that will extends Number class.
     *  '?' - This question mark sign is called the wild card
     *  The wild card feature only works with Lists */

    public WildCard() {
        this.list = new ArrayList();
    }

    public void addNumbersToList(List<? extends Number> list) {
        this.list.addAll(list);
    }

    public void printingParameteredList(List<? extends Number> list) {
        System.out.println(list);
    }

    public void getLastIndex(List<? extends Number> list) {
        System.out.println(list.get(list.size()-1));
    }


    @Override
    public String toString() {
        return list.toString();
    }
}
