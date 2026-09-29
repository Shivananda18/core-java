package com.xworkz.fortisapp.phoneBook.contact;

public class Contact {

    private int contactId;
    private String contactName;
    private long contactNumber;
    private  String contactOrigin;

    public void setContactId(int contactId){
        this.contactId=contactId;
    }
    public int getContactId(){
        return this.contactId;
    }
    public void setContactName(String contactName){
        this.contactName=contactName;
    }
    public String getContactName(){
        return contactName;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public long getContactNumber(){
        return this.contactNumber;
    }
    public void setContactOrigin(String contactOrigin){
        this.contactOrigin=contactOrigin;
    }
    public  String getContactOrigin(){
        return this.contactOrigin;
    }
    public String toString(){
        return "Contacts :{contact Id= "+this.contactId+" contact Name= "+this.contactName+"contact Number"+this.contactNumber+" Call Origin= "+this.contactOrigin;
    }

}
