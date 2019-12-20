package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner answer = new Scanner(System.in);

        String again;


        do {

            Scanner num = new Scanner(System.in);
            System.out.println("Please enter your first number: ");
            Long a;
            a = num.nextLong();
            System.out.println("Please enter your second number: ");
            Long b;
            b = num.nextLong();

            double res;

            String sign;
            System.out.println("Please choose a mathematical operation (+;-;*;/)");

            sign = answer.next();

            if (sign.equals("+")) {
                res = a + b;
                System.out.print(res);
            }

            if (sign.equals("-")) {
                res = a - b;
                System.out.print(res);
            }

            if (sign.equals("*")) {
                res = a * b;
                System.out.print(res);
            } else {
                res = a / b;
                System.out.println(res);

            }

            System.out.println("Would you like to do another calculation? (yes/no) ");
            again = answer.next();

        }

        while (again.equals("yes"));
    }




}
