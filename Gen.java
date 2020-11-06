import java.util.ArrayList;
import java.util.List;

public class Gen <A,B,C> {

    /** This is a Generic class, that accepts any data type */

    A a;
    B b;
    C c;

    public Gen(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Gen() {
        /** Creating a default constructor */
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    /** This is a generic method */
    public <T> T genenicReturn(T value) {
        return value;
    }

    /** This is a generic method restricting the use of only Number data type (any datatype that extends Number class),
     *  instead of any other data type. This is useful for using the methods of a superclass. We can also use 'extends' keyword
     *  while creating generic class.
     *  *Number is the super class of all the number type values */
    public <T extends Number> T genenicReturnNumber(T value) {
        return value;
    }

    /** This generic method will print the first and last index value of the List type data. As you can see by
     *  restricting generic type parameter to only List types, we can use all the features(methods) of the List
     *  (like - get(), as we used here). So, that's when the 'extends' keyword comes handy in generics */
    public <T extends List> void firstNdLastIndxVal(T list) {
        System.out.println("First Index Value is - " + list.get(0) + " ... Last Index Value is - " + list.get(list.size()-1));
    }
}
