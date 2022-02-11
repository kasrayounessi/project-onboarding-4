package com.younessi;

import java.util.ArrayList;

public class JavaExercises {

    public static boolean isAscending(String sequence){

        String[] sequenceArr = sequence.split("");
        int k = 0;
        int stopper = (int)Math.ceil((double)sequenceArr.length/2) - 1;
        System.out.println(stopper);
        for(int i = 0; i < sequenceArr.length/2; i++){
            System.out.println("k at current " + i + " iteration: "+ k);
            String firstDigit = sequence.substring(0, i+1);
            String secondDigit = sequence.substring(i+1, (i+1)*2);


            System.out.println("first digit: " + firstDigit);
            System.out.println("second digit: " + secondDigit);
            if(i == stopper){
                System.out.println("been here 3");
                System.out.println(firstDigit);
                System.out.println(secondDigit);
                if(Integer.parseInt(firstDigit)>=Integer.parseInt(secondDigit)){
                    k++;
                    break;
                } else{
                    return true;
                }
            } else{
                if(Integer.parseInt(firstDigit) < Integer.parseInt(secondDigit)){
                    if (sequence.length() % (i+1) == 0) {
                        System.out.println("been here");
                        int increment = i + 1;
                        for(int j = increment; j < sequenceArr.length-increment; j += increment){
                            System.out.println("been here 2");
                            String currentDigit = sequence.substring(j, j+increment);
                            String nextDigit = sequence.substring(j+increment, j+(increment*2));
                            if(Integer.parseInt(currentDigit) >= Integer.parseInt(nextDigit)){
                                k++;
                                break;
                            }
                            System.out.println("current digit: " + currentDigit);
                            System.out.println("Next digit: " + nextDigit);
                        }
                    } else {
                        k++;
                    }
                } else{
                    k++;
                }
            }



        }
        if(k == sequenceArr.length/2){
            return false;
        }
        return true;
    }

    public static void squarePatches(int num){
        if(num == 0){
            System.out.println("[]");
            return;
        }
        for(int i = 0; i < num; i++){
            ArrayList result = new ArrayList();
            for(int j = 0; j < num; j++){
                result.add(num);
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        System.out.println(isAscending("2324256"));
        //System.out.println(isAscending("444445"));
        //System.out.println(isAscending("123456"));
        //System.out.println(isAscending("910111213"));
        //System.out.println(isAscending("2456"));

        squarePatches(0);



    }
}
