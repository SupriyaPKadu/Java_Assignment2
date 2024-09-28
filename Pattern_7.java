package Assignment27_09_24;

public class Pattern_7 {

	public static void main(String[] args) {
		int col = 1;
		for (int i = 1; i <= 5; i++) // row
		{
			for (int j = 0; j < col; j++) // col
			{
				System.out.print(i+" ");
			}
			col++;
			System.out.println();
		}
	}

}
//OUTPUT
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/