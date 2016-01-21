package Generic.GenericMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tan on 16/1/20.
 */
public class GenericMethodDemo {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String... args) {
        GenericMethodDemo genericMethodDemo = new GenericMethodDemo();
        genericMethodDemo.f("");
        genericMethodDemo.f(1);
        genericMethodDemo.f(1.0);
        genericMethodDemo.f(1.0F);
        genericMethodDemo.f('c');
        genericMethodDemo.f(genericMethodDemo);
        Map<String, List<? extends String>> map = New.map();
        genericMethodDemo.f(map);
    }
}
