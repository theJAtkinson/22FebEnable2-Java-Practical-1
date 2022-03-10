package com.qa.main.uniquesum;

public class UniqueSum {
	
	public static int uniqueSum(int int1, int int2, int int3) {
		Integer sum1 = int1;
		Integer sum2 = int2;
		Integer sum3 = int3;
		
		if(sum1.equals(sum2) || sum1.equals(sum3)) {
			int1 = 0;
		}
		
		if(sum2.equals(sum1) || sum2.equals(sum3)) {
			int2 = 0;
		}
		
		if(sum3.equals(sum1) || sum3.equals(sum2)) {
			int3 = 0;
		}
		
		return int1+int2+int3;
	}
}
