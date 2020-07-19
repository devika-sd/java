import java.util.*;
class Sorting_even_odd {
	public static void main(String args[]) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   for(int i=0 ; i<n ; i++) {
	     arr[i]=s.nextInt();
	   }
	   Arrays.sort(arr);
	   for(int j=arr.length-1;j>=0;j--) {
	   if(arr[j]%2 != 0) {
	      System.out.print(arr[j] +" ");
	    }
	   }
	   for(int i=0;i<arr.length;i++) {
	   if(arr[i]%2 == 0) {
	      System.out.print(arr[i] +" ");
	    }
	   }
}
}
