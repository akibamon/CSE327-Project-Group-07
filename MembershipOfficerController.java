
import javax.swing.JFrame;


public class MembershipOfficerController {
    /*this part of the code will not use for controller
    private MembershipOfficerView theView;
    private MembershipOfficerModel theModel;
    
    
    public MembershipOfficerController(MembershipOfficerView theView,MembershipOfficerModel theModel){
    
        this.theView = theView;
        this.theModel = theModel;
    
    }
    */
    //@creating the main function for calling the objects
    public static void main(String[] args) {
          MembershipOfficerView memobj = new MembershipOfficerView ();
    //@calling setDefaultCloseOperation to exit the program
    memobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        memobj.setSize(600,800);
        memobj.setVisible(true);
    }
    
}
