package Projects_02;

public class maxNumber {
public static void main(String[] args) {
	


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */

int[][] arr={{1 , 2, 3}, {2, 3, 1,78} , {5, 5, 5} , {2, 10, 3,19}};
  int max=Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		if (arr[i][j]>=max) {
			max=arr[i][j];
		}
		
		
		
	}
}

System.out.println("AD arrayde en buyuk element  :  "+ max);
}
}
