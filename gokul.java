
import java.util.Scanner;


public class gokul {
    public static void main(String args[])
            {
long x,fact=1;
Scanner input=new Scanner(System.in);
System.out.print("Enter the Integer :");
x=input.nextInt();
for(int i=1;i<=x;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
    
}
