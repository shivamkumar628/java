/*write a simple program of array */
// public class array{
//     public static void main(String[] args){
//         String[] a={"4","5"};
//         System.out.println(a[0]);
//     }
// }

/*WAP to all value of array is printed */
// public class array{
//     public static void main(String[] args){
//         String[] Name ={"shivam","mishra"};
//       for(String b : Name )
//         {
//             System.out.print(b+" ");
//         }
//     }
// }
 
import java.util.*;
public class array{
    public static void main (String[] args){
        int a[]=new int[9];
        System.out.println("Enter your array element");
        Scanner s= new Scanner (System.in);
        for(int i=0; i<10; i++)
        {
             a[i]=s.nextInt();
        }
        
        System.out.println(a[7]);
  
    }
}