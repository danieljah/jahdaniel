package com.daniel;

public class FindLongestWord {

    public static void main(String[] args) {

        String [] words = {"Hello","world","hi","bye"};

        String longestInFirstArray = findLongestWord(words);


        System.out.printf("Longest Word in the Array is %s",longestInFirstArray);



    }


    public static String findLongestWord(String [] input){

        String longestWord = input[0];

        for(int i = 0; i < input.length; i++){

            if(input[i].length() > longestWord.length()){

                longestWord = input[i];
            }

        }

        return longestWord;


    }



}
