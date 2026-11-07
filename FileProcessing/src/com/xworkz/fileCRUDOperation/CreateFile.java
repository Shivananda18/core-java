package com.xworkz.fileCRUDOperation;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) throws Exception {
        System.out.println("main started");
        try {
            File file = new File("E:\\resumes", "CreateFile.text"); //we can't create same file again  and again


            //create new File
            if (file.createNewFile()) {
                System.out.println("new File Created" + file.getName());
            } else {
                System.out.println("file already created : " + file.getName());
            }
        } catch (Exception e) {
            System.out.println("error occurs");
            e.printStackTrace();
        }
    }
    }

