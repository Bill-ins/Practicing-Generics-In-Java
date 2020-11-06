import java.util.ArrayList;
import java.util.List;

public class OwnCustomList <T> {

    /** This is our own custom generic list */

    List <T> list;

    OwnCustomList() {
        list = new ArrayList<T>();
    }

    public void add(T a) {
        list.add(a);
    }

    @Override
    public String toString() {
        return list.toString();

    }
}
