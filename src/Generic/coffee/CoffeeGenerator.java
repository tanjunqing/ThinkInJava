package Generic.coffee;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Tan on 16/1/20.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Breve.class, Cappuccino.class, Latte.class, Mocha.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {

    }

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    private int size = 0;

    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    /**
     * Returns an iterator over a set of elements of type T.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Coffee> iterator() {
        return null;
    }

    class CoffeeIterator implements Iterable<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /**
         * Returns an iterator over a set of elements of type T.
         *
         * @return an Iterator.
         */
        @Override
        public Iterator<Coffee> iterator() {
            return null;
        }
    }

    ;

    public static void main(String... args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
