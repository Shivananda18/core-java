class instagram{
	
	public static void getlogin(String email,String mobilenumber,String password){
		System.out.println(email);
		System.out.println(password);
		System.out.println(mobilenumber);
	}
	public static void forgetpassword(String mobileNumber,String email){
	System.out.println(mobileNumber);
System.out.println(email);	

}
public static void getcreateaccount(String Name,String username,String dob,String password ){
System.out.println("crating account...");
System.out.println(Name);
System.out.println(username);
System.out.println(dob);
System.out.println(password);
	
	
}
	public static void main(String[]arrays){
		getlogin("shivu@gamil.com ","shivu@123","mobileNumber");
		forgetpassword("5455161 ","shivu@1234 ");
		getcreateaccount("shivananda","shivu","25/10/2003","646466@gerg");
		
	}
	
}