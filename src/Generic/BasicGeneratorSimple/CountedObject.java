package Generic.BasicGeneratorSimple;

/**
 * Created by Tan on 16/1/22.
 */
public class CountedObject {
    private static long counter = 0;

    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
}
