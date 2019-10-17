package com.daniel;

import java.util.*;

public class SortDictionary {

    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();

       map.put("key","value");
       map.put("ab","hi there");
       map.put("we","say what");


        sortMap(map);


    }


    public static void sortMap(Map<String,String> input){

        List<String> sortedList = new ArrayList<>(input.keySet());

        Collections.sort(sortedList);

        for(String i : sortedList){
            System.out.println(i +" " + input.get(i));
        }


    }


    public static void sortByTreeMap(Map<String, String> input){

        TreeMap<String, String> sorted = new TreeMap<>();

        sorted.putAll(input);


        for(Map.Entry<String, String> e : sorted.entrySet() ){
            System.out.println(e.getKey() + " "+ e.getValue());
        }


    }



}
