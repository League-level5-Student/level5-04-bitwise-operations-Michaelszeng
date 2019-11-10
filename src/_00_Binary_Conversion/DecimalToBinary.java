package _00_Binary_Conversion;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DecimalToBinary {
	public static void main(String[] args) {
		//Converting a decimal number to binary is a little trickier.
		
		//EXAMPLE: Convert 43 to binary
		
		/*
		 * Step 1: Start with one and add a digit the left that is double the value of the previous number.
		 *         Stop when you've passed the target number        
		 *         eg. 43
		 *         	64	32	16	8	4	2	1
		 *        
		 *	Step 2: Remove the left most value (the one that is higher than the target). 
		 *			eg. 43
		 *         	32	16	8	4	2	1
		 *         
		 *  Step 3: Find the combination of values that add up to the target number.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *  Step 4: Every matching number in the list is a 1, and non-matching is a 0.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *          1    0   1   0   1   1
		 *          32	16	 8	 4	 2	 1
		 *         
		 *         43 in decimal is 101011 in binary!
		 */
		String decStr = JOptionPane.showInputDialog("number: ");
		int decNum = Integer.parseInt(decStr);
		int greatest = 0;
		int counter = 0;
		while (greatest < decNum) {
			greatest = (int) Math.pow(2, counter);
			counter++;
		}
		greatest = (int) Math.pow(2, counter-2);
		//System.out.println(greatest);
		int[] binNum = new int[counter-1];
		binNum[0] = 1;
		for (int i=1; i<counter-2; i++) {
			binNum[i] = 0;
		}
		for (int i=counter-3; i>-1; i--) {
			String num = "";
			for (int in : binNum) {
				num = num + in;
			}
			//System.out.println(num);
			int dec = 0;
			for (int j =0; j<num.length(); j++) {
				String c = num.substring(num.length()-j-1, num.length()-j);
				int c1 = Integer.parseInt(c);
				dec += c1 * Math.pow(2, j);
			}
			//System.out.println(dec);
			if (dec + (int) Math.pow(2, i) <= decNum) {
				binNum[counter-2-i] = 1;
			}
			else {
				binNum[counter-2-i] = 0;
			}
		}
		String num = "";
		for (int in : binNum) {
			num = num + in;
		}
		System.out.println(num);
	}
}
