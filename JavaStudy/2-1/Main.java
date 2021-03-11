package study;

import javax.swing.plaf.basic.BasicTreeUI.NodeDimensionsHandler;

public class Main {
	public static void main(String[] args) {

        String	 firstName = "Kurumi";
		String lastName = "Toishi";
		System.out.println(getName(firstName,lastName));
		System.out.println();

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int num=0; num<=9;num++) {
			isOdd(num);
		}
	}
	public static String getName(String firstName,String lastName) {
		return  lastName + firstName;
	}
	public static void isOdd(int num) {
		if(num % 2 != 0) {
			System.out.println(num +"は奇数です。");
		}
	}


}
