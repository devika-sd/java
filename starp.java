class doubt
{
public static void main(String args[])
{
int i,j,k,m,l=4;
for(i=0;i<5;i++)
{
	for(j=5;j<=0;j--)
	{
	m=0;
		for(k=j-1;k<=l;k++)
		{
			while(m<=8)
			{
			 if((m>=k)&&(m<=l))
			 {
				System.out.print("*");
			 }
			 else
			 {
				System.out.print(" ");
			 }
			 m++;
			}
		}
	l++;
	}
}
}
}