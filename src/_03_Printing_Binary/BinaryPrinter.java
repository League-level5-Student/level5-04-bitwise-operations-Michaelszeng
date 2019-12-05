package _03_Printing_Binary;

import _00_Binary_Conversion.DecimalToBinary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		printByteBinary((byte) 127);
		//System.out.println();
		printShortBinary((short) 31456);
		//System.out.println();
		printIntBinary(234685);
		//System.out.println();
		printLongBinary(46456872);
	}
	
	public static void printByteBinary(byte b) {
		int binTesterLength = 0;
		while(Math.pow(2, binTesterLength) < b) {
			binTesterLength++;
		}
		////System.out.println(Math.pow(2, binTesterLength-1));
		int binTesterInt = (int) Math.pow(2, binTesterLength-1);
		String binB = "";
		while (binTesterInt > 0) {
			//System.out.println(binTesterInt);
			int result = binTesterInt & b;
			////System.out.println(result);
			if (result > 0) {
				binB += "1";
			}
			else {
				binB += "0";
			}
			binTesterInt = binTesterInt >> 1;
			////System.out.println(binTester);
		}
		System.out.println(binB);
	}
	
	public static void printShortBinary(short s) {
		int binTesterLength = 0;
		while(Math.pow(2, binTesterLength) < 2) {
			binTesterLength++;
		}
		////System.out.println(Math.pow(2, binTesterLength-1));
		int binTesterInt = (int) Math.pow(2, binTesterLength-1);
		String binB = "";
		while (binTesterInt > 0) {
			//System.out.println(binTesterInt);
			int result = binTesterInt & 2;
			////System.out.println(result);
			if (result > 0) {
				binB += "1";
			}
			else {
				binB += "0";
			}
			binTesterInt = binTesterInt >> 1;
			////System.out.println(binTester);
		}
		System.out.println(binB);
	}
	
	public static void printIntBinary(int i) {
		int binTesterLength = 0;
		while(Math.pow(2, binTesterLength) < i) {
			binTesterLength++;
		}
		////System.out.println(Math.pow(2, binTesterLength-1));
		int binTesterInt = (int) Math.pow(2, binTesterLength-1);
		String binB = "";
		while (binTesterInt > 0) {
			//System.out.println(binTesterInt);
			int result = binTesterInt & i;
			////System.out.println(result);
			if (result > 0) {
				binB += "1";
			}
			else {
				binB += "0";
			}
			binTesterInt = binTesterInt >> 1;
			////System.out.println(binTester);
		}
		System.out.println(binB);
	}
	
	public static void printLongBinary(long l) {
		int binTesterLength = 0;
		while(Math.pow(2, binTesterLength) < l) {
			binTesterLength++;
		}
		////System.out.println(Math.pow(2, binTesterLength-1));
		int binTesterInt = (int) Math.pow(2, binTesterLength-1);
		String binB = "";
		while (binTesterInt > 0) {
			//System.out.println(binTesterInt);
			long result = binTesterInt & l;
			////System.out.println(result);
			if (result > 0) {
				binB += "1";
			}
			else {
				binB += "0";
			}
			binTesterInt = binTesterInt >> 1;
			////System.out.println(binTester);
		}
		System.out.println(binB);
	}
}
