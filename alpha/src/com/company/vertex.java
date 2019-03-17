package com.company;

public class vertex {
    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        int a = 2 * n++; //теперь значение a равно 4, а n равно 3
        int b = 2 * ++k; //теперь значение b равно 6, а k равно 3
        System.out.println(a);
        System.out.println(n);
        System.out.println(b);
        System.out.println(k);
    }

}
