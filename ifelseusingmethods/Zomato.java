class Zomato{

public static int search(String item){
int price=0;
if(item.equalsIgnoreCase("Veg Biryani")){
price=220;
}else if(item.equalsIgnoreCase("Chicken Biryani")){
price=280;
}else if(item.equalsIgnoreCase("Pizza")){
price=199;
}else if(item.equalsIgnoreCase("Burger")){
price=149;
}else if(item.equalsIgnoreCase("French Fries")){
price=99;
}else if(item.equalsIgnoreCase("Paneer Butter Masala")){
price=240;
}else if(item.equalsIgnoreCase("Butter Naan")){
price=40;
}else if(item.equalsIgnoreCase("Fried Rice")){
price=180;
}else if(item.equalsIgnoreCase("Noodles")){
price=170;
}else if(item.equalsIgnoreCase("Momos")){
price=120;
}else if(item.equalsIgnoreCase("Chicken Kabab")){
price=260;
}else if(item.equalsIgnoreCase("Gobi Manchurian")){
price=180;
}else if(item.equalsIgnoreCase("Pasta")){
price=190;
}else if(item.equalsIgnoreCase("Ice Cream")){
price=80;
}else if(item.equalsIgnoreCase("Soft Drink")){
price=50;
}else if(item.equalsIgnoreCase("Brownie")){
price=90;
}else if(item.equalsIgnoreCase("Garlic Bread")){
price=110;
}else if(item.equalsIgnoreCase("Sandwich")){
price=130;
}else if(item.equalsIgnoreCase("Dosa")){
price=85;
}else if(item.equalsIgnoreCase("Idli")){
price=50;
}else if(item.equalsIgnoreCase("Poori")){
price=70;
}else if(item.equalsIgnoreCase("Chapati")){
price=40;
}else if(item.equalsIgnoreCase("Meals")){
price=150;
}else if(item.equalsIgnoreCase("Curd Rice")){
price=90;
}else if(item.equalsIgnoreCase("Lemon Rice")){
price=100;
}else if(item.equalsIgnoreCase("Pulav")){
price=160;
}else if(item.equalsIgnoreCase("Coffee")){
price=40;
}else if(item.equalsIgnoreCase("Tea")){
price=20;
}else if(item.equalsIgnoreCase("Juice")){
price=70;
}else if(item.equalsIgnoreCase("Milk Shake")){
price=120;
}else{
System.out.println(item+"item Not Found");
}
return price;
}
public static int search(String item,int quantity){
int price=0;
if(item.equalsIgnoreCase("Veg Biryani")){
price=220*quantity;
}
else if(item.equalsIgnoreCase("Chicken Biryani")){
price=280*quantity;
}else if(item.equalsIgnoreCase("Pizza")){
price=199*quantity;
}else if(item.equalsIgnoreCase("Burger")){
price=149*quantity;
}else if(item.equalsIgnoreCase("French Fries")){
price=99*quantity;
}else if(item.equalsIgnoreCase("Paneer Butter Masala")){
price=240*quantity;
}else if(item.equalsIgnoreCase("Butter Naan")){
price=40*quantity;
}else if(item.equalsIgnoreCase("Fried Rice")){
price=180*quantity;
}else if(item.equalsIgnoreCase("Noodles")){
price=170*quantity;
}else if(item.equalsIgnoreCase("Momos")){
price=120*quantity;
}else if(item.equalsIgnoreCase("Chicken Kabab")){
price=260*quantity;
}else if(item.equalsIgnoreCase("Gobi Manchurian")){
price=180*quantity;
}else if(item.equalsIgnoreCase("Pasta")){
price=190*quantity;
}else if(item.equalsIgnoreCase("Ice Cream")){
price=80*quantity;
}else if(item.equalsIgnoreCase("Soft Drink")){
price=50*quantity;
}else if(item.equalsIgnoreCase("Brownie")){
price=90*quantity;
}else if(item.equalsIgnoreCase("Garlic Bread")){
price=110*quantity;
}else if(item.equalsIgnoreCase("Sandwich")){
price=130*quantity;
}else if(item.equalsIgnoreCase("Dosa")){
price=85*quantity;
}else if(item.equalsIgnoreCase("Idli")){
price=50*quantity;
}else if(item.equalsIgnoreCase("Poori")){
price=70*quantity;
}else if(item.equalsIgnoreCase("Chapati")){
price=40*quantity;
}else if(item.equalsIgnoreCase("Meals")){
price=150*quantity;
}else if(item.equalsIgnoreCase("Curd Rice")){
price=90*quantity;
}else if(item.equalsIgnoreCase("Lemon Rice")){
price=100*quantity;
}else if(item.equalsIgnoreCase("Pulav")){
price=160*quantity;
}else if(item.equalsIgnoreCase("Coffee")){
price=40*quantity;
}else if(item.equalsIgnoreCase("Tea")){
price=20*quantity;
}else if(item.equalsIgnoreCase("Juice")){
price=70*quantity;
}else if(item.equalsIgnoreCase("Milk Shake")){
price=120*quantity;
}else{
System.out.println(item+"item Not Found");
}
return price;
}
public static void main(String[] args){
String item="Pizza";
int price=search(item);
System.out.println("The Price of "+item+" is "+price);
int totalPrice=search(item,3);
System.out.println("The Price of "+item+" total price is "+totalPrice);
}
}