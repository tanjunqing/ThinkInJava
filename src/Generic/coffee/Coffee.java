package Generic.coffee;

/**
 * Created by Tan on 16/1/20.
 */
public class Coffee {
    private static long counter = 0;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
