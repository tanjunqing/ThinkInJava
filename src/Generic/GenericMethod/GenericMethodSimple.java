package Generic.GenericMethod;

import Generic.Automobile;

/**
 * Created by Tan on 16/1/20.
 */
public class GenericMethodSimple {

    public <A, B, C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String... args) {
        GenericMethodSimple gen = new GenericMethodSimple();
        Automobile automobile = new Automobile();
        gen.f("", automobile, 1.0F);
    }
}
