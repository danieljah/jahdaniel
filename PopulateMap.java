package com.daniel;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PopulateMap {

    public static void main(String[] args) throws IOException {
        File fileToRead = new File("csvfile.csv");


        Map<String, Integer> map = new HashMap<>();

        try {
            FileReader reader = new FileReader(fileToRead);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String row;
            String [] sentences;
            String n;

            while((row = bufferedReader.readLine()) != null){
                sentences = row.split(",");

                if(sentences.length > 0){
                    String newLine = "";
                    for(String s : sentences){
                        newLine += s + " ";
                    }

                    n = newLine.trim();


                    String k = n.substring(0, n.length()-1);


                    int v = Integer.parseInt(n.substring(n.length() - 1));

                    if(!map.containsKey(k)){

                        map.put(k,v);
                    }else{
                        int value = map.get(k);
                        value += v;

                        map.put(k , value);
                    }



                }
            }

            System.out.println(map);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
