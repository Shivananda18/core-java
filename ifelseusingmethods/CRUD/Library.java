class Library{
    static String memberFirstName;
    static String memberLastName;
    static long memberMobileNumber;
    static String memberEmail;
    static String bookName;
    static String memberId;
    static String bookCategory;
    static int memberAge;

    public static boolean issueBook(String fname,String lname,long mob,String eid,String bname,String id,String category,int age){
        boolean isIssued;
        memberFirstName = fname;
        memberLastName = lname;
        memberMobileNumber = mob;
        memberEmail = eid;
        bookName = bname;
        memberId = id;
        bookCategory = category;
        memberAge = age;
        isIssued = true;
        return isIssued;
    }

    public static void getMemberDetails(){
        System.out.println("Member First Name is : " + memberFirstName);
        System.out.println("Member Last Name is : " + memberLastName);
        System.out.println("Member Mobile Number is : " + memberMobileNumber);
        System.out.println("Member Email is : " + memberEmail);
        System.out.println("Book Name is : " + bookName);
        System.out.println("Member ID is : " + memberId);
        System.out.println("Book Category is : " + bookCategory);
        System.out.println("Member Age is : " + memberAge);
    }
}