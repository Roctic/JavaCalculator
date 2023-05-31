package com.mycompany.hello;

import java.util.Scanner;

/**
 *
 * @author Roctic
 */
public class Hello {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a number: ");
        int n1 = input.nextInt();
        System.out.print("Insert another number: ");
        int n2 = input.nextInt();
        System.out.print("Choose a operator: ");
        
        String operator = input.next();
        
        Calculadora calc = new Calculadora(n1, n2);
        
        
        if ("+".equals(operator))System.out.println("Result: "+ calc.somar());
        
        else if ("-".equals(operator))System.out.println("Result: "+ calc.sub());
        
        else if ("*".equals(operator))System.out.println("Result: "+ calc.multi());
       
        else if ("/".equals(operator))System.out.println("Result: "+ calc.dividir());
 
        else System.out.println("Insert a valid operator: ");
        
        
        
    }
}
