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
		System.out.println();
		printShortBinary((short) 31456);
		System.out.println();
		printIntBinary(234685);
		System.out.println();
		printLongBinary(46456872);
	}
	
	public static void printByteBinary(byte b) {
		int[] dec = DecimalToBinary.run(b);
		for (int i1 : dec) {
			System.out.print(i1);
		}
	}
	
	public static void printShortBinary(short s) {
		int[] dec = DecimalToBinary.run(s);
		for (int i1 : dec) {
			System.out.print(i1);
		}
	}
	
	public static void printIntBinary(int i) {
		int[] dec = DecimalToBinary.run(i);
		for (int i1 : dec) {
			System.out.print(i1);
		}
	}
	
	public static void printLongBinary(long l) {
		int[] dec = DecimalToBinary.run((int) l);
		for (int i1 : dec) {
			System.out.print(i1);
		}
	}
}
