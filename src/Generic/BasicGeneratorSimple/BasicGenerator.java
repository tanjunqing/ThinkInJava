package Generic.BasicGeneratorSimple;

import Generic.coffee.Generator;

/**
 * Created by Tan on 16/1/22.
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> BasicGenerator create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
