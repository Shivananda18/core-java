class spotyfy{
	public static void getsignup(String email,long mobilenumber,String google,String apple){
	System.out.println("sign-up with using   "+email+"   mobile number "+mobilenumber+"   google account  "+google+"apple account "+apple);	
	}
	public static void getlogin(String email){
		System.out.println("login using gamil..  "+email);
	}
	public static void getsearch(String songs){
		System.out.println("you searched song is ..."+songs);
		
	}
	public static void getplaysong(String play){
		System.out.println("your "+play);
		
	}
	public static void main(String[]a){
		getsignup("shivu@gmail.com",54494,"jdfdhwih@gamil.com","djfbjaf@gmail.com");
		getlogin("Shivu123@gamil.com");
		getsearch("Raga of Revange");
		getplaysong("Raga of Revange is playing");
	}
}