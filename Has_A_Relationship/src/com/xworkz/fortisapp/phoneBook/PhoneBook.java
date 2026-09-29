package com.xworkz.fortisapp.phoneBook;

import com.xworkz.fortisapp.phoneBook.contact.Contact;

public class PhoneBook {

    Contact[] contacts=new Contact[22];
    int index;
    public boolean addContacts(Contact contacts){

        boolean isAddContacts=false;
        boolean isContactIdValid=false;
        boolean isContactNameValid=false;
        boolean isContactNumber=false;
        boolean isContactOrigin=false;

        if(contacts.getContactId() > 0){
             isContactIdValid=true;
        }
        if(contacts.getContactName() !=null && !contacts.getContactName().isEmpty() ){
             isContactNameValid=true;
        }
        if(contacts.getContactNumber() > 0){
            isContactNumber=true;
        }
        if(contacts.getContactOrigin() !=null && !contacts.getContactOrigin().isEmpty()){
             isContactOrigin=true;
        }
        if(isContactIdValid && isContactNameValid && isContactNumber && isContactOrigin){
            this.contacts[index++]=contacts;
            isAddContacts=true;
        }
        return isAddContacts;
    }
    public void getAllContacts(){
        for(Contact contact:contacts){
            System.out.println(contact);
        }
    }
}
