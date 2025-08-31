package com.wipro.exercises;

public class RemoveDuplicates {

	public static void main(String[] args) {
//		int[] num= {1,1,2,2,3,4,4,5};
//		int[] num1= {};
//		for(int i=0;i<num.length;i++) {
//			if() {
//				num1[i]=num[i];
//			}
//		}
//		System.out.println(num1);
//		int target=9;
//		int[] arr= {2,7,11,15};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.printf("%d %d",i,j).println();
//				}
//			}
//		}
		int target=9;
		int[] arr= {2,7,11,15};
		for(int i=0;i<arr.length;i++) {
			if((i+1<arr.length) && (arr[i]+arr[i+1]==target)){
				System.out.printf("%d %d",i,i+1).println();
			}
		}


	}
}
