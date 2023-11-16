package javalec;

import java.util.Scanner;
public class Rate_of_interest {
    public static void main(String[] args) {
        System.out.println("....program for to check the rate of interest....");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:-");
        int age=sc.nextInt();
        System.out.println("enter the gender:-");
        char gender=sc.next().toUpperCase().charAt(0);

        if(age>60 && gender=='M'){
            System.out.println("the rate of interest for male is 7% ");
        }
        else if(age>60 && gender =='F'){
            System.out.println("the rate of interest for female is 7.5%");
        }
        else if(age<60 && gender=='M'){
            System.out.println("the rate of interest for male is 5%");
        }
        else if(age<60 && gender=='F'){
            System.out.println("the rate of interest for female is 5%");
        }
        else{
            System.out.println("invalid age or gender input");
        }
    }
}
