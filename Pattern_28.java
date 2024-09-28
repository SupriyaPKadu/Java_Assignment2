package Assignment27_09_24;

public class Pattern_28 {
	public static void main(String[] args) {
	 for (int i = 0; i < 5; i++) { 
         for (int j = 0; j < 5; j++) { 
             // Determine when to print '*'
             if (j == i || j == (5 - 1 - i)) { 
                 System.out.print("*"); 
             } else {
                 System.out.print(" "); 
             }
         }
         System.out.println(); // Move to the next line
     }
 }
}
//OUTPUT
/*
 
*   *
 * * 
  *  
 * * 
*   *
 
*/
