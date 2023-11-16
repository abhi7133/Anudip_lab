package javalec;
import java.util.Scanner;
public class Practicequestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nall of this below choice you have:-"+
                "\t1.Find out greater between 3 NO\n" +
                "\t2.Check given no is even or odd\n" +
                "\t3.Checkk the given character is vowel or not\n" +
                "\t4.check the given no is divible by 5 or not");
        System.out.print("enter your choice:-");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("enter the first number:-");
                int a= sc.nextInt();
                System.out.print("enter the first number:-");
                int b= sc.nextInt();
                System.out.print("enter the first number:-");
                int c= sc.nextInt();
                if(a>b && a>c){
                    System.out.println("a is greater than all of the number "+a);
                }
                else if(b>a && b>c){
                    System.out.println("b is greater than all of the number "+b);
                }

                else{
                    System.out.println("c is greater than all of the number "+c);
                }
                break;

            case 2:
                System.out.print("enter the  number:-");
                int i= sc.nextInt();
                if(i%2==0){
                    System.out.println("the given number is even");
                }
                else{
                    System.out.println("the given number is odd");
                }
                break;

            case 3:
                System.out.println("enter the character you want to check:-");
                char ch=sc.next().charAt(0);
                if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                    System.out.println("the character is vowel");
                }
                else{
                    System.out.println("the character is consonant");
                }
                break;

            case 4:
                System.out.print("enter the  number:-");
                int num= sc.nextInt();
                if(num%5==0){
                    System.out.println("number is divisible by 5");
                }
                else {
                    System.out.println("number is not divisible by 5");
                }
                break;
            default:
                System.out.println("you have enter the wrong choice.");

        }

    }
}
