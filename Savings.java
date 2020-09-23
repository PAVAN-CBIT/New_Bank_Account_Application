public class Savings extends Account
{
  int safetyDepositBoxID;
  int safetyDepositBoxKey;
  
  
  public Savings(String name,String sSN,double initDeposit)
  {
    super(name,sSN,initDeposit);
    accountNumber = "1"+accountNumber;
    setSafetyDepositBox();
 
  }
  private void setSafetyDepositBox()
  
  {
    safetyDepositBoxID =  (int)(Math.random()*Math.pow(10,3));

    safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
  
  
  
  }
  public void showInfo()
  {
  super.showInfo();
  System.out.println("Your savings Account Features"+\n SafetyDepositBoxID:"+safetyDepositBoxID+"\n safetyDepositBoxKey:"+safetyDepositBoxKey);
  
  
  
  
  }





}
