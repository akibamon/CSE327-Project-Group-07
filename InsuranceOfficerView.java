import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
//@creating textfield in window
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import java.lang.String;


public class InsuranceOfficerView extends JFrame {
    //@creating the object virsion of JLabel,JTextfield  
    private JLabel banksNameLabel;
    private JTextField banksName;
    
   public InsuranceOfficerView(){
       
       //@calling the super method
       //@giving title for Membershop Officer
       
        
       super("Insurance Officer");
    
       setTitle("title");
       //@setting the default layout        
       setLayout(new FlowLayout());
        
       //@Labeling for the window 
        banksNameLabel = new JLabel("banksName");
        
        //@adding the object to window
        add(banksNameLabel);
        //@pop up the scroll-box(tool tip text)
        banksNameLabel.setToolTipText("this is gonna show up for banksName");
        //@adding the object to window
         add(banksNameLabel);
        
        banksName = new JTextField(20);
        //@adding the object to window
        add(banksName);
        
        //@creating handeler object for thehandeler class
        thehandeler handeler = new thehandeler();
        //@calling the addActionListener method
        //@passing the handeler object to addActionListener
        banksName.addActionListener(handeler);
    
    
    }

    
    //@creating thehandeler class inside MembershipView class class(it will be inherete all the things)
    private class thehandeler implements ActionListener{
        
        //@calling the actionPerformed method
        //@creating event object of ActionEvent library
        //@passing the object to actioPerformed method
        
        
    public void actionPerformed(ActionEvent event){
    String string = "  ";
    
    //@calling getSource method(here event is click or enter button)(it means where it happens)
    if(event.getSource()== banksName)
    //@converting to string//getAction Command: get the text from getsource();
        
    string = string.format("banksNamemembershipType : %s",event.getActionCommand());
    JOptionPane.showMessageDialog(null,string);
}
    }
}
