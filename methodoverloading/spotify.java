class spotify {
    public static void login(String email, String password){
        System.out.println("Login using Email");
        System.out.println("Email    : " + email);
        System.out.println("Password : " + password);
    }
    public static void login(long mobile, int otp){
        System.out.println("Login using Mobile");
        System.out.println("Mobile : " + mobile);
        System.out.println("OTP    : " + otp);
    }
    public static void login(String googleEmail){
        System.out.println("Login using Google");
        System.out.println("Google Email : " + googleEmail);
    }
    public static void login(String facebookId, boolean facebookLogin){
        System.out.println("Login using Facebook");
        System.out.println("Facebook ID : " + facebookId);
        System.out.println("Login Status: " + facebookLogin);
    }
    public static void main(String[] args){

        login("shivu@gmail.com", "Shivu@123");
        System.out.println();
        login(9876543210L, 456789);
        System.out.println();
        login("shivu@gmail.com");
        System.out.println();
        login("shivu.T",true);
    }
}