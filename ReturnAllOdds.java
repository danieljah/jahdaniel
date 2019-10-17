package com.daniel;

public class ReturnAllOdds {
    public static void main(String[] args) {

        int [] input = {1,3,4,5,7};

        returnAllOdds(input);



    }


    public static void returnAllOdds(int input[]){

        for(int number : input){

            if(number % 2 != 0){
                System.out.println(number + " is an odd number");
            }

        }
    }

}
