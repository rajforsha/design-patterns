package mvc;


/**
 * <p> controller class can interact with the view and controller. </p>
 * @author setup
 *
 */
public class PersonControllerClass {

    public void createAndDispalyPersonClass(){
        PersonModelClass p= new PersonModelClass();
        p.setName("Shashi");
        p.setCompany("SAP");

        PersonViewClass view= new PersonViewClass();
        view.display(p);
    }

}
