import java.util.Scanner;

public class MembershipOfficerModel {

   //@declearing variable for membershipOfficer
   
   private String membershipType,name,gender,visitedDoctorName;
   private int age,phoneNumber;
   String prmiumMember,regularMember;
   
   //@declearing local variable for membershipOfficer's calculation
   
   double premiumAmount = 500000,userAmount,discountAmount,fee,finalFee;
   
   //@creating scanner object
   
    Scanner input = new Scanner(System.in);
   
   //@Creating membership method
     
     public void MemberShipModel(){
        System.out.println("Enter your yearly income :");
         userAmount = input.nextDouble();
        
     try{
         if(userAmount>=premiumAmount){
             System.out.println("You are accpeted as a Premium member ");
         }
         else{
         System.out.println("Your request has accpted as regular membership!");
         }
     }
         catch(ArithmeticException e){
                 System.out.println("some error has found!");
                 }
         finally{    
                 System.out.println("Thankyou!");
                 
                 }
     
     }
     //@method for premium account;
     //@declearing discount amount
     public double DiscountAmountPremium(){
      //@showing to the window
     System.out.println("Enter your visiting fee :");
     fee = input.nextDouble();
       return fee*.15;
     
     }
     //@method for regular account;
     //@declearing discount amount
     public double DiscountAmountRegular(){
     
     System.out.println("Enter your visiting fee :");
     fee = input.nextDouble();
       return fee*.10;
     
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     //@ creating a method to call all the method of this class
     public void getMembership(){
         MemberShipModel();
         getName();
         getGender();
         getAge();
         getPhoneNumber();
         DiscountAmountPremium();
     }
       
     }
     
