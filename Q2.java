import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
 /* Write programs with loops that compute
a. The sum of all even numbers between 2 and 100 (inclusive).
b. The sum of all odd numbers between a and b (inclusive), where a and b are
   inputs.
c. The sum of all odd digits of an input. (For example, if the input is 32677,
    the sum would be 3 + 7 + 7 = 17.)*/

        /*a*/  for (int i = 0; i < 100; i++) {if (i % 2 == 0) System.out.println(i);}
        /*b*/
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=s.nextInt();
        for (int i = a; i < d; i++) {if (i % 2 == 0) System.out.println(i);}
      /*c*/  Scanner in = new Scanner(System.in);
        int []arr= new int[5];
        for (int i = 0; i < arr.length; i++) {arr[i]=in.nextInt();}
        int sum=0;
        for (int i = 0; i < arr.length; i++) {if(arr[i]%2==1) sum=sum+arr[i];}
        System.out.println(sum);
    }
    }



