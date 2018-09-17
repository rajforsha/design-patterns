package mvc;

/**
 * <p> this class is just responsible for the view </p>
 * @author setup
 *
 */
public class PersonViewClass {

    public void display(PersonModelClass p){

        System.out.println("["+"name :"+p.getName()+" company :"+p.getCompany()+"]");

    }

}
