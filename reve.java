import java.util.*;
class reve
{
	public static void main(String args[])
	{
		reve c=new reve();
		String str=c.fun("Hello master",3);
		System.out.println(str);
	}
	public String fun(String str1,int size)
	{
		int i,j,k;
		j=size;
		k=0;
		char[] str=new char[str1.length()];
		for(i=0;i<str1.length();i++)
		{
			j--;
			str[i]=str1.charAt(j);
			if(j==k)
			{
				k=k+(size);
				j=k+3;
			}
		}
		String fin=new String(str);
		return fin;
	}
}
