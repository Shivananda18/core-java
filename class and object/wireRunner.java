class wireRunner{

public static void main(String[] a){
wire wire=new wire();
wire.wireBrand="havells";
wire.price=500.0;

String brand=wire.wireBrand;
double price=wire.price;

System.out.println("wire brand name is : "+brand);
System.out.println("wire price is : "+price);

wire wire1=new wire();
wire1.wireBrand="finolex";
wire1.price=100.12;

String wirebrand1=wire1.wireBrand;
double price1=wire1.price;

System.out.println("wire brand name is : "+wirebrand1);
System.out.println("wire prie is : "+price1);

wire wire2=new wire();
wire2.wireBrand="RM";
wire2.price=250.0;

String wirebrand2=wire2.wireBrand;`
double price2=wire2.price;

System.out.println("wire brand name is : "+wirebrand2);
System.out.println("wire price is : "+price2);


}
}