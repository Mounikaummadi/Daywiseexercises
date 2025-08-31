package com.wipro.exercises;

public class ArrayDemo {

	public static void main(String[] args) {
//		int[] num= {1,2,3,4};
//		for(int i=0;i<num.length;i++) {
//			num[i]=num[i]*2;
//		}
//		for(int j=0;j<num.length;j++) {
//			System.out.println(num[j]);
//		}
//		int[] num={100,67,98,678,45,123};
//		int num2=0;
//		for(int i=0;i<num.length;i++) {
//			if(num[i]>num2) {
//				num2=num[i];
//			}
//		}
//		System.out.println(num2);
		int[] num= {10, 5, 20, 8, 15};
		int num2=0;
		int secondl=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>num2) {
				num2=num[i];
			}
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]!=num2 && num[i]>secondl) {
				secondl=num[i];
			}
		}
		System.out.println(secondl);
	}
}
