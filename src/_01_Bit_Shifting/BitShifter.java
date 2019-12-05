package _01_Bit_Shifting;

import _00_Binary_Conversion.BinaryToDecimal;
import _00_Binary_Conversion.DecimalToBinary;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 39;
		int numShifted = num << 2; //39 << 2 = 156;  100111 --> 10011100
		int[] numBin = DecimalToBinary.run(num);
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(num);
		System.out.println(numShifted);
		int[] numShiftedBin = DecimalToBinary.run(numShifted);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		for (int i : numBin) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : numShiftedBin) {
			System.out.print(i);
		}
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
