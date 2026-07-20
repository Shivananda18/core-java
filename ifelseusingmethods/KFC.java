class KFC{

    public static int getsearch(String item){
        int price=0;
        if(item=="classic zinger burger"){
            price=199;
        } else if(item =="chicken zinger burger"){
            price =219;
        } else if(item =="veg zinger burger"){
            price=189;
        } else if(item =="hot & crispy chicken"){
            price=199;
        } else if(item =="hot wings"){
            price =199;
        } else if(item =="chicken popcorn"){
            price=129;
        } else if(item=="chicken strips"){
            price = 179;
        } else if(item =="tandoori zinger burger"){
            price = 229;
        } else if(item =="chicken roll"){
            price = 169;
        } else if(item =="veg roll"){
            price =149;
        } else if(item =="ultimate savings bucket"){
            price =699;
        } else if(item =="all in one bucket"){
            price =549;
        } else if(item =="classic zinger box"){
            price =399;
        } else if(item =="popcorn rice bowl"){
            price =229;
        } else if(item=="chicken rice bowl"){
            price =249;
        } else if (item =="french fries"){
            price =109;
        } else if (item =="pepsi"){
            price =60;
        } else if (item =="choco lava cake"){
            price =99;
        } else if (item =="chocolate mud pie"){
            price =129;
        } else {
            System.out.println(item + " item not found");
        }
        return price;
    }
    public static int getsearch(String item, int quantity){
        int price = 0;
        if (item == "classic zinger burger"){
            price = 199*quantity;
        } else if (item == "chicken zinger burger"){
            price = 219*quantity;
        } else if (item =="veg zinger burger"){
            price = 189*quantity;
        } else if (item =="hot & crispy chicken"){
            price = 199*quantity;
        } else if (item=="hot wings"){
            price = 199*quantity;
        } else if (item =="chicken popcorn"){
            price = 129*quantity;
        } else if (item =="chicken strips"){
            price = 179*quantity;
        } else if (item =="tandoori zinger burger"){
            price = 229*quantity;
        } else if (item =="chicken roll"){
            price = 169*quantity;
        } else if (item =="veg roll"){
            price = 149*quantity;
        } else if (item =="ultimate savings bucket"){
            price = 699*quantity;
        } else if (item=="all in one bucket"){
            price = 549 *quantity;
        } else if (item=="classic zinger box"){
            price = 399*quantity;
        } else if (item =="popcorn rice bowl"){
            price = 229*quantity;
        } else if (item=="chicken rice bowl"){
            price = 249*quantity;
        } else if (item=="french fries"){
            price = 109*quantity;
        } else if (item == "pepsi"){
            price = 60*quantity;
        } else if (item == "choco lava cake"){
            price = 99*quantity;
        } else if (item == "chocolate mud pie"){
            price = 129*quantity;
        } else {
            System.out.println(item + " item not found");
        }
        return price;
    }
    public static void main(String[] args) {

        String item = "classic zinger burger";
        int total = getsearch(item, 2);
        System.out.println("The item "+item+" price is : "+total);

        String item1 = "chicken popcorn";
        int total1 = getsearch(item1, 3);
        System.out.println("The item "+item1+" price is : "+total1);

        String item2 = "ultimate savings bucket";
        int total2 = getsearch(item2, 1);
        System.out.println("The item "+item2+" price is : "+total2);

        String item3 = "hot wings";
        int total3 = getsearch(item3, 4);
        System.out.println("The item "+item3+" price is : "+total3);

        String item4 = "choco lava cake";
        int total4 = getsearch(item4, 5);
        System.out.println("The item "+item4+" price is : "+total4);

        String item5 = "pepsi";
        int total5 = getsearch(item5, 2);
        System.out.println("The item "+item5+" price is : "+total5);

        String item6 = "french fries";
        int total6 = getsearch(item6, 3);
        System.out.println("The item "+item6+" price is : "+ total6);
    }
}