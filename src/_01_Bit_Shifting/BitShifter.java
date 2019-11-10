package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		System.out.println(decToBin(num));
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	public static String decToBin(int decNum) {
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
		return num;
	}
}
