package com.company;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        //taking input
        System.out.println("Enter 5 numbers");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        //calculate
        int x=(a+b+c+d+e);
        //output
        System.out.println("The sum of 5 numbers is:" + x);
    }
}