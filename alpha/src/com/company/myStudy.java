package com.company;

import static java.lang.String.valueOf;

public class myStudy {
    public static void main(String[] args) {
        String first = "BlaCot";
        String first2 = "blaCot";
        String second = "10.01.2019";
        int num = 1243489;
        String nmin=" fjsfjk djfgkgj g            ";

        int length =first.length();
        System.out.println(length);

        String con1 = first.concat(second);
        System.out.println(con1);

        boolean equalsString = first.equals(first2);
        System.out.println(equalsString);

        boolean equalsString2 = first.equalsIgnoreCase(first2);
        System.out.println(equalsString2);

        String sub1 = first.substring(2,3);
        System.out.println(sub1);

        String sub2 = first.substring(2);
        System.out.println(sub2);

        String number =valueOf(num);

        String CASE1=first2.toUpperCase();
        System.out.println(CASE1);

        String Case2=CASE1.toLowerCase();
        System.out.println(Case2);

        String chenge1=second.replace('.','/');
        System.out.println(chenge1);

        String trimer =nmin.trim();
        System.out.println(trimer);

        char position =nmin.charAt(1);
        System.out.println(position);

        int position2=nmin.indexOf("dj");
        System.out.println(position2);

        int position3=nmin.lastIndexOf('j');
        System.out.println(position3);













    }
}
