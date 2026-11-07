package com.xworkz.fileCRUDOperation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile  {

    public static void main(String[] args) {
try{
        File specifiedFile=new File("E:\\core-java\\InterFace","specifiedFile");

        if(specifiedFile.delete()){
            System.out.println(" deleted file name : "+specifiedFile.getName());
        }else{
            System.out.println("file not deleted");
        }
            FileWriter fileWriter=new FileWriter(specifiedFile);
            fileWriter.write("write info in E:\\resumes __________ :");
            fileWriter.close();

        if(specifiedFile.createNewFile()){
            System.out.println("new File Created");
        }else{
            System.out.println("File already Created");
        }
            Scanner scanner=new Scanner(specifiedFile);
        while(scanner.hasNextLine()){
            String data=scanner.nextLine();
          System.out.println(data);

        }
        FileReader fileReader=new FileReader(specifiedFile);
        fileReader.read();
        fileReader.close();

    }catch (Exception e){
            System.out.println("error occurred");
            e.printStackTrace();
        }
    }
}
