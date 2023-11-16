/*Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%

below 60
M,F: 5%
*/

import java.util.*;
public class RateOfInterest
{
    public static void main(String args[])
  {
     int age;
     char gender;
     Scanner sc=new Scanner(System.in);//to accept the user input
     System.out.println("Enter the age");
      age=sc.nextInt();
     System.out.println("Enter the gender");
     gender=sc.next().charAt(0);

     if(age>=60)
     {
        if(gender=='m')
        {
        System.out.println("the male RoI is 7.0%");
        }
       else if(gender=='f')
       {
        System.out.println("the female RoI is 7.5%");
       }
       else
       {
        System.out.println("enter the proper gender");
       }
    }

    else if(age<60)
    {
        if (gender == 'M' || gender == 'F' || gender == 'M' || gender == 'F')
        {
            System.out.println("the both male and female RoI is 5%");
        }
        else
        {
            System.out.println("no rate of intrest ");
        }
    }
}
}