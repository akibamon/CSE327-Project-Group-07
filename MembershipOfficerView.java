
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
//@creating textfield in window
import javax.swing.JTextField;
import javax.swing.JLabel;                  
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.text.JTextComponent;



public class MembershipOfficerView extends JFrame {
    
    //@creating the object version of JLabel,JTextField
    
    private JLabel membershipTypeLabel;
    private JLabel permiumMembershipLabel;
    private JLabel regularMembershipLabel;
    private JTextField membershipType;
    private JTextField permiumMembership;
    private JTextField regularMembership;
    
    private boolean False;
    
    
    MembershipOfficerView(){
    //@giving title for Membershop Officer
    super("Membershop Officer");
    //@setting the default layout        
        setLayout(new FlowLayout());
        
        //@Labeling for the window 
        membershipTypeLabel = new JLabel("Membership Type");
        add(membershipTypeLabel);
        //@pop up the scroll-box(tool tip text)
        membershipTypeLabel.setToolTipText("this is gonna show up for membershipType");
         add(membershipTypeLabel);
        
        membershipType = new JTextField(20);
        add(membershipType);
        
       //@Labeling for the window 
        permiumMembershipLabel = new JLabel("permiumMembership");
        add(permiumMembershipLabel);
        //@pop up the scroll-box(tool tip text)
        permiumMembershipLabel.setToolTipText("this is gonna show up for premium membership");
         //@adding the object virsion to window
        add( permiumMembershipLabel);
        
        permiumMembership = new JTextField(20);
         //@adding the object virsion to window
        add(permiumMembership);
        
         //@Labeling for the window 
        regularMembershipLabel= new JLabel("regularMembership");
         //@adding the object virsion to window
        add(regularMembershipLabel);
        //@pop up the scroll-box(tool tip text)
        regularMembershipLabel.setToolTipText("this is gonna show up regular membership");
         //@adding the object virsion to window
        add(regularMembershipLabel);
        
        regularMembership = new JTextField(20);
        //@adding the object virsion to window
        add(regularMembership);
    
     //@creating handeler object for thehandeler class
    thehandeler handeler = new thehandeler();
    membershipType.addActionListener(handeler);
    permiumMembership.addActionListener(handeler);
    regularMembership.addActionListener(handeler);
    
    
    }
    //@creating thehandeler class inside MembershipView class class(it will be inherete all the crap from tuna2 class)
    private class thehandeler implements ActionListener{
    public void actionPerformed(ActionEvent event){
    String string = "  ";
    
    //@calling getSource method(here event is click or enter button)(it means where it happens)
    if(event.getSource()== membershipType)
    //@converting to string//getAction Command: get the text from getsource();
        
    string = string.format("membershipType : %s",event.getActionCommand());
    
    else if(event.getSource()== permiumMembership)
        
       string = string.format("permiumMembership: %s",event.getActionCommand());
    
    else if(event.getSource()== regularMembership)
        
      string = string.format("regularMembership : %s",event.getActionCommand());
    //@calling showMassageDialog 
    //@showing to the window
    JOptionPane.showMessageDialog(null,string);
    
    }
    
    
    
}
}
