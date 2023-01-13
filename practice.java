// // // // // /*Write a Java program to print 'Hello' on screen and
// // // // //   then print your name on a separate line.*/ 
// // // // // public class practice{
// // // // //     public static void main(String[] args){
// // // // //         System.out.println("hellow world");
// // // // //         System.out.println("shivam mishra");
// // // // //     }
// // // // // }

// // // // // /*Write a Java program to print the sum of two numbers */
// // // // import java.util.*;
// // // // public class practice{
// // // //     public static void main (String [] args){
// // // //         int a,b,c;
// // // //         System.out.println("sum of any two number");
// // // //         Scanner s=new Scanner (System.in);
// // // //         System.out.println("Enter any first number");
// // // //         a=s.nextInt();
// // // //         System.out.println("Enter any second number");
// // // //         b=s.nextInt();
// // // //         c=a+b;
// // // //         System.out.println("sum of two number:"+c);
// // // //     }
// // // // }

// // // /*Write a Java program to divide two numbers and print on the screen. */
// // // import java.util.*;
// // // public class practice{
// // //     public static void main (String [] args){
// // //         int a,b,c;
// // //         System.out.println("divided of any two number");
// // //         Scanner s=new Scanner (System.in);
// // //         System.out.println("Enter any first number");
// // //         a=s.nextInt();
// // //         System.out.println("Enter any second number");
// // //         b=s.nextInt();
// // //         c=(a/b);
// // //         System.out.println("the division of a and b:"+c);
// // //     }
// // // }

// // /*Write a Java program to print the result of the following operations. 
// // Test Data:
// // a. -5 + 8 * 6
// // b. (55+9) % 9
// // c. 20 + -3*5 / 8
// // d. 5 + 15 / 3 * 2 - 8 % 3 */
// // public class practice{
// //     public static void main(String[] args){
// //         int a,b,c,d;
// //         a=(-5 + 8 * 6);
// //         b=((55+9) % 9);
// //         c=(20 + -3*5 / 8);
// //         d=(5 + 15 / 3 * 2 - 8 % 3);
// //         System.out.println(a);
// //         System.out.println(b);
// //         System.out.println(c);
// //         System.out.println(d);
        
// //     }
// // }
// /* Write a Java program that takes two numbers as input and display the product of two numbers. */
// import java.util.*;
// public class practice{
//     public static void main(String[] args){
//         System.out.println("product of two number");
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter your first number");
//         int a=s.nextInt();
//         System.out.println("Enter your second number");
//         int b=s.nextInt();
//         int c=(a*b);
//         System.out.println("product of a and b"+c);
//     }
// }
/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. */
import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=s.nextInt();
        System.out.println("Enter your second number");
        int b=s.nextInt();
        System.out.println(a + " + " + b + " = " + 
        (a + b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
    }
}