class Showroom{
	static String showroomName;
	static String customerName;
	static String vehicleName;
	static String vehicleModel;
	static String vehicleColor;
	static double vehiclePrice;
	static long mobileNo;
	static String address;

	public static boolean createShowroom(String sName,String cName,String vName,String vModel,String vColor,double price,long phone,String addr){
		boolean isCreated=false;

		showroomName=sName;
		customerName=cName;
		vehicleName=vName;
		vehicleModel=vModel;
		vehicleColor=vColor;
		vehiclePrice=price;
		mobileNo=phone;
		address=addr;

		isCreated=true;
		return isCreated;
	}

	public static void getShowroomDetails(){
		System.out.println("Showroom Name:"+showroomName);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Vehicle Name:"+vehicleName);
		System.out.println("Vehicle Model:"+vehicleModel);
		System.out.println("Vehicle Color:"+vehicleColor);
		System.out.println("Vehicle Price:"+vehiclePrice);
		System.out.println("Mobile No:"+mobileNo);
		System.out.println("Address:"+address);
	}
}