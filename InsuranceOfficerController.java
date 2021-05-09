import javax.swing.JFrame;

public class InsuranceOfficerController {
    public static void main(String[] args) {
          InsuranceOfficerView insobj = new InsuranceOfficerView ();
    //@to exit the program
    insobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insobj.setSize(600,800);
        insobj.setVisible(true);
    }
    
    
    /*@this part of code is not using in the program
    private InsuranceOfficerModel theModel;
    private  InsuranceOfficerView theView;
    
    public InsuranceOfficerController (InsuranceOfficerModel theModel,InsuranceOfficerView theView){
    
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addContainerListener(new containerListner());
        
    }
   public class containerListner implements ActionListner{
   
   }*/
    
}
