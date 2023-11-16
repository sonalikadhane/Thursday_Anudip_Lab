import java.util.*;
public class Operator
{
    public static void main(String args[])
  {  
    int num1,num2,calculation,choice,answer;
    boolean result;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the choice:\n1)Arithmetic operator\n2)Logical Operator\n3)Relational Operator\n4)Bitwise Operator\n5)Conditional Operato\n6)Assignment Operator");
    System.out.println("enter the value of num1");
    num1=sc.nextInt();
    System.out.println("enter the value of num2");
    num2=sc.nextInt();
    calculation=sc.nextInt();
    choice=sc.nextInt();
    switch(choice)
    {
        //for Arithmatic operators
        case 1:
         System.out.println("enter the value of num1");
          num1=sc.nextInt();
          System.out.println("enter the value of num2");
          num2=sc.nextInt();
          calculation=num1+num2;
          System.out.println("addition of two numbers"+calculation);
          calculation=num1-num2;
          System.out.println("subtraction of two numbers"+calculation);
          calculation=num1*num2;
          System.out.println("multiplication of two numbers"+calculation);
          calculation=num1/num2;
          System.out.println("Division of two numbers"+calculation);
          calculation=num1%num2;
          System.out.println("mod of two numbers"+calculation);
        break;

         //for logical operator
        case 2:
        
          System.out.println("enter the value of num1");
           num1=sc.nextInt();
          System.out.println("enter the value of num2");
           num2=sc.nextInt();
          result=(num1>num2)&&(num2>num1);//logical operator &&
        
            System.out.println("the result of two numbers is="+result);
        
            result=(num1>num2)||(num2<num1);//logical operator ||
        
            System.out.println("the result of two numbers is="+result);
        
            result=!(num1>num2)||(num2<num1);//logical operator !
        
            System.out.println("the value of num2 is not less than 40");
        break;

          // for Relational Operator
        case 3:
           System.out.println("enter the two numbers");
          num1=sc.nextInt();
          num2=sc.nextInt();
         if(num1>num2)
         {
            System.out.println("num1 is greater than num2 ");
         }
         else if(num1<num2)
         {
            System.out.println("num1 is less than num2 ");
         }
         else if(num1==num2)
         {
            System.out.println("num1 is equal to num2 ");
         }
         else if(num1!=num2)
         {
            System.out.println("num1 is not equal to num2 ");
         }
         if(num1>=num2)
         {
            System.out.println("num1 is greater than equal to num2 ");
         }
         else if(num1<=num2)
         {
            System.out.println("num1 is greater than equal to num2 ");
         }
         break;

          // for Bitwise Operator
        case 4:
          System.out.println("enter the value of two numbers");
          num1=sc.nextInt();
          num2=sc.nextInt();
          answer=num1 & num2;
          System.out.println("result of two numbers"+answer);
          answer=num1 | num2;
          System.out.println("result of two numbers"+answer);
           answer=num1 ^ num2;
           System.out.println("result of two numbers"+answer);
        break;

        case 5:
          //for conditional operator
          System.out.println("enter the value of two numbers");
          num1=sc.nextInt();
          num2=sc.nextInt();
          answer=(num1>num2)?num1:num2;
           System.out.println(answer+" isgreater number" );

        default:
        System.out.println("plz enter valid case only");
        break;
    }
 }
}