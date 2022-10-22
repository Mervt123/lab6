import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /* Q8 :Prime numbers. Write a program that prompts the user for an integer and then
prints out all prime numbers up to that integer*/
        System.out.println("enter num....");
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        for (int i = 1; i < s; i++) {
            int n=0;
            for (int j = 1; j < i; j++) {
            if (s%j==0)n++;
            if (n==2)
            {
                System.out.println(i);
            }}
        }
    }
}
