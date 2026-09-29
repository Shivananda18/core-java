class policeStation{
    static String complainanterFirstName;
    static String complainanterLastName;
    static long complainanterMobileNumber;
    static String complaint;
    static String complainterAdress;
    static String policeStationName;
    static int complainanterAge;
    public static boolean savefileComplaint(String fname,String lname,long mob,String complaintDetails,String complaintadress,String stationName,int age){
        boolean isComplaintFiled;
        complainanterFirstName = fname;
        complainanterLastName = lname;
        complainanterMobileNumber = mob;
        complaint = complaintDetails;
        complainterAdress = complaintadress;
        policeStationName = stationName;
        complainanterAge = age;
        isComplaintFiled = true;
		
        return isComplaintFiled;
    }
    public static void getComplaintDetails(){
        System.out.println("Complainant First Name is : " + complainanterFirstName);
        System.out.println("Complainant Last Name is  : " + complainanterLastName);
        System.out.println("Mobile Number  is : " + complainanterMobileNumber);
        System.out.println("Complaint is : " + complaint);
        System.out.println("Complaint Adress is : " + complainterAdress);
        System.out.println("Police Station Name  is  : " + policeStationName);
        System.out.println("Complainant Age is  : " + complainanterAge);
    }
}