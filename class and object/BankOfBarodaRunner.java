class BankOfBarodaRunner{
  public static void main(String[]a){
  
  BankOfBaroda branch=new BankOfBaroda();
  
  branch.bankid=1;
  branch.IFSC="BARB0CORBAN";
  branch.MICR=560012014;
  branch.address="'CBB B'' Lore Branch, 26, H. J. S. Chambers, 1st Floor, Richmond Road, 560025 ', BangaloreCity : Bangalore UrbanDistrict : BangaloreState : Karnataka";
  branch.email="corban@bankofbaroda.com";
branch.customerCare="1800-22-3344 - General Issues1800-22-0400 - Debit Cards1800-102-4455 - Inclusion schemes1800-102-7788 - Pradhan Mantri Jan Dhan Yojana customers";  
branch.fax=25304606;

System.out.println("BankOfBaroda bank id is "+branch.bankid);
System.out.println("bank of baroda ifsc code is "+branch.IFSC);
System.out.println("bank of baroda MICR is :"+branch.MICR);
System.out.println("bank of baroda address is "+branch.address);
System.out.println("bank of baroda eamil is "+branch.email);
System.out.println("bank of baroda customerCare is"+branch.customerCare);
System.out.println("bank of baroda fax is "+branch.fax);

  
  }
}