class program
{
public static void main(String args[])
{
	int i,j,k,l;
	char a[]={'p','r','o','g','r','a','m'}; 
	i=0;
	j=6;
	for(l=0;l<7;l++)
	{
	for(k=0;k<7;k++)
	{
		if(i==k)
		{
			System.out.print(a[i]);
		}
		else if(j==k)
		{
			System.out.print(a[j]);
		}
		else
		{
			System.out.print(" ");
		} 
	
	}
	i++;
	j--;
	System.out.println();
	}
}
}