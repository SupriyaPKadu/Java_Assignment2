package Assignment27_09_24;

public class Pattern_25 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
//OUTPUT
/*

* * * * * 
*       * 
*       * 
*       * 
* * * * * 

*/