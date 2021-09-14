/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
Scanner scr=new Scanner(System.in); //scans what user inputs 

   int A,choice,W,H;
   double BAC,r;
   System.out.print("Enter a 1 is you are male or a 2 if you are female: "); //asks user to enter 1 or 2 based on gender
   choice=scr.nextInt();
    if(choice==1) //uses if statement to calculate BAC
      r=0.73;
   else
      r=0.66;
       System.out.print("How many ounces of alcohol did you have? "); //asks user to input ounces of alcohol consumed 
       A=scr.nextInt();
       System.out.print("What is your weight, in pounds? "); //asks user to input weight 
       W=scr.nextInt();
       System.out.print("How many hours has it been since your last drink? "); //asks user to input how many hours it has been since last drink
       H=scr.nextInt();
      
       BAC=A*5.14/W*r-0.015*H; //calculates BAC
       System.out.println();
      
       System.out.println("Your BAC is "+BAC);
      
       if(BAC<=0.08) //uses if statement based on BAC
       System.out.println("It is legal for you to drive");
       else
       System.out.println("It is not legal for you to drive");
      
      

   }
}