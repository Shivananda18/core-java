class bankofbaroda{
	public static void getsearch(String information){
				System.out.println("first info is..");
						System.out.println(information);
	}
	public static void getloans(String loan1,String loan2,String loan3,String loan4){
		System.out.println("bank of baroda loans is");
		System.out.println(loan1);
		System.out.println(loan2);
		System.out.println(loan3);
		System.out.println(loan4);	
	}
	public static void getaccount(String account1,String account2,String account3,String account4){
	System.out.println("bank of baroda accounts is ");
	System.out.println(account1);
	System.out.println(account2);
    System.out.println(account3);
    System.out.println(account4);	
	}
	public static void getothers(String other1,String other2,String other3,String other4){
		System.out.println("bank of baroda others is ...");
		System.out.println(other1);
		System.out.println(other2);
		System.out.println(other3);
		System.out.println(other4);
	}
	public static void main(String[]a){
		String array[]={"loan ","account","others"};
		for(String arra:array){
			System.out.println(arra);
		
		getsearch(arra);
		}
		getloans("personal loan","car loan","education loan","home loan");
		getaccount("saving account","current account","fixed deposite","B3 silver account");
        getothers("atm & Branches","others","credit card","debit card");	
	}
}