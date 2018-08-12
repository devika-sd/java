class success
{
public static void main(String args[])
{
int i,k,m,l=4;
char t='*';
k=4;
for(i=0;i<5;i++)
{
	m=0;
	while(m<=8)
	{
	if((i+2)%2==0)
	{
		if(m>=l)
		{
			if((m%2==0)&&(m<=k))
			{
			System.out.print(t);
			}
			else
			{
			System.out.print(" ");
			}
		}
		else
		{
			System.out.print(" ");
		}
	}
	if(i%2!=0)
	{
		if(m>=l)
		{
			if((m%2!=0)&&(m<=k))
			{
			System.out.print(t);
			}
			else
			{
			System.out.print(" ");
			}
		}
		else
		{
			System.out.print(" ");
		}
	}
	m++;
	}
	l--;
	k++;
	System.out.println();
}	
}
}