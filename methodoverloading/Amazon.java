class Amazon {
    public static void login(String email, String password){
        System.out.println("Login using Email");
    }
    public static void login(long mobile, int otp){
        System.out.println("Login using Mobile Number");
    }
    public static void login(String email){
        System.out.println("Login using OTP sent to Email");
    }
    public static void main(String[] args){
        login("shivu@gmail.com", "amazon123");
        login(7760291885L, 123456);
        login("shivu@gmail.com");
    }
}