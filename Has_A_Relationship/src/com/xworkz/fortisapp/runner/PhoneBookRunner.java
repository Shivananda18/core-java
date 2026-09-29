package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.phoneBook.PhoneBook;
import com.xworkz.fortisapp.phoneBook.contact.Contact;

public class PhoneBookRunner {

    public static void main(String[] args) {

        PhoneBook phoneBook=new PhoneBook();

        Contact contact1 = new Contact();
        contact1.setContactId(1);
        contact1.setContactName("Shivu");
        contact1.setContactNumber(7760291885L);
        contact1.setContactOrigin("India");
        phoneBook.addContacts(contact1);

        Contact contact2 = new Contact();
        contact2.setContactId(2);
        contact2.setContactName("Rahul");
        contact2.setContactNumber(9876543210L);
        contact2.setContactOrigin("India");
        phoneBook.addContacts(contact2);

        Contact contact3 = new Contact();
        contact3.setContactId(3);
        contact3.setContactName("Kiran");
        contact3.setContactNumber(9845012345L);
        contact3.setContactOrigin("India");
        phoneBook.addContacts(contact3);

        Contact contact4 = new Contact();
        contact4.setContactId(4);
        contact4.setContactName("Arun");
        contact4.setContactNumber(9987654321L);
        contact4.setContactOrigin("India");
        phoneBook.addContacts(contact4);

        Contact contact5 = new Contact();
        contact5.setContactId(5);
        contact5.setContactName("Vijay");
        contact5.setContactNumber(9900123456L);
        contact5.setContactOrigin("India");
        phoneBook.addContacts(contact5);

        Contact contact6 = new Contact();
        contact6.setContactId(6);
        contact6.setContactName("Manoj");
        contact6.setContactNumber(9845123456L);
        contact6.setContactOrigin("India");
        phoneBook.addContacts(contact6);

        Contact contact7 = new Contact();
        contact7.setContactId(7);
        contact7.setContactName("Suresh");
        contact7.setContactNumber(9980123456L);
        contact7.setContactOrigin("India");
        phoneBook.addContacts(contact7);

        Contact contact8 = new Contact();
        contact8.setContactId(8);
        contact8.setContactName("Ramesh");
        contact8.setContactNumber(9876012345L);
        contact8.setContactOrigin("India");
        phoneBook.addContacts(contact8);

        Contact contact9 = new Contact();
        contact9.setContactId(9);
        contact9.setContactName("Pavan");
        contact9.setContactNumber(9900987654L);
        contact9.setContactOrigin("India");
        phoneBook.addContacts(contact9);

        Contact contact10 = new Contact();
        contact10.setContactId(10);
        contact10.setContactName("Akash");
        contact10.setContactNumber(9845678901L);
        contact10.setContactOrigin("India");
        phoneBook.addContacts(contact10);

        Contact contact11 = new Contact();
        contact11.setContactId(11);
        contact11.setContactName("Prakash");
        contact11.setContactNumber(9980765432L);
        contact11.setContactOrigin("India");
        phoneBook.addContacts(contact11);

        Contact contact12 = new Contact();
        contact12.setContactId(12);
        contact12.setContactName("Naveen");
        contact12.setContactNumber(9876540123L);
        contact12.setContactOrigin("India");
        phoneBook.addContacts(contact12);

        Contact contact13 = new Contact();
        contact13.setContactId(13);
        contact13.setContactName("Harish");
        contact13.setContactNumber(9900567890L);
        contact13.setContactOrigin("India");
        phoneBook.addContacts(contact13);

        Contact contact14 = new Contact();
        contact14.setContactId(14);
        contact14.setContactName("Sanjay");
        contact14.setContactNumber(9844098765L);
        contact14.setContactOrigin("India");
        phoneBook.addContacts(contact14);

        Contact contact15 = new Contact();
        contact15.setContactId(15);
        contact15.setContactName("Deepak");
        contact15.setContactNumber(9980567891L);
        contact15.setContactOrigin("India");
        phoneBook.addContacts(contact15);

        Contact contact16 = new Contact();
        contact16.setContactId(16);
        contact16.setContactName("Rohit");
        contact16.setContactNumber(9876123450L);
        contact16.setContactOrigin("India");
        phoneBook.addContacts(contact16);

        Contact contact17 = new Contact();
        contact17.setContactId(17);
        contact17.setContactName("Vishal");
        contact17.setContactNumber(9901234567L);
        contact17.setContactOrigin("India");
        phoneBook.addContacts(contact17);

        Contact contact18 = new Contact();
        contact18.setContactId(18);
        contact18.setContactName("Ganesh");
        contact18.setContactNumber(9845345678L);
        contact18.setContactOrigin("India");
        phoneBook.addContacts(contact18);

        Contact contact19 = new Contact();
        contact19.setContactId(19);
        contact19.setContactName("Karthik");
        contact19.setContactNumber(9980234567L);
        contact19.setContactOrigin("India");
        phoneBook.addContacts(contact19);

        Contact contact20 = new Contact();
        contact20.setContactId(20);
        contact20.setContactName("Suraj");
        contact20.setContactNumber(9876987654L);
        contact20.setContactOrigin("India");
        phoneBook.addContacts(contact20);

        Contact contact21 = new Contact();
        contact21.setContactId(21);
        contact21.setContactName("Nikhil");
        contact21.setContactNumber(9845987654L);
        contact21.setContactOrigin("India");
        phoneBook.addContacts(contact21);

        Contact contact22 = new Contact();
        contact22.setContactId(22);
        contact22.setContactName("Varun");
        contact22.setContactNumber(9987650123L);
        contact22.setContactOrigin("India");
        phoneBook.addContacts(contact22);

        phoneBook.getAllContacts();

    }
}
