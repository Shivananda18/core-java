class BankRunner{
public static void main(String[]a){
	
	String sbibranches[]={"rajaji nagar","maleshwaram","yashwanthpur","vijayanagar","kamakshipalya"};
	String axisbranches[]={"majestic","laggeri","vijayanagar","rajajinagar"};
	
	Bank bank=new Bank();
	bank.bankName="SBI";
	bank.bankid=1;
	bank.bankBranches=sbibranches;
	bank.ifscCode="UDSS3566";
	bank.banklocation="Bengalore";
	System.out.println("=============sbi bank branches are ============");
	for(String sbibranch:bank.bankBranches){
		System.out.println(sbibranch);
		
	}
	
	Bank bank1=new Bank();
	bank1.bankName="axis";
	bank1.bankid=2;
	bank1.bankBranches=axisbranches;
	bank1.ifscCode="sfnf254";
	bank1.banklocation="Bengalore";
	System.out.println("=============axis bank branches are ============");
	for(String bankBranch:bank1.bankBranches){
		
		System.out.println(bankBranch);
	}
	
}
}