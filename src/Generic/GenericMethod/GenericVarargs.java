package Generic.GenericMethod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Tan on 16/1/20.
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = Lists.newArrayList();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String... args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHI".split(""));
        System.out.println(ls);
        List<Long> longList = makeList(1L, 2L, 3L);//Long 类型
        System.out.println(longList);
        List<Integer> integerList = makeList(1, 2, 3, 4, 5);//Integer类型
        System.out.println(integerList);
    }
}
