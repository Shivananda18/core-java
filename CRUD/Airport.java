class Airport{
	static String passengerFirstName;
	static String passengerLastName;
	static long passengerMobileNumber;
	static String passengerEmail;
	static String passengerDestination;
	static String passengerId;
	static String passengerFlightClass;
	static int passengerAge;

	public static boolean bookTicket(String fname,String lname,long mob,String eid,String destination,String id,String flightClass,int age){
		boolean isBooked;
		passengerFirstName = fname;
		passengerLastName = lname;
		passengerMobileNumber = mob;
		passengerEmail = eid;
		passengerDestination = destination;
		passengerId = id;
		passengerFlightClass = flightClass;
		passengerAge = age;
		isBooked = true;
		return isBooked;
	}

	public static void getPassengerDetails(){
		System.out.println("Passenger First Name is : " + passengerFirstName);
		System.out.println("Passenger Last Name is : " + passengerLastName);
		System.out.println("Passenger Mobile Number is : " + passengerMobileNumber);
		System.out.println("Passenger Email is : " + passengerEmail);
		System.out.println("Passenger Destination is : " + passengerDestination);
		System.out.println("Passenger ID is : " + passengerId);
		System.out.println("Passenger Flight Class is : " + passengerFlightClass);
		System.out.println("Passenger Age is : " + passengerAge);
	}
}