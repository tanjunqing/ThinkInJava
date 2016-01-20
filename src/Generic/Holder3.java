package Generic;

/**
 * Created by Tan on 15/12/7.
 */
public class Holder3<T> {
    private T c;

    public Holder3(T c) {
    }

    public void set(T c) {
        this.c = c;
    }

    public T get() {
        return this.c;
    }

    public static void main(String... args) {
        Holder3<Student> holder3 = new Holder3<Student>(new Student());
        Student a = holder3.get();
    }
}
