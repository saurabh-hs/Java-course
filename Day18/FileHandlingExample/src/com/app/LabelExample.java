package com.app;

public class LabelExample {

	public static void main(String[] args) {
//		outerLoop:
//		for(int i = 0; i <= 10; i++) {
//			innerLoop:
//			for(int j = 0; j <=i; j++) {
//				if(j == 3) break innerLoop;
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		outerLoop:
		for(int i = 0; i <= 18; i++) {
			int j = 0;
			innerLoop:
			while(j <= 5) {
				if(j == 4) break innerLoop;
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
		}

	}

}
