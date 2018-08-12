class doubt
{
public static void main(String args[])
{
int i,k,m,l=4;
char t='*';
	for(i=0;i<5;i++)
	{	
		k=4;
		l=4;
		m=0;
		while(m<=8)
		{
		      if((i+2)%2==0)
		      {
			if((m>=l))
			{
				if((m%2==0)&&(m<=k))
		     		{
				System.out.print(t);
				}
				else
				{
				System.out.print(" \t");
				}
			}
			else
			{
				System.out.print(" \t");
			}
		      }
		      
		      if(i%2==0)
		      {
			if((m>=l))
			{
				if((m%2!=0)&&(m<=k))
		     		{
				System.out.print(t);
				}
				else
				{
				System.out.print(" \t");
				}
			}
			else
			{
				System.out.print(" \t");
			}
		      }
		   
		      
		m++;
		}
		k++;
		l--;
	System.out.println();
	}
}
}