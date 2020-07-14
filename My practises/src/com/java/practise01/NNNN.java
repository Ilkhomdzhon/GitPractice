package com.java.practise01;

public class NNNN {

	public static void main(String[] args) {
	
				int[][] a = {
					{1,1,2}, //sum = 4
					{3,1,2}, //sum = 6
					{3,5,3}, //sum = 11
					{0,1,2}  //sum = 3
				};
				int sum = 0; 
				for (int i=0; i<a.length;i++) {
					for (int t=0;t<a[i].length;t++) {
						sum=sum+a[i][t];
					}
					System.out.println(sum);
					sum=0;
				}
	}
}
