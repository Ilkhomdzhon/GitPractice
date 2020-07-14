package com.java.practise01;

class Main{
  
  public static int maxValue(int[] max) {
    int maximum = max[0];   
    for (int i=1; i<max.length; i++) {
        if (max[i] > maximum) {
            maximum = max[i];  
    }
  
}
	return maximum;
}

	public static void main(String[] args) {
		int[] arr = {5,12,-3,7,3,22};
		System.out.println(maxValue(arr)); //should print 22
	}
	
	
}