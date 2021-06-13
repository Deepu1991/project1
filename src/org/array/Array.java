package org.array;

public class Array {
	
	
		
	
	public static void main(String[] args) {
	 int a[]= {1,2,3,4,5,6,7,8,9,10};
			int sum=0;
			int i;
			int length=a.length;
			for(i=0;i<a.length;i++) {
				sum+=a[i];
				
				
			}
			float avg=sum/a.length;

			System.out.println("Sum of the values:"+sum);
		System.out.println("Average:"+avg);
	}

}
