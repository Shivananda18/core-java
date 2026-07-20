class zomato{
public static long getsearch(String item){
	long price=123L;
	System.out.println("the price of "+item+" is  "+price);
	return price;
}
public static void getaddress(String city,String circle,String road){
	System.out.println(city);
	System.out.println(circle);
	System.out.println(road);
}
public static void getadditemscart(String items){
	System.out.println("add the items to cart is...");
	System.out.println(items);
	
}

public static void main(String[]a){
	
	String anything="burger";
   getsearch(anything);
   getaddress("bengalore","bashyam circle","Rajijinagar");
   String items="pizza";
   getadditemscart(items);
   	
}


}