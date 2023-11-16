/*Write a program to accept choice from the user and perform the operation
	1.Find out greater between 3 NO
	2.Check given no is even or odd
	3.Checkk the given character is vowel or not
	4.check the given no is divible by 5 or not
 */

import java.util.*;
public class Program
{
  public static void main(String args[])
  { 
    int choice,count=1,num1,num2,num3,num;
    Scanner sc=new Scanner(System.in);//to accept the user input
     System.out.println("enter your choice:\n1)Find out greater between 3 number\n2)Check given no is even or odd\n3)Checkk the given character is vowel or not\n4)check the given no is divible by 5 or not ");

    choice=sc.nextInt();
    switch(choice)
    {
      case 1:
      System.out.println("find greatest between 3 number ");
      System.out.println("enter the value of num1");
    num1=sc.nextInt();
    System.out.println("enter the value of num2");
    num2=sc.nextInt();
    System.out.println("enter the value of num3");
    num3=sc.nextInt();
    
      //checking if num1 is greatest
      if (num1 >= num2 && num1 >= num3)
      {
        System.out.println (num1 + " is the greatest");
      }
    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
    {
        System.out.println (num2 + " is the greatest");
    }
    //checking if num3 is greatest
    else if (num3 >= num1 && num3 >= num2)
    {
        System.out.println (num3 + " is the greatest");
    }
    break;

    case 2:
     System.out.println("check number is even or odd");
     System.out.println("enter number=");
      num=sc.nextInt();
      //check number is even or odd
        if(num % 2 == 0)
        {
            System.out.println(num + " number is even");
        }
        else
        {
            System.out.println(num + " number is odd");
        }
    break;  
    
    case 3:
    // check character is vowel or not
    System.out.println("to check given character is vowel or not");
    System.out.println("enter the character=");
    char ch=sc.next().charAt(0);
          if (ch== 'a' || ch == 'e' || ch == 'i' || ch== 'o'
            || ch == 'u') 
         {
            System.out.println("It is a Vowel"); 
         }
        else
        {
         System.out.println("It is a not Vowel"); 
        }
    break;

    case 4:
         System.out.println("to check given number is divisible by 5 or not");
        System.out.println("enter the number=");
        int number=sc.nextInt();
    if (number % 5 == 0)
    { 
            // no is divisible by 5
            System.out.println(+number+ " is divisible by 5");
    }
        else
        {
 
            // no is not divisible by 5
            System.out.println(+number+ " is not divisible by 5");
        }
     break;
     default:
     System.out.println("Enter valid case only");
  } 
}

}
   