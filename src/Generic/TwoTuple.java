package Generic;

/**
 * Created by Tan on 15/12/7.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("tan");
        Automobile automobile = new Automobile();
        automobile.setFox("1234");
        TwoTuple<Student,Automobile> twoTuple = new TwoTuple<Student, Automobile>(student,automobile);
        Student student1 = twoTuple.getFirst();
        Automobile automobile1 = twoTuple.getSecond();
        System.out.println(student1.getName());
        System.out.println(automobile1.getFox());
        System.out.println(twoTuple.toString());
     }
}
