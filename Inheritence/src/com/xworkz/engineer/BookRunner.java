package com.xworkz.engineer;

import com.xworkz.engineer.book.Book;

public class BookRunner {
    public static void main(String[] args) {

     /*   Book book = new Book();
        book.bookId = 1;
        book.bookName = "Verity";
        book.author = "Colleen Hoover";
        book.price = 220;


        Book book1=new Book();
        book1.bookId = 1;
        book1.bookName = "Verity";
        book1.price = 220;
        book1.author = "Colleen Hoover";


        System.out.println(book.equals(book1));
*/

        Book book=new Book();
        book.setBookName("verity");
        System.out.println("bookName : "+book.getBookName());

        book.setBookId(2);
        System.out.println("Book ID : "+book.getBookId());

        book.setAuthor("colleen Hoover");
        System.out.println("author  : "+book.getAuthor());

        book.setPrice(500.0);
        System.out.println(""+book.getPrice());

        Book book1=new Book();
        book1.setBookId(2);
        System.out.println(book1.getBookId());

        book1.setBookName("jungle Book");
        System.out.println("book Name : "+book.getBookName());

        book1.setPrice(600.0);
        System.out.println("Book Price : "+ book1.getPrice());

        book1.setAuthor("Rudyard Kipling");
        System.out.println("Book Author Name : "+book1.getAuthor());


        System.out.println("book and Book1 are same : "+book.equals(book1));

        System.out.println("book hash value : "+book.hashCode());
        System.out.println("book1 hash value : "+book1.hashCode());

        System.out.println("book address : "+book);
        System.out.println("book1 address : "+book1);
    }























        /*
        System.out.println(book.equals(book1));//false because book and book1 are different address

        String str="shivu";
        String str1="shivu";

       // System.out.println("str and str1 are same : "+str.equals(str1));
     //   System.out.println("str and str1 are same : "+(str==str1));

      String str2="shivu";
     String str3="shivu";





        System.out.println(str2==str3);

       Book book4=new Book();
       book4.bookName="xyz";
       //String str2=new String();
       //String str3=new String();
        System.out.println(str2==str3);//same address give true
        System.out.println(str2.equals(str3));//same address and same value gives true

        System.out.println(str2.equals(book4.bookName));//different address and different value gives false
        System.out.println(str2==book.str3);//different address gives false



        Book book2=new Book();
        book2.bookName="verity";

        System.out.println("shivu and bookname are same : "+str2==book2.bookName);//== compare the address or location here str2 and str3=false
        System.out.println("shivu and pradee are same : "+str2.equals(str3));//equals() -->compare the value at same address or location then it returns true or if the values are same but values at different location then it returns false

        System.out.println("book ans book2 are same : "+book.equals(book2));
        System.out.println(book==book1);// false because memory location are different

        String str6=new String("shivu");
        String str7=new String("pradee");

        System.out.println(str6.equals(str7));
        System.out.println(str6==str7);

        Book book1=new Book();
        System.out.println(book.equals(book1));
        System.out.println(book==book1);
        System.out.println(str6.equals(book));




        Book.getbook("pradeep");
        Book book=new Book();
        book.getbook();
        book.getbook("shivu");
        System.out.println();



 */
    }

