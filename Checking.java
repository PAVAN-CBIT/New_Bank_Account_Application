public class Checking extends Account
{

  int debitCardNumber;
  int debitCardPin;
  
  
  public Checking(String name,String sSN,double initDeposit)
  {
     super(name,sSN, initDeposit);
     accountNumber = "2"+accountNumber;
     setDebitCard();
  
  
  
  }
  
  
  private void setDebitCard()
  
  {
    debitCardNumber = (int)(math.random()*math.pow(10,12));
    debitCardPin =    (int)(math.random()*math.pow(10,4));

  
  
  
  
  }
  public void showInfo()
  {
   super.showInfo();
   System.out.println("Your checking Account Features"+"\n Debit Card Number:"+debitCardNumber+"\n DebitCard PIN"+debitCardPin);
  
  
  
  
  }




}
