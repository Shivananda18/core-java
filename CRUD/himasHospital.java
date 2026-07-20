class himasHospital{
	static String customerFirstName;
	static String customerLastName;
	static long customerMobileNumber;
	static String customerEmail;
	static String customerMsg;
	static String customerId;
	static String customerBloodGroup;
	static int  customerAge;
	
	public static boolean bookConsultation(String fname,String lname,long mob,String eid,String msg,String id,String bloodgroup,int  age){
		boolean isbooked = false;
		
		
		  boolean isCustomerFirstNameValid = false;
		  boolean isCustomerLastNameValid =false;
		  boolean isCustomerMobileNumberValid=false;
		  boolean isCustomerEmailValid=false;
		  boolean iscustomermessagevalid=false;
		  boolean iscustomeridvalid=false;
		  boolean iscustomerbloodgroupvalid=false;
		  boolean iscustomerAgevalid=false;
		
		if(fname!=null){
		customerFirstName=fname;
		isCustomerFirstNameValid = true;
		
		
		}else System.out.println("invalid customer first name");
		
		
	if(lname!=null){
		customerLastName=lname;
		isCustomerLastNameValid= true;
	}else System.out .println("invalid customer last name");
	
	if(mob!=0){
		customerMobileNumber=mob;
		isCustomerEmailValid=true;
	}else System.out.println("invalid customer mobile number");
	
	if(eid!=null){
		customerId=eid;
		isCustomerEmailValid=true;
	}else System.out.println("invalid customer emailid");
	
	if(msg!=null){
		customerMsg=msg;
		isbooked=true;
	}else System.out.println("invalid customer msg");
	
	if(id!=null){
		customerId=id;
		iscustomermessagevalid=true;
	}else System.out.println("invalid customer id");
	
	if(bloodgroup!=null){
		customerBloodGroup=bloodgroup;
iscustomerbloodgroupvalid=true;
	}else System.out.println("invalid blood group");

if(age>5){	
		customerAge=age;
}else System.out.println("invalid customer age");
		iscustomerAgevalid=true;
		return isbooked;
	if(isCustomerFirstNameValid==true && isCustomerLastNameValid==true && customerMobileNumber==true && isCustomerEmailValid==true && iscustomermessagevalid==true && iscustomeridvalid==true && iscustomerbloodgroupvalid==true && iscustomerAgevalid==true){
		isbooked=true;
	}
	}
	public static void getCustomerDetails(){
		System.out.println("customer First Name is : "+customerFirstName);
		System.out.println("customer Last Name is : "+customerLastName);
		System.out.println("customer Mobile Number is : "+customerMobileNumber);
		System.out.println("customer email is : "+customerEmail);
		System.out.println("customer message is : "+customerMsg);
		System.out.println("customerId is : "+customerId);
		System.out.println("customerBloodGroup is : "+customerBloodGroup);
		System.out.println("customerAge is : "+customerAge);
	}
}