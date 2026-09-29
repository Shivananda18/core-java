class MobileRecharge{
    static String customerFirstName;
    static String customerLastName;
    static long customerMobileNumber;
    static String customerEmail;
    static String rechargePlan;
    static String rechargeId;
    static String networkProvider;
    static int rechargeAmount;

    public static boolean rechargeMobile(String fname,String lname,long mob,String eid,String plan,String id,String provider,int amount){
        boolean isRecharged;
        customerFirstName = fname;
        customerLastName = lname;
        customerMobileNumber = mob;
        customerEmail = eid;
        rechargePlan = plan;
        rechargeId = id;
        networkProvider = provider;
        rechargeAmount = amount;
        isRecharged = true;
        return isRecharged;
    }

    public static void getCustomerDetails(){
        System.out.println("Customer First Name is : " + customerFirstName);
        System.out.println("Customer Last Name is : " + customerLastName);
        System.out.println("Customer Mobile Number is : " + customerMobileNumber);
        System.out.println("Customer Email is : " + customerEmail);
        System.out.println("Recharge Plan is : " + rechargePlan);
        System.out.println("Recharge ID is : " + rechargeId);
        System.out.println("Network Provider is : " + networkProvider);
        System.out.println("Recharge Amount is : " + rechargeAmount);
    }
}