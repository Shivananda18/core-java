class pizzaHut{
	
public static int getsearch(String item){
	int price=0;
	if(item=="fiery schezwan veggie"){
		price=329;
	}else if(item=="smokey bbq veggie"){
		price=329;
	}else if(item=="paneer makni masala"){
		price=359;
	}else if(item=="overloaded veggies"){
		price=359;
	}else if(item=="keema masala"){
		price=399;
	}else if(item=="ultimate"){
		price=399;
	}else if(item=="tandoori chicken"){
		price=399;
	}else if(item=="margherita ultimate cheese"){
		price=188;
	}else if(item=="chicken sausage"){
		price=278;
	}else if(item=="chicken tikka"){
		price=438;
	}else if(item=="tandoori paneer ultimate cheese"){
		price=398;
	}else if(item=="veggie supreme"){
		price=398;
	}else if(item=="triple chicken feast"){
		price=458;
	}else if(item=="veggie feast"){
		price=209;
	}else if(item=="veggie supreme"){
		price=398;
	}else if(item=="margherita"){
		price=109;
	}else if(item=="classic onion capsicum"){
		price=99;
	}else if(item=="ultimate tandoori veggie"){
		price=369;
	}else if(item=="mazedar makni panner"){
		price=369;
	}else if(item=="nawabi murg makhi"){
		price=379;
	}else if(item=="chicken supreme"){
        price=359;
	}else if(item=="chicken tikka supreme"){
        price=379;
	}else if(item=="triple chicken feast"){
        price=370;
	}else if(item=="bold bbq veggies"){
        price=289;
	}else if(item=="maxican fiesta"){
        price=289;
	}else if(item=="tandoori paneer"){
        price=319;
	}else if(item=="country feast"){
        price=289;
	}else if(item=="murg malai chicken"){
        price=250;
	}else if(item=="chicken tikka "){
        price=359;
	}else if(item=="chicken pepperoni"){
        price=359;
	}else{
		System.out.println(item+"item not found");
	}
	return price;
}
	public static int getsearch(String item,int quantity){
	int price=0;
	if(item=="fiery schezwan veggie"){
		price=329*quantity;
	}else if(item=="smokey bbq veggie"){
		price=329*quantity;
	}else if(item=="paneer makni masala"){
		price=359*quantity;
	}else if(item=="overloaded veggies"){
		price=359*quantity;
	}else if(item=="keema masala"){
		price=399*quantity;
	}else if(item=="ultimate"){
		price=399*quantity;
	}else if(item=="tandoori chicken"){
		price=399*quantity;
	}else if(item=="margherita ultimate cheese"){
		price=188*quantity;
	}else if(item=="chicken sausage"){
		price=278*quantity;
	}else if(item=="chicken tikka"){
		price=438*quantity;
	}else if(item=="tandoori paneer ultimate cheese"){
		price=398*quantity;
	}else if(item=="veggie supreme"){
		price=398*quantity;
	}else if(item=="triple chicken feast"){
		price=458*quantity;
	}else if(item=="veggie feast"){
		price=209*quantity;
	}else if(item=="veggie supreme"){
		price=398*quantity;
	}else if(item=="margherita"){
		price=109*quantity;
	}else if(item=="classic onion capsicum"){
		price=99*quantity;
	}else if(item=="ultimate tandoori veggie"){
		price=369*quantity;
	}else if(item=="mazedar makni panner"){
		price=369*quantity;
	}else if(item=="nawabi murg makhi"){
		price=379*quantity;
	}else if(item=="chicken supreme"){
        price=359*quantity;
	}else if(item=="chicken tikka supreme"){
        price=379*quantity;
	}else if(item=="triple chicken feast"){
        price=370*quantity;
	}else if(item=="bold bbq veggies"){
        price=289*quantity;
	}else if(item=="maxican fiesta"){
        price=289*quantity;
	}else if(item=="tandoori paneer"){
        price=319*quantity;
	}else if(item=="country feast"){
        price=289*quantity;
	}else if(item=="murg malai chicken"){
        price=250*quantity;
	}else if(item=="chicken tikka "){
        price=359*quantity;
	}else if(item=="chicken pepperoni"){
        price=359*quantity;
	}else{
		System.out.println(item+"item not found");
	}
	return price;
}
	public static void main (String[]a){
    String pizza="fiery schezwan veggie";
    int item = getsearch(pizza);
    int quantity=getsearch(pizza,3);
    System.out.println("The pizza "+pizza+" price is : "+quantity);

    String pizza1="murg malai chicken";
    int item1=getsearch(pizza1);
    int quantity1=getsearch(pizza1,2);
    System.out.println("The pizza "+pizza1+" price is : "+quantity1);

    String pizza2="paneer makni masala";
    int item2=getsearch(pizza2);
    int quantity2=getsearch(pizza2,4);
    System.out.println("The pizza "+pizza2+" price is : "+quantity2);

    String pizza3="keema masala";
    int item3=getsearch(pizza3);
    int quantity3=getsearch(pizza3,2);
    System.out.println("The pizza "+pizza3+" price is : "+quantity3);

    String pizza4="tandoori chicken";
    int item4=getsearch(pizza4);
    int quantity4=getsearch(pizza4,5);
    System.out.println("The pizza "+pizza4+" price is : "+quantity4);

    String pizza5="margherita";
    int item5=getsearch(pizza5);
    int quantity5=getsearch(pizza5,6);
    System.out.println("The pizza "+pizza5+" price is : "+quantity5);

    String pizza6="classic onion capsicum";
    int item6=getsearch(pizza6);
    int quantity6=getsearch(pizza6,4);
    System.out.println("The pizza "+pizza6+" price is : "+quantity6);

    String pizza7="ultimate tandoori veggie";
    int item7=getsearch(pizza7);
    int quantity7=getsearch(pizza7,3);
    System.out.println("The pizza "+pizza7+" price is : "+quantity7);

    String pizza8="chicken supreme";
    int item8=getsearch(pizza8);
    int quantity8=getsearch(pizza8,2);
    System.out.println("The pizza "+pizza8+" price is : "+quantity8);

    String pizza9="chicken sausage";
    int item9=getsearch(pizza9);
    int quantity9=getsearch(pizza9,7);
    System.out.println("The pizza "+pizza9+" price is : "+quantity9);
}
	}
