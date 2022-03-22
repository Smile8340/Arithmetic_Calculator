package com.simplilearn.Day1;
import java.util.*;
public class Calculator {
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("******ARITHMETIC CALCULATOR******");
        System.out.println("----------------------------------");
        System.out.println("Enter the Operator :-");
        System.out.println("1. Press '+' for addition \n 2. Press '-' for subtraction \n 3. Press '*' for multiplication \n 4. Press '/' for division");
        System.out.println("---------------------------------------------------------");
        char operator = sc.next().charAt(0);
        System.out.println("--------------------------------------------------");
        System.out.println("Enter the First Operand : ");
        double first = sc.nextDouble();
        
        System.out.println("Enter the Second Operand : ");
        double second = sc.nextDouble();
        
        double result = 0;
        
        switch(operator){
        case '+':
            result = first + second;
            break;
        case '-':
            result = first - second;
            break;
        case '*':
            result = first * second;
            break;
        case '/':
            result = first / second;
            break;
        }
        
        System.out.println("The Result is : \n "+first+" "+operator+" "+second+" = "+result);
        System.out.println("----------------------------------");
        System.out.println("====THANK YOU====");
    }
    
}