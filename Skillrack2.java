import java.util.ArrayList;
import java.util.Scanner;

public class skillrack2 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ip=s.next();
        ArrayList<String> ch= returnchar(ip);
        Integer[] val=returnintvalue(ip);
        for(int i=0;i<ch.size();i++)
        {
            for(int j=0;j<val[i].intValue();j++)
            {
                System.out.print(ch.get(i));
            }
        }
       // System.out.println(ch);
        //System.out.println(val);
    }
    public static ArrayList<String> returnchar(String ip)
    {
        ArrayList<String> al=new ArrayList<String>();
        String str="";
        for(int i=0;i<ip.length();i++)
        {
            if((ip.charAt(i)>=48)&&(ip.charAt(i)<=57))
            {
                if(str!="")
                {
                al.add(str);
                }
                str="";
            }
            else
            {
                str=str+ip.charAt(i);
            }
        }
        //System.out.println(al);
        return al;
    }
    public static Integer[] returnintvalue(String ip)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        String str="";
        for(int i=0;i<ip.length();i++)
        {
            if((ip.charAt(i)>=97)&&(ip.charAt(i)<=122))
            {
                if(str!="")
                {
                al.add(Integer.parseInt(str));
                }
                str="";
            }
            else
            {
                str=str+ip.charAt(i);
            }
        }
        al.add(Integer.parseInt(str));
        //System.out.println(al);
        Integer[] op=new Integer[al.size()];
        for(int i=0;i<al.size();i++)
        {
            op[i]=al.get(i);
        }
        return op;
    }
   
}
