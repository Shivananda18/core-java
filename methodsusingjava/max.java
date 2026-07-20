class max{
	
	public static void createProfile(String firstname,String lastname,long mobilenumber,String email,String dob,String gender){
		System.out.println("creating a profile...");
		System.out.println(firstname+" "+lastname+" ");
		System.out.println(mobilenumber);
		System.out.println(email);
		System.out.println(dob);
		System.out.println(gender);
	}
	public static void main(String[]a){
		createProfile("shivu","T",776885,"shivu@123","25/10/2003","male");
	}
}