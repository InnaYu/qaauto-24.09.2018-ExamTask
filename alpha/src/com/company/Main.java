package com.company;

public class Main {


    public static void main(String[] args) {

        String d="*|";
        System.out.print(d);
        int i;
        int b;


      for (i = 1; i <= 9; i++) {
          System.out.print(" "+ i + " ");

      }

      System.out.println("\n"+"------------------------------");

      for (b=1;b<= 9; b++){
            System.out.println(b + "|");
            int value=b;
            while (value>9) {
                System.out.print(value*value + " ");
                value++;
            }
         // System.out.print(b*b);

            }
        }



            }



       // System.out.print("-");





