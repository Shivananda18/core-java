class Institute{
    static String studentFirstName;
    static String studentLastName;
    static long studentMobileNumber;
    static String studentEmail;
    static String studentCourse;
    static String studentId;
    static String studentDepartment;
    static int studentAge;

    public static boolean registerStudent(String fname,String lname,long mob,String eid,String course,String id,String department,int age){
        boolean isRegistered;
        studentFirstName = fname;
        studentLastName = lname;
        studentMobileNumber = mob;
        studentEmail = eid;
        studentCourse = course;
        studentId = id;
        studentDepartment = department;
        studentAge = age;
        isRegistered = true;
        return isRegistered;
    }

    public static void getStudentDetails(){
        System.out.println("Student First Name is : " + studentFirstName);
        System.out.println("Student Last Name is : " + studentLastName);
        System.out.println("Student Mobile Number is : " + studentMobileNumber);
        System.out.println("Student Email is : " + studentEmail);
        System.out.println("Student Course is : " + studentCourse);
        System.out.println("Student ID is : " + studentId);
        System.out.println("Student Department is : " + studentDepartment);
        System.out.println("Student Age is : " + studentAge);
    }
}