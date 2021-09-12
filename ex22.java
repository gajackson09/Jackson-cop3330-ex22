/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program asks for three numbers the tells which number is the largest
import java.util.Scanner;
public class ex22{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
   
    System.out.print("Input the 2nd number: ");
        int number2 = input.nextInt();
   
    System.out.print("Input the 3rd number: ");
        int number3 = input.nextInt();
   
    if (number1 > number2)
        if (number1 > number3)
        System.out.println("The largest number is: " + number1);
   
    if (number2 > number1)
    if (number2 > number3)
        System.out.println("The largest number is: " + number2);
   
    if (number3 > number1)
    if (number3 > number2)
        System.out.println("The largest number is: " + number3);
 }//end of main
}//end of class