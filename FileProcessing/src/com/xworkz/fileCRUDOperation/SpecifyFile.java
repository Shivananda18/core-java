package com.xworkz.fileCRUDOperation;

import java.io.*;


    public class SpecifyFile {
        public static void main(String[] args){
            try{
            System.out.println("main started");
            //File -- to represents file and Directory to perform CRUD Operation
           File file=new File("E:\\resumes","SpecifyFileName.txt");//creating test1.txt file inside interface path

                //File Class built -in methods
                System.out.println("the file readable or not : "+file.canRead());//the file is readable when path is assigned.
                System.out.println("the file can write : "+file.canWrite());//the file can Writeable when path is assigned.
                System.out.println("create a new file : "+file.createNewFile());//first we specified the path name and then it creatingNewFile method is active, or  we can't specify the path this method is not gone work.
                System.out.println("file delete : "+file.delete());
                System.out.println("file exists :"+file.exists());
                System.out.println("file getName : "+file.getName());
                System.out.println("getAbsoluteFile : "+file.getAbsoluteFile());
                System.out.println("getAbsolutePath : "+file.getAbsolutePath());
                System.out.println("file length : "+file.length());
              // System.out.println("file list : "+file.list());
               //System.out.println("file mkdir : "+file.mkdir());//creating package

            System.out.println("Specify the file : "+file.getName());
        }catch (Exception e) {
                e.printStackTrace();
            }
}
    }

