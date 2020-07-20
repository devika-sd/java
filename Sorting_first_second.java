import java.util.*;
class Sorting_first_second {
	public static void main(String args[]) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   for(int i=0 ; i<n ; i++) {
	     arr[i]=s.nextInt();
	   }
	   Arrays.sort(arr);
	   for(int i=0;i<n/2;i++) {
	       System.out.print(arr[i]+" ");
	    }
	    for(int j=n-1;j>=n/2;j--) {
	        System.out.print(arr[j]+" ");
	     }
}
}   
