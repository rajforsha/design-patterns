package singleton;

public class SingletonDesingPattern {

    private static SingletonDesingPattern instance = null;


    /**
     * <p> this is eager instantiation , we are assigning the object to instance .</p>
     */

   // private static final SingletonDesingPattern instance= new SingletonDesingPattern();

    /**
     * <p>
     * declare a private default construtor , so that we won't be able to create
     * instance of class.
     * </p>
     */
    private SingletonDesingPattern() {

    }

    /**
     * <p>
     * this is lazy instantiation , object will be created once first call is
     * made to this function.
     * </p>
     *
     * @return
     */
    public static SingletonDesingPattern getInstance() {

        if (instance == null) {
            instance = new SingletonDesingPattern();
        }
        return instance;
    }



    /**
     * <p>
     * this is eager instantiation ,object is already created we directly return the instance .
     * </p>
     *
     * @return
     */
   /* public static SingletonDesingPattern getInstance() {

        return instance;
    }*/




}
