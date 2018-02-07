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
	public static void triangle(int n)
	{
	  int[][] arr = new int[9][9]; 

	  for (int i = 0; i < n; i++)
	  {

	    for (int j = 0; j <= i; j++)
	    {

	      if (i == j || j == 0)
	           arr[i][j] = 1;
	      else 
	           arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
	      System.out.print(arr[i][j]+" ");
	    }
	    System.out.println();
	  }
	}


	// 5-
	// a- the value of execute(1)
}
