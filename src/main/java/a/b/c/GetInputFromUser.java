package a.b.c;

import java.util.Scanner;

class GetInputFromUser 
{ 
    public static void main(String args[]) 
    { 
        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in);
        System.out.println("enter string: ");
        String s = in.nextLine(); 
        System.out.println("You entered string "+s);
        System.out.println("enter integer: ");
        int a = in.nextInt(); 
        System.out.println("You entered integer "+a);
        System.out.println("enter float: ");
        float b = in.nextFloat(); 
        System.out.println("You entered float "+b); 
    } 
} 