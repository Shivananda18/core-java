package com.xworkz.xworkzstudent.service.impl;

import com.xworkz.xworkzstudent.service.StudentService;

public class StudentImpl implements StudentService {
    @Override
    public void saveStudentDate(String name, int age, String usn, String collage, String email, long mobileNumber) {

        System.out.println("you are in service layer");
        System.out.println(name);

    }
}
