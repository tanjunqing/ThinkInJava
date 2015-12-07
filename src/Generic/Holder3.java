package Generic;

/**
 * Created by Tan on 15/12/7.
 */
public class Holder3<C> {
    private C c;

    public Holder3(C c) {
    }

    public void set(C c) {
        this.c = c;
    }

    public C get() {
        return this.c;
    }

    public static void main(String... args) {
        Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());
        Automobile a = holder3.get();
    }
}
