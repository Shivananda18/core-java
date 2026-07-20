class dmart{
	public static int getdeliverylocation(String searchforarea,String streetname){
		System.out.println("the delivery location is ..."+searchforarea+", "+streetname);
		int pincode=65465;
		return pincode;
	}
	public static void getsearch(String items){
		System.out.println("searching items is.."+items);
		
	}
	public static long getregister(){
		System.out.println("register");
		System.out.println("");
		long number=291885;
		return number;
	}
	public static void main(String[]a){
		getdeliverylocation("bengalore","mjroad");
		getsearch("mixer");
		
	}
}