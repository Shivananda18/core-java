package com.xworkz.fileCRUDOperation;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteFile {

    public static void main(String[] args)throws Exception {
try{
        File file=new File("E:\\resumes","writeFile.txt");

        if(file.createNewFile()){
            System.out.println("new File Created : "+file.getName());
        }else{
            System.out.println("File is already Exist or file not Created");
        }
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Created  WriteFile.txt in E:\\resumes ");
        fileWriter.close();
    }catch (Exception e){
    System.out.println("error is  occurred");
    e.printStackTrace();
}
    }
}
