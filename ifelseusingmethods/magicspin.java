class magicspin{
 public static int getsearch(String food){
	 int price=0;
	 if(food=="biriyani rice"){
		 price=160; 
	 }else if(food=="french fries"){
		 price=160;
	 }else if(food=="peri peri fries"){
		 price=160;
	 }else if(food=="hydrabad biriyani"){
		 price=170;
	 }else if(food=="egg pakoda"){
		 price=88;
	 }else if(food=="smooky tandoori aloo"){
		 price=116;
	 }else if(food=="crispy onion relaoded rings"){
		 price=136;
	 }else if(food=="golden crunch gobi"){
		 price=136;
	 }else if(food=="peri perifried rice"){
		 price=136;
	 }else if(food=="bbq pineapple bites"){
		 price=159;
	 }else if(food=="grilled paneer bites"){
		 price=189;
	 }else if(food=="tandoori trio combo veg"){
		 price=245;
	 }else if(food=="tandoori trio combo non_veg"){
		 price=275;
	 }else if(food=="veg dum biriyani"){
		 price=309;
	 }else if(food=="extra raitha"){
		 price=18;
	 }else if(food=="extra gravy"){
		 price=27;
	 }else if(food=="butter naan"){
		 price=54;
	 }else if(food=="chicken boneless"){
		 price=198;
	 }else if(food=="veg briyani rice"){
		 price=212;
	 }else if(food=="gulaab jamun"){
		 price=42;
	 }else if(food=="chapati"){
		 price=46;
	 }else if(food=="kulcha"){
		 price=58;
	 }else if(food=="flavourful Rice"){
		 price=64;
	 }else if(food=="extra papad"){
		 price=12;
	 }else if(food=="ghee gulb jamun"){
	 price=69;
	 }else if(food=="rasam"){
		 price=89;
	 }else if(food=="plain rice"){
		 price=89;
	 }else if(food=="vegetable sambar"){
		 price=149;
	 }else if(food=="egg biriyani"){
		 price=120;
	 }else if(food=="golden crunch gobi"){
		 price=120;
	 }else if(food=="andhra voicano chiken"){
		 price=138;
 }else{
	 System.out.println(food+"item not found");
 }
 return price;
 }
	 public static int getsearch(String food,int quality){
		  int quantity=0;
		  int price=0;
		  if(food=="biriyani rice"){
		 price=160*quality; 
	 }else if(food=="french fries"){
		 price=160*quality;
	 }else if(food=="peri peri fries"){
		 price=160*quality;
	 }else if(food=="hydrabad biriyani"){
		 price=170*quality;
	 }else if(food=="egg pakoda"){
		 price=88*quality;
	 }else if(food=="smooky tandoori aloo"){
		 price=116*quality;
	 }else if(food=="crispy onion relaoded rings"){
		 price=136*quality;
	 }else if(food=="golden crunch gobi"){
		 price=136*quality;
	 }else if(food=="peri perifried rice"){
		 price=136*quality;
	 }else if(food=="bbq pineapple bites"){
		 price=159*quality;
	 }else if(food=="grilled paneer bites"){
		 price=189*quality;
	 }else if(food=="tandoori trio combo veg"){
		 price=245*quality;
	 }else if(food=="tandoori trio combo non_veg"){
		 price=275*quality;
	 }else if(food=="veg dum biriyani"){
		 price=309*quality;
	 }else if(food=="extra raitha"){
		 price=18*quality;
	 }else if(food=="extra gravy"){
		 price=27*quality;
	 }else if(food=="butter naan"){
		 price=54*quality;
	 }else if(food=="chicken boneless"){
		 price=198*quality;
	 }else if(food=="veg briyani rice"){
		 price=212*quality;
	 }else if(food=="gulaab jamun"){
		 price=42*quality;
	 }else if(food=="chapati"){
		 price=46*quality;
	 }else if(food=="kulcha"){
		 price=58*quality;
	 }else if(food=="flavourful Rice"){
		 price=64*quality;
	 }else if(food=="extra papad"){
		 price=12*quality;
	 }else if(food=="ghee gulb jamun"){
	 price=69*quality;
	 }else if(food=="rasam"){
		 price=89*quality;
	 }else if(food=="plain rice"){
		 price=89*quality;
	 }else if(food=="vegetable sambar"){
		 price=149*quality;
	 }else if(food=="egg biriyani"){
		 price=120*quality;
	 }else if(food=="golden crunch gobi"){
		 price=120*quality;
	 }else if(food=="andhra voicano chicken"){
		 price=138*quality;
	 }else{
		 System.out.println(food+"item not found");
	 }
	 return price;
	 }
public static void main(String[]a){
	String food="egg biriyani";
	int item=getsearch(food);
	int quality=getsearch(food,2);
	System.out.println("the food "+food+" price is : "+quality);
	
	String food1="golden crunch gobi";
	int item1=getsearch(food1);
	int quality1=getsearch(food1,3);
	System.out.println("the item "+food1+" price is : "+quality1);
	
	String food2="veg dum biriyani";
	int item2=getsearch(food2);
	int quality2=getsearch(food2,4);
	System.out.println("the item "+food2+" price is : " +quality2);
	
	String food3="butter naan";
	int item3=getsearch(food3);
	int quality3=getsearch(food3,5);
	System.out.println("the item "+food3+"price is : "+quality3);
	
	String food4="egg pakoda";
	int item4=getsearch(food4);
	int quality4=getsearch(food4,6);
	System.out.println("the item "+food4+"price is : "+quality4);
	
	String food5="french fries";
	int item5=getsearch(food5);
	int quality5=getsearch(food5,8);
	System.out.println("the item "+food5+"price is : "+quality5);
	
	String food6="kulcha";
	int item6=getsearch(food6);
	int quality6=getsearch(food6,8);
	System.out.println("the item "+food6+"price is : "+quality6);
}
}