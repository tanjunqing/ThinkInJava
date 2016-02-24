package Generic.GenericMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tan on 16/1/20.
 */
public class LimitsOfInference {
    public void f(Map<String, List<? extends String>> maps) {

    }

    static void ff(Map<String, List<? extends String>> maps) {

    }

    static void fs(Map<String, List<? extends String>> maps) {

    }

    public static void main(String... args) {
        Map<String, List<? extends String>> fff = new HashMap<>();
//        f(New.map());
        LimitsOfInference limitsOfInference = new LimitsOfInference();
        limitsOfInference.f(fff);
        ff(New.<String, List<? extends String>>map());
        fs(New.<String, List<? extends String>>map());
    }
}
