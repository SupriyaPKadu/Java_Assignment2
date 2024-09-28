package Assignment27_09_24;

public class Pattern_20 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2)
					System.out.print("X" + " ");
				else
					System.out.print("0" + " ");
			}
			System.out.println();
		}

	}

}
//OUTPUT
/*
0 0 X 0 0 
0 0 X 0 0 
X X X X X 
0 0 X 0 0 
0 0 X 0 0 
*/