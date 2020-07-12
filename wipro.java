import java.util.*;
class Code1
{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String input1=s.next();
        int input2=s.nextInt();
        String output="NULL";
        char[] ch=input1.toCharArray();
        int[] op=new int[20];
        int r=0;
        String tst="";
        for (int i = 0; i < ch.length; i++)
        {
            if((ch[i]>=48)&&(ch[i]<=57))
            {
                op[r]=Character.getNumericValue(ch[i]);
                r++;
            }
            if((ch[i]>=97)&&(ch[i]<=122))
            {
                tst=tst+ch[i];
            }
            if((ch[i]>=65)&&(ch[i]<=90))
            {
                tst=tst+ch[i];
            }
        }
        int sum=0;
        if(input2==1)
        {
           if(tst=="")
            {
                output="ZERO";
            }
            else
            {
                output=tst;
            }
        }
        else
        {
            for(int i=0;i<r;i++)
            {
                sum=sum+op[i];
            }
            if(sum==0)
            {
                output="ZERO";
            }
            else
            {
                output=Integer.toString(sum);
            }
            
        }
        System.out.println(output);
    }
}
