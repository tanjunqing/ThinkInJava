package Generic;

/**
 * Created by Tan on 15/12/7.
 */
public class ThreeTuple<C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A a, B b, C third) {
        super(a, b);
        this.third = third;
    }

    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
