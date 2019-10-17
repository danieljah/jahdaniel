package com.daniel;

import java.io.*;

public class ReadLineFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader("helloworld.txt");
        String returnedOutput = readLine(reader,89);

        System.out.println(returnedOutput);


    }


   public static String readLine(FileReader reader, int position){

        String output = "";

       try {
           BufferedReader bufferedReader = new BufferedReader(reader);

           int lines = 1;
           do{
               if(lines == position){
                   output = bufferedReader.readLine();
               }

               lines++;

           }while (bufferedReader.readLine() != null);


       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }

       return output;
   }



    public  static int numberOfLineInFile(FileReader reader) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(reader);
        int line = 0;

        while (bufferedReader.readLine() !=  null){
            line++;
        }

        return line;
    }


}
