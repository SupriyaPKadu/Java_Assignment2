package Assignment27_09_24;

public class Pattern_21 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j)
					System.out.print("O" + " ");
				else
					System.out.print("X" + " ");
			}
			System.out.println();
		}

	}

}
//OUTPUT
/* 

O X X X X 
X O X X X 
X X O X X 
X X X O X 
X X X X O 

*/