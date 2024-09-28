package Assignment27_09_24;

public class Pattern_4 {

	public static void main(String[] args) {

		char ch = 'A';

		for (int i = 0; i < 5; i++) // row
		{
			for (int j = 0; j < 5; j++) // col
			{
				System.out.print((char) (ch + i + j) + " ");

			}

			System.out.println();
		}

	}
}
//OUTPUT
/*
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I
	 */