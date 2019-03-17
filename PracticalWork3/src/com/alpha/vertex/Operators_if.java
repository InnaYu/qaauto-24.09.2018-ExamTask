package com.alpha.vertex;

import java.util.Scanner;

public class Operators_if {
    public void Task1(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number 1,2 or 3-->");
        int i=number.nextInt();

        if(i==1){
            System.out.println(i);
        }if(i==2){
            System.out.println(i);

        }if(i==3){
            System.out.println(i);
        }
    }

    public void Task4(){
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number){
            case 1: System.out.println ("Вы ввели число 1"); break;
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");
        }

    }


    public void Task2(){
        int s=1;
        while (s<8){
            System.out.println(s);
            s++;

        }

    }

    public void Task3(){
        int u=100;
        while (u>=0){
            System.out.print(u+" ");
            u-=10;
        }
    }

    public void Task5(){
        for (int i = 3; i >-4 ; i--) {
            System.out.println(i+" ");

        }
    }

    public void Task6(){
        int a=3;
        for (int i = 1; i <=10 ; i++) {

            System.out.println(a+"*"+i+"="+a*i);

        }
    }

    public void Task7(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number-->");
        int number =scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=number; i++) {
            sum=sum+i;

        }
        System.out.println(sum);
    }

    public void Task8(){
        int a=7;
       // int result = 7;
        while (a<=97){
            a+=7;
            System.out.print(a+" ");
        }
    }

    public void Task9(){
        int a=1;

        while (a<=512){
           // a=a+a;
            System.out.print(a+" ");
            a*=2;
        }
    }
}

