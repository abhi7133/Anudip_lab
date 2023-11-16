package javalec;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.arithmetic,2.assignment,3.relational,4.logical,5.bitwise ,6.conditional operator");
        System.out.println("enter the choice :-");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
            //arithmetic operator
            System.out.println("addition arithmetic operator ");
            System.out.println("enter the first number:-");
            int a = sc.nextInt();
            System.out.println("enter the Second number:-");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("the addition of two number is:-" + c);

            System.out.println("the subtraction of two number is:-");
            System.out.println(a - b);

            System.out.println("multiplication arithmetic operator ");
            System.out.println(a * b);

            System.out.println("division arithmetic operator ");
            System.out.println(a / b);
            break;

            case 2:
            //assignment operator
            System.out.println("enter the first number:-");
            int x = sc.nextInt();


            int i = x;
            System.out.println("the value which is assign to the i is :-" + i);
            System.out.println("other assignment operator is :-");
            x += 5;
            x -= 1;
            x *= 2;
            break;

            case 3:
            //relational operator
            System.out.println("enter the number:-");
            int y = sc.nextInt();

            System.out.println("enter the second number:-");
            int z = sc.nextInt();

            System.out.println("y>z" + (y > z));
            System.out.println("y>z" + (y < z));
            System.out.println("y>=z" + (y >= z));
            System.out.println("y<=z" + (y <= z));
            System.out.println("y!=z" + (y != z));
            System.out.println("y==z" + (y == z));
            break;

            case 4:
            //logical operator
            System.out.println("enter the statement whether its true or false");
            boolean e = sc.nextBoolean();
            System.out.println("enter the statement whether its true or false");
            boolean f = sc.nextBoolean();
            System.out.println("and logiacal operator:-" + (e && f));
            System.out.println("or logiacal operator:-" + (e || f));
            System.out.println(" logiacal not operator:-" + (!e));
            break;

            case 5:
          //bitwise operator
                System.out.println("enter the number :-");
                int j=sc.nextInt();
                System.out.println("enter the number :-");
                int k=sc.nextInt();

                System.out.println("example of bitwise and operator:-"+(j&k));
                System.out.println("example of bitwise or operator:-"+(j|k));
                System.out.println("example of bitwise and operator:-"+(j^k));
                break;

            case 6:
                //conditional operator
                System.out.println("enter the number :-");
                int l=sc.nextInt();
                System.out.println("enter the number :-");
                int m=sc.nextInt();
                System.out.println("enter the number :-");
                int n=sc.nextInt();
                System.out.println(l>m && l>n || m<n);
                break;


        }

    }
}
