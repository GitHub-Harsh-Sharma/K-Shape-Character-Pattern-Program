import java.util.Scanner;
class chardataasciifor67
{
    public static void main(String[] args) 
    {
        int i,k,b=71,a,s,e=-1,f=70;
        for(i=1;i<=7;i++)
        {
            for(k=65;k<=b;k++)
            {
                System.out.print((char)k);
            }
            for(s=1;s<=e;s++)
            {
                System.out.print(" ");
            }
            for(a=f;a>=65;a--)
            {
                System.out.print((char)a);
            }
                System.out.println("");
            if(i!=1)
            f--;
            b=b-1;
            e=e+2;
        }
    }
}
