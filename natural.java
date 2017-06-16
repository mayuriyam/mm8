import java.io.*;
import java.util.*;
class natural
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int i=1;
        int a=sc.nextInt();
        while(i<=a)
        {
            sum=sum+i;
            i+=1;
        }
        
        System.out.println(sum);
        
    }
}
