package Assignment27_09_24;

public class Pattern_27 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {

				if (k == 1 || i == 5 || k == (2 * i - 1)) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
	}
}
//OUTPUT
/*

    *
   * *
  *   *
 *     *
*********

*/