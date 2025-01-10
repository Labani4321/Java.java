//1.Write a java Program to Print your name.
public class MyName {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}


//2.//Write a java Program to Determine of the three number is biggest.
import java.util.Scanner;
class Big3 {
int num1;
int num2;
int num3;
int printresult(){
int biggest = (num1 > num2)? ((num1 > num3)? num1 : num3 ): ((num2 > num3)? num2 : num3 );
return biggest; }
}
public class Biggest_in_three{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Big3 solve = new Big3();
System.out.println("Now Enter the Numbers 1 by 1");
solve.num1 = sc.nextInt();
solve.num2 = sc.nextInt();
solve.num3 = sc.nextInt();
sc.close();
System.out.println("So the Biggest Number is :" + solve.printresult()); }

// 3. conditons java 
import java.util.*;
public class Condition {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt ();
        
        if (age >18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not adult");
            }
        }
    }

// Even or odd check 
import java.util.*;
public class Condition {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt ();
        
        if (num % 2 ==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
            }
        }
    }
