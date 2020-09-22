public abstract class Account implements IBaseRate
{
  String name;
  String sSn;
  double balance;
  
  
  static int index = 1000;
  String accountNumber;
  double rate;
  
   public Account(String name,String sSN,double initDeposit)
   {
   
       this.name = name;
       this.sSN = sSN;
       balance = initDeposit;
       System.out.println("NAME" +name+"SSN"+ sSN+"BALANCE: $"+balance);
       index++;
       this.accountNumber = setAccountNumber();
       System.out.println("ACCOUNT NUMBER"+this.accountNumber);
   }
  private String setAccountNumber()
  {
    String lastTwoofSSN = sSn.substring(sSN.length()-2,sSN.length());
    int uniqueID = index;
    int randomNumber=(int) (Math.random()*Math.pow(10,3));
    return lastTwoofsSN+uniqueID+randomNumber;
    
  
  
  }:
  public void showInfo()
  {
    System.out.println("NAME: "+name+"\nACCOUNT NUMBER: "+account number+"\nBALANCE: "+balance);
  
  
  
  
  
  }



}
