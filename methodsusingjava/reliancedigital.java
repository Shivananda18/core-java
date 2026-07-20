class reliancedigital{
	public static void getsearch(String product){
		System.out.println("the product name is..."+product);
		System.out.println(product);
	}
	public static void getfilter(String brandname,String available,int price,String discount,String internalstorage,String size,String model,String proccessor,String operatingsystemtype,String displaytype){
	System.out.println("the filter of the mobile phones opton");
System.out.println("the brand names is..."+brandname);
System.out.println("the available is..."+available);
System.out.println("the price is.."+price);
System.out.println("the discount is.."+discount);
System.out.println("the internal storage is.."+internalstorage);
System.out.println("the size is.."+size);
System.out.println("the model is.."+model);	
System.out.println("the displaytype is.."+displaytype);
System.out.println("the proccessor is.."+proccessor);
System.out.println("the operatingsystemtype is.."+operatingsystemtype);
	}
	public static void main(String[]a){
		getsearch("MOBILE PHONES");
		getfilter("iphone","available",50000,"40%","128GB","17.53 cm - 6.9 inch","pro","Dimensity 6300","ios","HD+");
	}
}