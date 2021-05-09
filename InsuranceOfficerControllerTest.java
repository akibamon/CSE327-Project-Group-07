import javax.swing.JFrame;


import junit.framework.TestCase;


public class InsuranceOfficerControllerTest extends TestCase {
    
    public InsuranceOfficerControllerTest(String testName) {
        super(testName);
    }
   
    
     //*@ Test of main method, of class InsuranceOfficerController.
     
    public class InsuranceOfficerController {
    public static void main(String[] args) {
          InsuranceOfficerView insobj = new InsuranceOfficerView ();
    //@to exit the program
    insobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insobj.setSize(600,800);
        insobj.setVisible(true);
    }
           

}
}
