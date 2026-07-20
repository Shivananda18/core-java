class cc_camera{
	
public static String getbrandname(){
	return "MANOMAY 3MP WiFi CCTV Bullet Camera";
}
public static String getspecialFeatures(){
	return "10X Digital Zoom Camera for detailed monitoring, 3MP HD WiFi CCTV Camera with clear video quality (2304×1296 resolution), AI Human Detection CCTV Camera with instant mobile alerts, BIS-ER (STQC Certified) CCTV Camera for trusted and government-approved security, Full Color Night Vision Camera for 24/7 day & night monitoring";
}
public static String  getcompatibleDevices(){
	return "Smartphone";
}
public static String getcontrollertype(){
	return "App";
}
public static long getcameraprice(){
	return 15000;
}
	public static void main(String[]cc){
		String name=getbrandname();
		System.out.println(name);
		
		String feature=getspecialFeatures();
		System.out.println(feature);
		
		String device=getcompatibleDevices();
		System.out.println(device);
		
		String type=getcontrollertype();
		System.out.println(type);
		
		long price=getcameraprice();
		System.out.println(price);
	}
}
