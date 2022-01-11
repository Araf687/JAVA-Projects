package com.mycompany.filesmanupulation;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
//import java.io.FileNotFoundException;
//import java.util.Formatter;

public class Files {
    public static void main(String[] args) throws IOException {
//        File folder=new File("D:/user");
//        folder.mkdir();
//        String location=folder.getAbsolutePath();
//        System.out.println(folder.getName());
//        File fileStudent=new File(location+"/student.txt");
//          try{
//              fileStudent.createNewFile();
//              System.out.println("file created");
//          }catch(Exception e){
//              System.out.println(e);
//          }
//            Formatter formater =new Formatter("E:/practise/java/ practise/FilesManupulation/Student.txt");
//            formater.format("helen\n");
//            formater.format("sadia\n");
////            formater.format("shammiya\n");
////            formater.format("pushpa\n");
//            
//            formater.close();
//              File users= new File("E:/practise/java/ practise/FilesManupulation/Student.txt");
//              FileOutputStream fOut=new FileOutputStream(users,true);
//              fOut.write("neha\n".getBytes());
//              fOut.close();
              File student=new File("E:/practise/java/ practise/FilesManupulation/Student.txt");
              Scanner input=new Scanner(student);
              while(input.hasNext()){
                  String name=input.nextLine();
                  System.out.println(name);
              }
              
              
            
              
              


    }
}
