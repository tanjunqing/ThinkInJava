package Generic.GenericMethod;

import java.util.*;

/**
 * Created by Tan on 16/1/20.
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String... args) {
        Map<String, List<? extends String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.linkedList();
        Set<Long> st = New.set();
        Queue<String> qs = New.queue();
    }
}
