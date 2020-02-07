package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[4];
        int[] question = new int[4];
        int cows = 0;
        int byki = 0;
        for (int i = 0; i < 4; ++i) {
            numbers[i] = in.nextInt();
        }
        for (int i = 0; i < 4; ++i) {
            question[i] = in.nextInt();
        }
         for(int i = 0; i < 4; ++i){
             for(int j = 0; j < 4; ++j){
                if( numbers[i] == question[j]){
                    if(i == j){
                        ++byki;
                    }
                    else{
                        ++cows;
                    }
                }
             }
         }
         System.out.print(byki);
         System.out.print(" ");
         System.out.print(cows);
    }
}
