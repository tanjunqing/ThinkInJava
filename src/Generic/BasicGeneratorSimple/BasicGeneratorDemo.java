package Generic.BasicGeneratorSimple;

import Generic.coffee.Generator;

/**
 * Created by Tan on 16/1/22.
 */
public class BasicGeneratorDemo {
    public static void main(String... args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        Generator<CountedObject> generator = new BasicGenerator<>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
            System.out.println(generator.next());
        }
    }
}
