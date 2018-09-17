package singleton;

public class SingletonDesingPatternTestClass {

    public static void main(String[] args) {

        /**
         * <p>
         * throws error because we can't create class
         * </p>
         */
        // SingletonDesingPattern obj= new SingletonDesingPattern();

        @SuppressWarnings("unused")
        SingletonDesingPattern obj = SingletonDesingPattern.getInstance();

    }

}
