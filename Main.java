//Basics
class Main {
	public static void main(String[] args){
		
	}
	
	public static boolean isPalindrome(String string) {
		char[] sequence = string.toCharArray();
		int length = sequence.length;
		boolean isPalindrome = true;

		for (int i = 0; i < length / 2; i++) {
			if (sequence[i] != sequence[length - i - 1]) {
				isPalindrome = false;
				break;
			}
		}

		return isPalindrome;
	}

	public static void sort(int[] numbers) {

		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int tmp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}

	}

	public static String reverse(String string) {
		char[] sequence = string.toCharArray();
		StringBuilder result = new StringBuilder("");
		for (int i = sequence.length - 1; i >= 0; i--) {
			result.append(sequence[i]);
		}
		return result.toString();
	}

	// 4-a
	public static void printXO() {
		char middle = 'O';

		for (int i = 0; i < 3; i++) {
			System.out.print('|');
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(middle);
					if (middle == 'O')
						middle = 'X';
					else
						middle = 'O';
				} else if (i == 2 && j == 1) {
					System.out.print(' ');
				} else if (i == 2 || j == 2) {
					System.out.print('X');
				} else {
					System.out.print('O');
				}
				System.out.print('|');
			}
			System.out.println();
		}
	}

	// 4-b
	/* not compelte*/
//	public static void showTriangle(int max) {
//		for (int i = 1; i <= max; i++) {
//			int j = 0;
//			for (; j <= i / 2; j++) {
//				System.out.print(j + " ");
//			}
//
//			System.out.print(j + " ");
//
//			for (; j > 0; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}

	// 5-
	// a- the value of execute(1)
}
