class matrics
{
public static void main(String args[])
{
int i;
/*int[] c;
c=new int[10];
int[] d;
d=new int[10];
int[] e;
e=new int[10];
int[] f;
f=new int[10];*/
int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
set(0,0);
	/*for(i=0;i<4;i++)
	{
	System.out.print(c[i]+" ");
	}*/
set(0,2);
	/*for(i=0;i<4;i++)
	{
	System.out.print(d[i]+" ");
	}*/
set(2,0);
	/*for(i=0;i<4;i++)
	{
	System.out.print(c[i]+" ");
	}*/
set(2,2);
	/*for(i=0;i<4;i++)
	{
	System.out.print(c[i]+" ");
	}*/
}
public static int set(int a,int b)
{
int i,j,k=0;
int[] c;
c=new int[50];
//int[] d;
//d=new int[50];
for(i=a;i<2+a;i++)
{
	for(j=b;j<2+b;j++)
	{
		c[k]=a[i][j];
		System.out.print(c[k]);
		//d[k]=c[k];
		k++;
	}
}
System.out.println();
//return d;
}
}
