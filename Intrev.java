import java.util.Scanner;


public class Intrev {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        while(a!=0)
        {
            b=b*10;
          int x=a%10;
          b=b+x;
          a=a/10;
          
        }
        System.out.println(b);
    }
    
}
