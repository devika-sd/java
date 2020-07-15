public class Arrayfun {
	public static void main(String args[]) {
		int[] arr1 = new int [] {11,22,33,44,55,22,44,33};
		int[] arr2 = new int [arr1.length];
		System.out.println("coping all elements of one array into another");
		System.arraycopy(arr1,0,arr2,0,arr1.length);
		for(int i:arr1) {
		   System.out.print(i +" ");
		}
		System.out.println("\n");
		System.out.println("Frequency of elements in the array");
		int b[] = new int[arr1.length];
		int flag = -1;
		for(int i=0;i<arr1.length;i++){
		int count = 1;
		for(int j=i+1;j<arr1.length;j++){
		if(arr1[i] == arr1[j]){
		  count = count + 1;
		  b[j] = flag;
		}
		if(b[i]!=flag) {
		  b[i] = count;
		}
		}
		}
		for(int k=0;k<arr1.length;k++){
		  if(b[k] != flag) {
		    System.out.println(arr1[k]+": "+b[k]);
		   }
		}
		System.out.println("\n");
		System.out.println("Left rotation of the array:");
		for(int i=1;i<arr1.length;i++){
	        	   System.out.print(arr1[i]+" ");
	    	}
	   	System.out.print(arr1[0]);
		System.out.println("\n");
		System.out.println("Duplicate elements of an array");
		for(int i=0;i<arr1.length;i++) {
		   for(int j=i+1;j<arr1.length;j++) {
		        if(arr1[i] == arr1[j]) {
			System.out.print(arr1[j] +" ");
			}
		   }
		}
		System.out.println("\n");
		System.out.println("Elements in an array");
		for(int i=0;i<arr1.length;i++) {
		   System.out.print(arr1[i] +" ");
		}
		System.out.println("\n");
		System.out.println("Elements of an array in Reverse order");
		for(int i=arr1.length-1;i>=0;i--) {
		  System.out.print(arr1[i] +" ");
		}
		System.out.println("\n");
		System.out.println("Largest element in an array");
		int max=arr1[0];
		for(int i=0;i<arr1.length;i++) {
		  if(arr1[i] > max) {
			max = arr1[i];
		  }
		}
		System.out.print(max);
		System.out.println("\n");
		System.out.println("Smallest element in an array");
		int min=arr1[0];
		for(int i=0;i<arr1.length;i++) {
		  if(arr1[i] < min) {
			min = arr1[i];
		  }
		}
		System.out.print(min);
		System.out.println("\n");
		System.out.println("Elements of an array present on even position");
		for(int i=1;i<arr1.length;i=i+2) {
		  System.out.print(arr1[i] +" ");
		}
		System.out.println("\n");
		System.out.println("Elements of an array present on odd position");
		for(int i=0;i<arr1.length;i=i+2) {
		  System.out.print(arr1[i] +" ");
		}
		System.out.println("\n");
		System.out.println("Number of elements present in an array ");
		System.out.println(arr1.length);
		System.out.println("\n");
		System.out.println("Sum of all the items in an array");
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
		sum= sum+arr1[i];
		}
		System.out.println(sum);
	}
}
